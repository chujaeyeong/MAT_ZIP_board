<%@page import="com.mat.zip.board.model.PostVO"%>
<%@page import="com.mat.zip.board.model.PostComVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
  <!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <link rel="shortcut icon" href="../resources/images/favicon.png" type="">

  <title>Mat.zip </title>

  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="../resources/css/bootstrap.css" />

  <!--owl slider stylesheet -->
  <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />
  <!-- nice select  -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css" integrity="sha512-CruCP+TD3yXzlvvijET8wV5WxxEh5H8P4cmz0RFbKK6FlZ2sYl3AEsKlLPHbniXKSrDdFewhbmBK5skbdsASbQ==" crossorigin="anonymous" />
  <!-- font awesome style -->
  <link href="../resources/css/font-awesome.min.css" rel="stylesheet" />

  <!-- Custom styles for this template -->
  <link href="../resources/css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="../resources/css/responsive.css" rel="stylesheet" />
  <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
  <link href="../resources/css/boss.css?ver=1" rel="stylesheet">

  <!-- w3 school bootstrap5 -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script> 
  
  <!-- board.css 파일을 추가 -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board.css">
  
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }
    th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
</style>

</head>

<body class="sub_page">

  <div class="hero_area">
    <div class="bg-box">
      <img src="../resources/images/hero-bg.jpg" alt="">
    </div>
    <!-- header section strats -->
    <header class="header_section" style="z-index: 100;">
      <div class="container">
        <nav class="navbar navbar-expand-lg custom_nav-container ">
          <a class="navbar-brand" href="${pageContext.request.contextPath}/index.jsp">
            <span>
              Mat.zip
            </span>
          </a>

          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class=""> </span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav  mx-auto ">
              <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/index.jsp">Home </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/boss/board_index.jsp">사장 커뮤니티 <span class="sr-only">(current)</span> </a>
              </li>
              <li class="nav-item active">
                <a class="nav-link" href="boardIndex.jsp">회원 커뮤니티 <span class="sr-only">(current)</span> </a>
              </li>
            </ul>
            <div class="user_option">
                  <g>
                    <g>
                      <path d="M345.6,338.862c-29.184,0-53.248,23.552-53.248,53.248c0,29.184,23.552,53.248,53.248,53.248
                   c29.184,0,53.248-23.552,53.248-53.248C398.336,362.926,374.784,338.862,345.6,338.862z" />
                    </g>
                  </g>
                  <g>
                    <g>
                      <path d="M439.296,84.91c-1.024,0-2.56-0.512-4.096-0.512H112.64l-5.12-34.304C104.448,27.566,84.992,10.67,61.952,10.67H20.48
                   C9.216,10.67,0,19.886,0,31.15c0,11.264,9.216,20.48,20.48,20.48h41.472c2.56,0,4.608,2.048,5.12,4.608l31.744,216.064
                   c4.096,27.136,27.648,47.616,55.296,47.616h212.992c26.624,0,49.664-18.944,55.296-45.056l33.28-166.4
                   C457.728,97.71,450.56,86.958,439.296,84.91z" />
                    </g>
                  </g>
                  <g>
                    <g>
                      <path d="M215.04,389.55c-1.024-28.16-24.576-50.688-52.736-50.688c-29.696,1.536-52.224,26.112-51.2,55.296
                   c1.024,28.16,24.064,50.688,52.224,50.688h1.024C193.536,443.31,216.576,418.734,215.04,389.55z" />
                    </g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
          <!--캘린더 들어갈 위치 -->
          <div style="width: 50px; height: 50px; ">
	          <a href="${pageContext.request.contextPath}/resources/images/c.png" data-title="오늘의 캘린더" data-lightbox="example-set" style="margin: 0px 0px;">
	          	<img src="${pageContext.request.contextPath}/resources/images/cal.png" style="width: 50px">
	          </a>
          </div>
          <!-- 로그인했을 시에 마이페이지 버튼 표시 -->
           <div class="client_section">
            <div class="box" style="margin: 10px;">
              <div class="user-img-box">
              	<c:if test="${user_id == null}">
              	<a href="${pageContext.request.contextPath}/mz_member/signUp">
                <img src="${pageContext.request.contextPath}/resources/images/basic.png" alt="" class="box-img" style="width: 50px;">
              	</a>
				</c:if>
              	<c:if test="${user_id != null}">
              	<a href="${pageContext.request.contextPath}/mz_member/myPage">
                <img src="${pageContext.request.contextPath}/resources/images/basic.png" alt="" class="box-img" style="width: 50px;">
              	</a>
				</c:if>
              </div>
            </div>
          </div>
            <c:if test="${user_id == null}">
	            <a href="${pageContext.request.contextPath}/mz_member/login" class="order_online">
	              LOGIN
	            </a>
			</c:if>
            <c:if test="${user_id != null}">
	            <a href="${pageContext.request.contextPath}/mz_member/logout" class="order_online">
	              LOGOUT
	            </a>
			</c:if>
            	<span onclick="openNav()" class="user_link" style="margin-left: 15px;">
              	</span>
				<!-- Nav -->
				<div id="myNav" class="overlay"style="width: 0%">
						<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">X</a>
					<div class="overlay-content">
						<a href="index.jsp">HOME</a>
						<a href="../mz_member/myPage">ABOUT ME</a>
						<a href="book.jsp">BOOK TABLE</a>
					</div>
				</div>
            </div>
            
          </div>
        </nav>
        
      </div>
    </header>
    <!-- end header section -->
  </div>
  
  
  
  
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

