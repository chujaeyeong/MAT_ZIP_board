# [팀프로젝트] 맛.JAVA - 맛.ZIP
#### 💡 맛.ZIP은 “진짜 믿고 먹을 수 있는 맛집” 을 공유하는 플랫폼입니다.
* 맛.JAVA 팀은 맛집 탐방에 누구보다 진심인 사람들이 뭉친 팀입니다. 🍔
* 평소에 모두가 겪고 있던 부정한 광고, 믿을 수 없는 후기 속에서 소비자들이 믿고 방문할 수 있는 맛집을 모아 볼 수 있는 사이트의 필요성을 느꼈습니다.
* 그래서, 영수증 2회 이상 인증된 맛집만 등록되도록 해서 신뢰도 및 만족도가 높은 맛집만 선별하여 소비자에게 제공하는 목적으로 개발을 진행했습니다.
* 국내 운영 중인 맛집 추천 사이트, 대형 포털 지도 사이트의 사례 분석을 통해, 웹사이트 기능의 방향성을 "진정성 있는 맛집 공유"로 초점을 맞췄습니다.
* 맛집을 좋아하는 사람들 뿐만 아니라, 맛집을 좋아하는 사람들의 방문을 원하는 요식업계 사장님들도 타켓팅한 사장님 전용 구독 서비스 및 노출 배너 광고를 BM으로 설정했습니다.

<br>

## 1. 제작 기간
#### `2023년 4월 28일 ~ 6월 9일 (1개월)`

<br>

## 2. 사용 기술
### `Back-end`
* Java 8
* Spring Framework 5.0.1, Spring MVC
* Junit5
* Maven
* Mybatis
* Eclipse, Visual Studio Code

### `Front-end`
* HTML
* CSS
* JavaScript
* JQuery 3.6.4
* BootStrap 4.1

### `DevOps`
* AWS EC2, S3, RDS, CloudFront, Route 53, ALB
* Tomcat 8.5
* MySQL 8.0.32

### `Collaboration`
* Git, Sourcetree 
* Slack 
* Notion

<br>

## 3. 기능 구현

* #### `[추재영] 회원 커뮤니티`
  * 맛집에 관심이 있는 소비자가 이용하는 커뮤니티로, 리뷰 / 사진 / 지유게시판으로 나누어 유저 용도에 따라 세부 메뉴 분류
  * 각 게시판별 게시물 CRUD 기능 및 댓글 insert 기능
  * 리뷰게시판은 영수증 등록 여부를 체크하여 영수증 등록을 한 유저만 리뷰를 남길 수 있도록 제약사항을 추가하여 리뷰의 신뢰도를 강화함.
  
  <br>
  
  * <img src ="https://github.com/chujaeyeong/MAT_ZIP_readme_chujy/assets/123634960/eac545ae-84b0-4d6a-8d25-6ccd41ef3b17" width="600" height="350" /> 

<br>


## 4. ERD 설계
<img src="https://user-images.githubusercontent.com/123634960/242927505-6d8c1885-fd63-41a2-84c7-c521fcce39e7.png">


<br>


## 5. 핵심 기능 설명 & 트러블 슈팅

