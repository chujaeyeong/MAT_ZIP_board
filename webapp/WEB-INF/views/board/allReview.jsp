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
		<td>store name</td>		
		<td>store cg</td>
		<td>review title</td>
		<td>emoticon</td>
		<td>user_id</td>
		<td>date</td>
		<td>view count</td>
	</tr>

	<c:forEach items="${review}" var="reviewVO">

		<tr class="table table-striped">
			<%-- <td>${reviewVO.review_id}</td> --%>
			<td>리뷰게시판</td>
			<td>${reviewVO.store_id}</td>
			<td>${reviewVO.store_cg}</td>
			<td><a href="oneReviewId?review_id=${reviewVO.review_id}">${reviewVO.review_title}</a></td>
			<td>${reviewVO.emoticon}</td>
			<td>${reviewVO.user_id}</td>
			<td><fmt:formatDate value="${reviewVO.updated_date}" pattern="yyyy-MM-dd" /></td>
			<td>${reviewVO.review_view_count}</td>
		</tr>

	</c:forEach>
	
</table>
</div>