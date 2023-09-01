<%@page import="com.mat.zip.mzMember.model.MzMemberDTO"%>
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
		$(function() {
			$("#result").empty();
	        $.ajax({
	            url : "allPost",
	            success : function(data) {
	            	$('#result').append(data)
	            },
	            error:function(request, status, error){
	                alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
	            } // error
	        }); // ajax
	        
	        
	        // 자유게시판 제목 검색 
	    	$(document).ready(function(){
	    	    $('#searchForm').on('submit', function(e){
	    	        e.preventDefault(); // Prevent form submission

	    	        var searchTerm = $('#searchTerm').val();

	    	        $.ajax({
	    	            url: 'searchPost', 
	    	            type: 'GET',
	    	            data: { searchTerm: searchTerm },
	    	            success: function(data) {
	    	                // 새로운 테이블 행을 저장할 빈 배열을 만듭니다.
	    	                var newRows = [];

	    	                // 각 검색 결과에 대해
	    	                $.each(data, function(i, post){
	    	                    // 새로운 테이블 행을 만듭니다.
	    	                    var newRow = '<tr class="table table-striped">' +
	    	                        '<td>자유게시판</td>' +
	    	                        '<td>' + post.food_cg + '</td>' +
	    	                        '<td><a href="onePostId?post_id=' + post.post_id + '">' + post.post_title + '</a></td>' +
	    	                        '<td>' + post.user_id + '</td>' +
	    	                        '<td>' + formatDate(post.updated_date) + '</td>' +
	    	                        '<td>' + post.post_view_count + '</td>' +
	    	                        '</tr>';

	    	                    // 새로운 테이블 행을 배열에 추가합니다.
	    	                    newRows.push(newRow);
	    	                });

	    	                // 기존 테이블 행을 제거하고 새로운 행을 추가합니다.
	    	                $('table').find('tr:gt(0)').remove();
	    	                $('table').append(newRows.join(''));
	    	            }
	    	        });
	    	    });
	    	});

	    	// 유닉스 타임스탬프를 "yyyy-MM-dd" 형식의 문자열로 변환하는 함수입니다.
	    	function formatDate(unixTimestamp) {
	    	    var date = new Date(unixTimestamp);
	    	    var year = date.getFullYear();
	    	    var month = ('0' + (date.getMonth() + 1)).slice(-2);
	    	    var day = ('0' + date.getDate()).slice(-2);
	    	    return year + '-' + month + '-' + day;
	    	}
	        
	        
	        
	        
	        
	        
	        
		}); // $
	</script>
	
	
	<%-- 세션에 저장된 회원 정보 가져오기 --%>
	<% String user_id = (String) session.getAttribute("user_id"); %>
	<%= user_id != null ? user_id + " 님이 로그인 중입니다." : "" %>
	
	<% if (user_id == null) { %>
		! 로그인이 필요합니다. ! 
		<a href="../mz_member/login" class="order_online">
		      LOGIN
		</a>
	
	<% } else { %>

	<br>
	<br>
	<a href="boardPostCreate.jsp">
		<button type="button" class="btn btn-warning">자유게시판 게시글 작성하기</button>
	</a>
	<% } %>
	<br>
	
	<form id="searchForm">
	    <input type="text" id="searchTerm" placeholder="Search..." required>
	    <input type="submit" value="Search">
	</form>
	
	<hr color=green>
	<div id="result"></div>
	<hr color=green>
	<a href="boardIndex.jsp">
		<button type="button" class="btn btn-outline-secondary">게시판 index 페이지로 돌아가기</button>
	</a>
	<br>
	<br>
	
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