#### [추재영] 회원 커뮤니티
<details>
  <summary>📌 핵심 기능 설명</summary>
	
  ##### `1. 유저의 영수증 등록 여부를 체크한 리뷰 작성 기능`
  * 회원 커뮤니티 내 리뷰 게시판은 유저가 리뷰를 작성하고, 다른 사람들의 리뷰에 댓글을 남길 수 있는 구조의 게시판 페이지로 구현.
	* 리뷰에 신뢰도를 높이기 위해, 유저의 영수증 등록 여부 판단이 필요함.
	* 영수증을 다수의 식당에 등록하고 리뷰를 작성할 때, 리뷰를 남기고 싶은 영수증을 선택하는 form으로 먼저 이동이 필요함.
  * 리뷰게시판 (Review...) 게시물 등록 로직을 처리하기 위해 registerAndSearch 패키지 안에 있는 MZRegisterInfoVO 와 RestaurantVO의 사용이 필요함. 두 model 모두 다른 패키지에 있지만, public 메소드로 작성되어있기 때문에 board 패키지에 동일 model을 만들지 않고 MZRegisterReceiptDTO 만 생성하여 mzRegisterInfoVO와 restaurantVO를 사용할 수 있도록 함.
  * ReviewMapper.xml에서 mzregisterinfo 와 restaurant 테이블을 join 해서 영수증 정보와 식당 정보를 추출하는 getReceiptWithRestaurant 쿼리 작성. (mzregisterinfo 테이블의 storePhoneNumber 컬럼 데이터와 restaurant 테이블의 tel 컬럼 데이터가 일치하는 restaurant 테이블의 name 컬럼 데이터를 상호명으로 추출)
  * 영수증 1장으로 리뷰를 다회 작성을 막기 위해 cs_review 테이블에 receipt_id 컬럼 (mzregisterinfo의 no 컬럼 데이터를 가져와서 저장) 데이터를 제외하고 영수증 정보와 식당 정보를 추출.
  * **‼결과‼** writeReview로 이동하면 getReceiptWithRestaurant 쿼리를 수행하여 영수증의 상호명 + 주소 가 radio form으로 브라우저에 출력, 유저가 리뷰를 작성할 영수증을 선택하고 리뷰 작성 form으로 이동하도록 구현. (영수증을 등록하지 않은 유저가 writeReview 으로 이동하면 alert 창을 보여주고 리뷰게시판으로 리다이렉트됨.)
	
  ##### `2. 리뷰 본문에서 특정 키워드 추출하여 이모티콘 조회 기능`
  * 유저가 리뷰를 작성 후 제출하기 전에, 이모티콘 조회 버튼을 클릭하면 식당 방문 시 참고할 수 있는 주요 키워드 (ex. 주차, 맛, 청결, 가성비 등) 를 검색해서 이모티콘을 출력해주는 기능을 리뷰 작성 form 에 추가.
  * 기존에는 네이버 Sentiment API를 활용하려고 했으나, 긍정/부정 파트를 퍼센트로 판단해주는 기능이라 다양한 키워드를 검색 후 출력이 필요한 지금 상황에는 API가 약간 맞지 않다고 판단하여 MySQL에 키워드와 이모티콘을 저장한 emojiMap 테이블을 DB에 생성하여 키워드를 저장하는 작업을 진행. (형태소 분리가 필요하지만 일단 테스트)
  * ReviewMapper.xml 에 추가하는 쿼리문에서는 emojiMap 데이터 전체 SELECT 쿼리 , Service 계층에서 리뷰 본문과 emojiMap 테이블의 keyward 컬럼 데이터를 비교해서 일치하는 emoji 컬럼 데이터를 추출 후 모델에 저장하는 작업을 수행.
  * **‼결과‼** 리뷰 작성 form (insertReview) 에서 리뷰 본문을 모두 입력 하고, 이모티콘 조회 버튼을 클릭하면 ajax로 리뷰 하단 div에 추출된 이모티콘이 출력되는 방식으로 비동기처리 이모티콘 조회 기능을 구현. 
	
  ##### `3. 3개의 세부 게시판별 CRUD 기능`
  * 유저가 상황에 맞게 이용할 수 있도록 게시판의 카테고리를 분할, 각 게시판별 CRUD 기능 추가. 게시물 insert 기능은 회원만 접근 가능하도록 작성 버튼을 user_id 세션이 잡혀있는 경우에만 브라우저에 출력되도록 코드 작성, 네비게이션바를 통해 로그아웃하고 브라우저 뒤로가기로 게시물 작성 페이지에 접근했을 때 alert 창 출력 후 게시물 목록 페이지로 리다이렉트 될 수 있도록 예외처리 진행.
  * 상대적으로 기능이 간단한 자유게시판은 Service 계층을 나누지 않았고, 자유게시판 기능 구현 완료 후 리뷰게시판과 사진게시판은 Service 계층을 나누어 기능 추가.
  * 게시판별 제목 search form 추가하여 특정 키워드를 검색할 시 제목에 해당 키워드가 포함되어 있는 게시물 list를 ajax 비동기처리로 브라우저에 출력.
  * 게시판에 필요한 조회수 증가 / 댓글 작성 기능 각 세부 카테고리 게시판에 추가.
  * 게시물 insert 기능은 회원만 접근이 가능하도록 세션 
  * **‼결과‼** 각 세부 카테고리 게시판의 기본 CRUD, 댓글 insert 기능을 구현 완료. 
	
