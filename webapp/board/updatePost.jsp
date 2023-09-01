<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
<%-- 	<%@ page import ="com.mat.zip.board.PostVO" %>
	<% PostVO vo = (PostVO)session.getAttribute("admin"); %> --%>
	
    <h3>자유게시판 - 게시물수정 화면입니다.</h3>
    <hr color="red">
    <form action="board/updatePost" id="form" method="post" enctype="multipart/form-data" >
    	게시물 ID : <input name="post_id" value="${vo.post_id}"><br> 
        회원 ID : <input name="user_id" value="${vo.user_id}"><br>
        제목 : <input name="post_title" value="${vo.post_title}"><br>
        게시물의 음식 카테고리 : <select name="food_cg">
            <option value="한식" ${vo.food_cg == '한식' ? 'selected' : ''}>한식</option>
            <option value="양식" ${vo.food_cg == '양식' ? 'selected' : ''}>양식</option>
            <option value="중식" ${vo.food_cg == '중식' ? 'selected' : ''}>중식</option>
            <option value="일식" ${vo.food_cg == '일식' ? 'selected' : ''}>일식</option>
            <option value="아시안음식" ${vo.food_cg == '아시안음식' ? 'selected' : ''}>아시안음식</option>
            <option value="기타" ${vo.food_cg == '기타' ? 'selected' : ''}>기타</option>
        </select><br>
        회원님의 선호 음식 카테고리 : <select name="category">
            <option value="한식" ${vo.category == '한식' ? 'selected' : ''}>한식</option>
            <option value="양식" ${vo.category == '양식' ? 'selected' : ''}>양식</option>
            <option value="중식" ${vo.category == '중식' ? 'selected' : ''}>중식</option>
            <option value="일식" ${vo.category == '일식' ? 'selected' : ''}>일식</option>
            <option value="아시안음식" ${vo.category == '아시안음식' ? 'selected' : ''}>아시안음식</option>
            <option value="기타" ${vo.category == '기타' ? 'selected' : ''}>기타</option>
        </select><br>
        내용 : <textarea name="post_content" style="width:500px; height:200px;" maxlength=1000>${vo.post_content}</textarea><br> 
        파일 첨부 : <input type="file" name="file" ><br>
        <br>
        <button type="submit">게시물 수정하기</button>
        <a href="boardIndex.jsp">
			<button style="background: pink;">게시판 main 페이지로 이동하기</button>
		</a>
    </form>
</body>
</html> 