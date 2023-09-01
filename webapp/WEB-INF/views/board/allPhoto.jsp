<%@page import="com.mat.zip.board.model.ReviewVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- w3 school bootstrap5 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<div class="container mt-3">
<table>
	<tr  class="table-warning">
		<!-- <td>review_id</td> -->
		<td>board name</td>	
		<td>photo cg</td>
		<td>review title</td>
		<td>user_id</td>
		<td>date</td>
		<td>view count</td>
	</tr>

	<c:forEach items="${photo}" var="photoVO">

		<tr class="table table-striped">
			<%-- <td>${reviewVO.review_id}</td> --%>
			<td>사진게시판</td>
			<td>${photoVO.photo_cg}</td>
			<td><a href="onePhotoId?photo_id=${photoVO.photo_id}">${photoVO.photo_title}</a></td>
			<td>${photoVO.user_id}</td>
			<td><fmt:formatDate value="${photoVO.updated_date}" pattern="yyyy-MM-dd" /></td>
			<td>${photoVO.photo_view_count}</td>
		</tr>

	</c:forEach>
	
</table>
</div>