// JSP로부터 값을 가져와 JavaScript 변수에 저장
var userId = "${vo.user_id}";
var writerId = "${vo.user_id}";
var post_id = parseInt("${vo.post_id}");


$(function() {
	// 댓글 list 요청 
	$.ajax({
	    url: "postComList",
	    type: "GET",
	    data : {
	    	post_id : post_id
	    },
	    success : function(data) {
	      // 댓글 리스트를 가져와서 화면에 출력 
	      for (var i = 0; i < data.length; i++) {
  			var postCom = data[i];
  			var updatedDate = new Date(postCom.updated_date); // 새 Date 객체 생성
  			var postComElement = "<p>" + postCom.post_comment + ", " + postCom.user_id + "</p>" +
                       "<p>댓글 작성 시간: " + updatedDate.toLocaleString() + "</p><hr>";
  			$("#postComList").append(postComElement);
		} // for 
	    }, // success 
	    error : function(jqXHR, textStatus, errorThrown) {
	      console.log(textStatus, errorThrown);
	    } // error 
	  }); // ajax 
	
	// 게시글 로드 완료 후 조회수 증가 요청
	$.ajax({
		url : "increasePostViewCount",
		data : {
			post_id : post_id
		},
		success : function() {
			console.log("조회수 증가");
		},
		error : function(request, status, error) {
			console.log("오류 발생");
		}
	});
	
	$("#b1").click(function() {
		var userId = $("#user_id").val(); // input 필드에서 사용자 ID 가져오기
		var post_comment = $("#postCom").val(); // 댓글 내용 
		if (!userId) { // 사용자가 로그인하지 않은 상태
	        alert("로그인 후 댓글을 작성할 수 있습니다.");
	        return;
	    }
		
		$.ajax({
			type : "POST", // 요청 방식을 POST로 지정
			url : "createPostCom",
			data : {
				post_id: post_id,
				user_id: userId, 
				post_comment: post_comment 
			},
			success : function() {
				alert("댓글 달기 성공!");
				var newRow = "<p>" + post_comment + ", " + userId + "</p>" + 
	            "<p>댓글 작성 시간: " + new Date().toLocaleString() + "</p><hr>";
	            
	            $("#postComList").append(newRow);
	            $("#postCom").val('');
			}, // success
			error: function() {
				alert("댓글 달기 실패!");
			}
		}); // ajax  
	}); // b1 
	
	// 수정 버튼 클릭 시
	$("#updateBtn").click(function() {
		if (confirm("정말로 게시물을 수정하시겠습니까?")) {
			$.ajax({
				type: "GET",
				url: "updatePost",
				data: {
					post_id: ${vo.post_id} // 수정하려는 게시물의 id
				},
				success: function() {
					window.location.href = "updatePost?post_id=" + post_id; // 수정 페이지로 이동
				}
			});
		}
	});
	
 	// 삭제 버튼 클릭 시
    $("#deleteBtn").click(function() {
        if (confirm("정말로 게시물을 삭제하시겠습니까?")) {
            $.ajax({
                type: "POST",
                url: "deletePost",
                data: { 
                	post_id: post_id,
                	user_id: userId
                },
                success: function() {
                    alert("게시물이 삭제되었습니다.");
                    window.location.href = "boardPost.jsp";
                },
                error: function() {
                    alert("게시물 삭제에 실패했습니다.");
                }
            });
        }
    });
});

</script>

<a href="boardPost.jsp">
		<button type="button" class="btn btn-outline-secondary">자유게시판으로 돌아가기</button>
	</a>
