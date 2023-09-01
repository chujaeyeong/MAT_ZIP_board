<%@page import="com.mat.zip.board.model.PostVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mat.zip.board.model.PostVO"%>
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
	<tr class="table-warning">
		<!-- <td>post_id</td> -->
		<td>board name</td>
		<td>food_cg</td>		
		<td>title</td>
		<td>user_id</td>
		<td>date</td>
		<td>view count</td>
	</tr>

	<c:forEach items="${list}" var="vo">

		<tr class="table table-striped">
			<%-- <td>${vo.post_id}</td> --%>
			<td>자유게시판</td>
			<td>${vo.food_cg}</td>
			<td><a href="onePostId?post_id=${vo.post_id}">${vo.post_title}</a></td>
			<td>${vo.user_id}</td>
			<td><fmt:formatDate value="${vo.updated_date}" pattern="yyyy-MM-dd" /></td>
			<td>${vo.post_view_count}</td>
		</tr>

	</c:forEach>
</table>
</div>