</details>
	
<details>
  <summary>⚽ 트러블 슈팅</summary>

  ##### `1. 영수증 등록 후 리뷰 작성 시 영수증 list를 출력하지 못하는 문제`
  * 리뷰 등록 시, 먼저 영수증 등록 정보를 writeReview.jsp 로 페이지 이동하여 출력해야되는데, receiptList (영수증의 리스트) 의 모든 요소가 null로 출력되는 문제가 발생함. 디버깅 했더니  receiptList의 size (리뷰할 영수증의 갯수) 는 정상적으로 콘솔창에 출력되고 있음.

<details>
  <summary>👉 문제가 있던 쿼리 확인</summary>
  <div markdown="1">    

  ```java
	<!-- 영수증 등록 정보를 가져오자 -->
	<select id="getReceiptWithRestaurant" parameterType="String" resultType="MZRegisterReceiptDTO">
		SELECT r.*, m.* 
		FROM mzRegisterInfo m 
		JOIN restaurant r ON m.storePhoneNumber = r.tel 
		WHERE m.userID = #{user_id} 
		AND m.no NOT IN 
		(SELECT receipt_id FROM MAT_ZIP.cs_review)
    </select>

  ```
  </div>
</details>
	
  * 1️⃣ 첫 번째 시도 : 쿼리 작성에서 오타나 잘못 작성된 부분이 있을 수도 있어서, getReceiptWithRestaurant 쿼리를 그대로 MySQL 스크립트에서 실행함. -> 쿼리에 문제 없음. 정상적으로 mzregisterinfo 테이블과 restaurant 테이블을 join 하고, 더미데이터로 추가해둔 cs_review 테이블의 receipt_id도 정상적으로 제외하여 리뷰를 작성할 데이터만 select 하는 것을 확인.
  * 2️⃣ 두 번째 시도 : MZRegisterReceiptDTO 에 추가한 MZRegisterInfoVO와 RestaurantVO에 쿼리 결과가 매핑되지 못했을 수도 있음. -> ReviewMapper.xml 에 추가한 쿼리 결과의 각 열이 MZRegisterInfoVO와 RestaurantVO의 필드와 일치하는 것을 확인함.
  * 3️⃣ 세 번째 시도 : MZRegisterReceiptDTO 클래스의 toString() 메서드가 MZRegisterInfoVO와 RestaurantVO의 toString() 메서드를 호출하는지 확인 -> MZRegisterReceiptDTO, MZRegisterInfoVO, RestaurantVO 클래스의 toString() 메서드는 딱히 문제 없이 잘 작성되었음을 확인함. 
  * **‼원인‼** SQL 쿼리 결과 매핑 문제임을 확인함.	
	
