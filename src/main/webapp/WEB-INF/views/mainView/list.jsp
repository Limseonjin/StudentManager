<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Web Study</title>

    <link rel="stylesheet" href="/assets/css/main.css">
</head>
<body>
    <h1>학생 정보</h1>
    <c:forEach var="s" items="${sList}">
        <ul class="studentList">
            <li class="studentInfo">
                <p>학번:${s.num}</p>
                <p>이름:${s.name}</p>
                <p>성별:${s.gender}</p>
                <p>나이:${s.age}</p>
            </li>
        </ul>
    </c:forEach>

</body>
</html>