<hr color="red">
<br>
post id : ${vo.post_id} <br> 
user id : ${vo.user_id} <br>
게시물의 음식 카테고리 : ${vo.food_cg} <br>
${user_id} 님의 선호 음식 카테고리 : ${vo.category} <br>
<br>
제목 : ${vo.post_title} <br>
내용 : ${vo.post_content} <br>
<c:choose>
  <c:when test="${not empty vo.post_file}">
    <img src="${pageContext.request.contextPath}/resources/img/${vo.post_file}" width=300 height=300> <br>
  </c:when>
  <c:otherwise>
    첨부 이미지가 없습니다.
  </c:otherwise>
</c:choose>
<br>
작성 시간 : ${vo.created_date}  /  게시물 최종 수정 시간 : ${vo.updated_date}
<br>

<hr color="red">

<c:choose>
    <c:when test="${sessionScope.user_id == vo.user_id}">
        <button type="button" id="updateBtn" class="btn btn-outline-dark">게시물 수정</button>
        <button type="button" id="deleteBtn" class="btn btn-outline-dark">게시물 삭제</button>
    </c:when>
</c:choose>

<hr color="red">

<c:choose>
    <c:when test="${session.getAttribute('user_id') != null}">
        회원 ID : <input id="user_id" value="${user_id}" readonly/><br>
        댓글달기 <input id="postCom"> <button type="button" id="b1" class="btn btn-warning">댓글달기</button>
    </c:when>
    <c:otherwise>
        <input id="user_id" type="hidden" value="${user_id}">
        댓글달기 <input id="postCom"> <button id="b1">댓글달기</button>
    </c:otherwise>
</c:choose>

<hr color="green">

<div id="postCommentInsert">
	<c:forEach items="${postComList}" var="postCom"> 
	- ${postCom.content}, ${postCom.writer} <br>
	댓글 작성 시간 : ${postCom.updated_date} <br> <br>
	</c:forEach>
</div>

<div id="postComList"></div>

	<!-- end client section -->


  <!-- footer section -->
  <footer class="footer_section">
    <div class="container">
      <div class="row">
        <div class="col-md-4 footer-col">
          <div class="footer_contact">
            <h4>
              Contact Us
            </h4>
            <div class="contact_link_box">
              <a href="">
                <i class="fa fa-map-marker" aria-hidden="true"></i>
                <span>
                  Location
                </span>
              </a>
              <a href="">
                <i class="fa fa-phone" aria-hidden="true"></i>
                <span>
                  Call +01 1234567890
                </span>
              </a>
              <a href="">
                <i class="fa fa-envelope" aria-hidden="true"></i>
                <span>
                  demo@gmail.com
                </span>
              </a>
            </div>
          </div>
        </div>
        <div class="col-md-4 footer-col">
          <div class="footer_detail">
            <a href="" class="footer-logo">
              Mat.zip
            </a>
            <p>
              Necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with
            </p>
            <div class="footer_social">
              <a href="">
                <i class="fa fa-facebook" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-twitter" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-linkedin" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-instagram" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-pinterest" aria-hidden="true"></i>
              </a>
            </div>
          </div>
        </div>
       
      </div>
      <div class="footer-info">
        <p>
          &copy; <span id="displayYear"></span> All Rights Reserved By
          <a href="https://html.design/">Free Html Templates</a><br><br>
          &copy; <span id="displayYear"></span> Distributed By
          <a href="https://themewagon.com/" target="_blank">ThemeWagon</a>
        </p>
      </div>
    </div>
  </footer>
  <!-- footer section -->
  
  <!-- jQery -->
  <script src="resources/js/jquery-3.4.1.min.js"></script>
  <!-- popper js -->
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous">
  </script>
  <!-- bootstrap js -->
  <script src="resources/js/bootstrap.js"></script>
  <!-- owl slider -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
  </script>
  <!-- isotope js -->
  <script src="https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js"></script>
  <!-- nice select -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js"></script>
   <!-- ranking js -->
  <script src="resources/js/ranking.js"></script>
  <!-- custom js -->
  <script src="resources/js/custom.js"></script>
  
  <!--규환 script 관련 코드 -->
  <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=8ab6186bb587538d75199b2dc9588259&libraries=services"></script>
 <!--  <script src="https://code.jquery.com/jquery-1.12.4.js"></script> -->
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	
  <!-- search map is  -->
  <script src="resources/js/searchmarker-gyu.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.11.1/js/lightbox.min.js"></script>
 
  <script type="text/javascript">
  	function openNav() {
		document.getElementById("myNav").style.width = "40%";
	}
  	function closeNav() {
		document.getElementById("myNav").style.width = "0%";
	}
  	
	lightbox.option({
	    resizeDuration: 100,
	    wrapAround: true,
	    disableScrolling: false,
	    fitImagesInViewport:false,
	    maxWidth: 500
	})
  </script>
  <!--규환 script 관련 코드 end -->



</body>
</html>