<br>
	
  * 4️⃣ 네 번째 시도 : 더 정확한 매핑을 위해 MyBatis의 resultMap을 이용해서 SQL 쿼리 결과를 올바르게 MZRegisterReceiptDTO 객체에 매핑 시도
	* 이전 쿼리문에서는 resultType="MZRegisterReceiptDTO" 을 통해 DTO에 매핑을 했지만, MyBatis의 resultMap은 SQL 쿼리 결과를 도메인 모델 또는 DTO 객체에 매핑하는 역할을 한다고 함. 
	* MyBatis의 resultMap은 일반적인 resultType 매핑보다 더 세밀하게 컨트롤 할 수 있는데, 나처럼 쿼리가 DB에서도 잘 작동하도록 작성했는데도 매핑을 하지 못해 에러가 발생할 때는 resultMap으로 세밀하게 매핑을 하는 방법이 있다고 하여 적용해보기로 함.
	 
	<div markdown="1">    
		
  	```java	
	<!-- resultMap 매핑 예시 쿼리 -->
	<resultMap id="yourResultMap" type="com.yourpackage.YourDTO">
	    <result property="propertyOfYourDTO" column="columnOfYourSQLResult"/>
	    <!-- more result mappings... -->
	</resultMap>
  	```
		
  	</div>

	* 나는 항상 resultType으로 도메인 모델 (VO) 에 매핑을 했는데, 이번에 resultMap에 대해서 알게 됨. 보통 resultMap은 이런 구조로 코드를 작성할 수 있음. 여기서 id는 resultMap의 고유 식별자, type은 결과를 매핑할 DTO의 풀 클래스 이름이고, result 요소는 SQL 결과의 열(column)과 DTO의 속성(property)을 매핑함.
	* 단순히 DTO의 속성 이름이 SQL 결과의 열 이름과 정확히 일치하지 않는 경우 또는 복잡한 객체 구조를 가진 DTO에 결과를 매핑해야 하는 경우에 resultMap을 사용하면 유용하다고 함. 난 다소 복잡한 DTO (모델 2개를 합쳐서 DTO를 만들었음) 를 사용하기때문에 후자인 것으로 추정.
	
	<br>
	
  * **‼결과‼** MyBatis의 resultMap으로 쿼리 매핑에 성공함! DTO에 주입했던 mzRegisterInfoVO 와 restaurantVO 의 필드를 mzregisterinfo 테이블과 restaurant 테이블의 컬럼에 하나하나 수동 매핑해줌. 수동 매핑 후 쿼리를 좀 더 상세하게 작성하여 리뷰 작성 시 영수증 list를 출력하는지 테스트한 결과, 원하는대로 상호명과 주소 정보가 잘 출력되는 것을 확인함.
	
<details>
  <summary>👉 수정하여 문제를 해결한 쿼리 확인 </summary>
  <div markdown="1">    

  ```java
	<!-- 영수증 등록 정보를 가져오자 -->
	<resultMap id="MZRegisterReceiptDTOMap" type="com.mat.zip.board.MZRegisterReceiptDTO">
	    <association property="mzRegisterInfoVO" javaType="com.mat.zip.registerAndSearch.model.MZRegisterInfoVO">
		<result property="no" column="m_no" />
		<result property="userId" column="m_userId" />
		<result property="storeAddress" column="m_storeAddress" />
		<result property="storePhoneNumber" column="m_storePhoneNumber" />
		<result property="buyTime" column="m_buyTime" />
	    </association>
	    <association property="restaurantVO" javaType="com.mat.zip.registerAndSearch.model.RestaurantVO">
		<result property="no" column="r_no" />
		<result property="landNumAddress" column="r_landNumAddress" />
		<result property="roadNameAddress" column="r_roadNameAddress" />
		<result property="name" column="r_name" />
		<result property="status" column="r_status" />
		<result property="tel" column="r_tel" />
		<result property="food" column="r_food" />
	    </association>
	</resultMap>

	<select id="getReceiptWithRestaurant" parameterType="String" resultMap="MZRegisterReceiptDTOMap">
	SELECT r.no as r_no, r.landNumAddress as r_landNumAddress, r.roadNameAddress as r_roadNameAddress,
	           r.name as r_name, r.status as r_status, r.tel as r_tel, r.food as r_food,
	           m.no as m_no, m.userId as m_userId, m.storeAddress as m_storeAddress,
	           m.storePhoneNumber as m_storePhoneNumber, m.buyTime as m_buyTime
	    FROM mzRegisterInfo m 
	    JOIN restaurant r ON m.storePhoneNumber = r.tel 
	    WHERE m.userID = #{user_id} 
	    AND m.no NOT IN 
	    (SELECT receipt_id FROM cs_review)
	</select>
  ```
	  
  </div>
</details>

  * **‼해석‼** MZRegisterInfoVO와 RestaurantVO의 각 필드와 SQL 쿼리 결과의 열을 매핑하기 위해 resultMap을 사용함. 
	resultMap 내에서 association 태그를 사용하여 복합 DTO 내의 두 개의 객체를 따로 관리 진행하고, 또한 SQL 쿼리에서는 각 필드에 별칭(alias)을 사용하여 resultMap에서 참조할 수 있도록 하고, 별칭을 사용하여 SQL 결과의 열과 DTO의 속성을 연결함
	
