<%@page import="com.mat.zip.board.model.ReviewVO" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- w3 school bootstrap5 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<div class="container mt-3">
  <div class="row">
  
    <c:forEach items="${photo}" var="photoVO">
    
      <div class="col-lg-4 col-md-6 mb-4">
        <div class="card h-100">
          <a href="onePhotoId?photo_id=${photoVO.photo_id}">
            <img class="card-img-top" src="<c:url value='/resources/img/${photoVO.photo_file}'/>" alt="${photoVO.photo_title}"></a>
          <div class="card-body">
            <h4 class="card-title">
              <a href="onePhotoId?photo_id=${photoVO.photo_id}">${photoVO.photo_title}</a>
            </h4>
            <h5>${photoVO.photo_cg}</h5>
            <p class="card-text">Posted by <b>${photoVO.user_id}</b> <br> 
              <fmt:formatDate value="${photoVO.updated_date}" pattern="yyyy-MM-dd" />
            </p>
          </div>
          <div class="card-footer">
            <small class="text-muted">Views: ${photoVO.photo_view_count}</small>
          </div>
        </div>
      </div>
    </c:forEach>
    
  </div>
  
</div>