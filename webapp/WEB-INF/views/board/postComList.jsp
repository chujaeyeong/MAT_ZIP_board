<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>댓글 목록</title>
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
<body>
    <h2>댓글 목록</h2>
    <table>
        <thead>
            <tr>
                <th>댓글 작성자</th>
                <th>댓글 내용</th>
                <th>작성 시간</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${postComList}" var="postCom">
                <tr>
                    <td>${postCom.user_id}</td>
                    <td>${postCom.post_comment}</td>
                    <td>${postCom.updated_date}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>