<br>
	
  * 💡 추가 ► 업데이트한 쿼리를 보면, cs_review (리뷰게시글 저장 테이블) 을 IN 서브쿼리를 사용해 데이터를 가져오는 것을 볼 수 있는데, IN 서브쿼리를 사용하면 추후에 대량 데이터를 처리하게 되는 경우에 성능 이슈를 불러올 수 있다는 문제점이 있는 쿼리임. 대량의 데이터를 처리하지 않을거면 뭐 고치지 않아도 상관은 없지만, 쿼리 성능 향상을 위해 JOIN 절을 하나 더 사용해서 쿼리 업데이트를 진행함.
	
<details>
  <summary>👉 성능을 업데이트한 쿼리 확인 </summary>
  <div markdown="1">    

  ```java
	<!-- 영수증 등록 정보를 가져오자 -->
	<resultMap id="MZRegisterReceiptDTOMap" type="com.mat.zip.board.MZRegisterReceiptDTO">
	    <association property="mzRegisterInfoVO" javaType="com.mat.zip.registerAndSearch.model.MZRegisterInfoVO">
		<result property="no" column="m_no" />
		<result property="userId" column="m_userId" />
		<result property="storeAddress" column="m_storeAddress" />
		<result property="storePhoneNumber" column="m_storePhoneNumber" />
		<result property="buyTime" column="m_buyTime" />
	    </association>
	    <association property="restaurantVO" javaType="com.mat.zip.registerAndSearch.model.RestaurantVO">
		<result property="no" column="r_no" />
		<result property="landNumAddress" column="r_landNumAddress" />
		<result property="roadNameAddress" column="r_roadNameAddress" />
		<result property="name" column="r_name" />
		<result property="status" column="r_status" />
		<result property="tel" column="r_tel" />
		<result property="food" column="r_food" />
	    </association>
	</resultMap>

	<select id="getReceiptWithRestaurant" parameterType="String" resultMap="MZRegisterReceiptDTOMap">
	    SELECT 
		    r.no as r_no, r.landNumAddress as r_landNumAddress, 
		    r.roadNameAddress as r_roadNameAddress, r.name as r_name, 
		    r.status as r_status, r.tel as r_tel, r.food as r_food,
		    m.no as m_no, m.userId as m_userId, m.storeAddress as m_storeAddress,
		    m.storePhoneNumber as m_storePhoneNumber, m.buyTime as m_buyTime
		FROM 
		    mzRegisterInfo m 
		JOIN 
		    restaurant r ON m.storePhoneNumber = r.tel 
		LEFT JOIN
		    cs_review cr ON m.no = cr.receipt_id
		WHERE 
		    m.userID = #{user_id} 
		    AND cr.receipt_id IS NULL;
	</select>
  ```
	  
  </div>
</details>
	
	
  * **‼해석‼** MZRegisterInfoVO와 RestaurantVO의 각 필드와 SQL 쿼리 결과의 열을 매핑하기 위해 resultMap을 사용한 것은 동일함. 영수증별 1개의 리뷰만 작성 하기 위해 (중복리뷰, 도배리뷰 방지) 사용했던 cs_review 테이블을 IN 서브쿼리를 사용해서 데이터를 불러온 것을  LEFT JOIN 하여, m.no와 cr.receipt_id가 일치하는 항목을 찾는 쿼리임. 그런 다음 cr.receipt_id가 NULL인 항목, 즉 cs_review 테이블에 해당 영수증이 없는 항목만을 선택합니다. 결론은 이전 쿼리랑 실행시키는 기능은 똑같고, 대량의 데이터를 처리하는 상황에서 좀 더 효율적인 성능을 발휘시키기 위해 IN 서브쿼리 사용 부분을 JOIN을 사용하는 것으로 변경함.
	
  * **‼결론‼** 보통은 resultType 을 이용하면 정상적으로 모델과 매핑할 수 있지만, 두개 이상 모델이나 다소 복잡한 DTO와 매핑을 진행할 때는 resultMap으로 세밀한 컨트롤을 하자! 라는 것을 학습.

	
	
</details>




