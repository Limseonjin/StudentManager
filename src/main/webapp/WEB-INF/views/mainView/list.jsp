<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8" />
    <title>학생정보시스템</title>

    <link rel="stylesheet" href="/assets/css/common.css" />
    <link rel="stylesheet" href="/assets/css/main.css" />
    <script src="/assets/js/main.js" defer></script>
    <script src="/assets/js/Button.js" defer></script>
</head>
<body>
<div id="modalBack" class="non"></div>
<h1>학생 정보 관리 시스템</h1>
<div class="tableWrap">
    <table class="studentList">
        <thead class="tableHead">
        <th class="info headTd">학번</th>
        <th class="info headTd">이름</th>
        <th class="info headTd">성별</th>
        <th class="info headTd">나이</th>
        <th class="info headTd">기타</th>
        </thead>
        <tbody class="studentInfo">
        <c:forEach var="s" items="${sList}">
        <tr>
            <td class="info">${s.num}</td>
            <td class="info">${s.name}</td>
            <td class="info">${s.gender}</td>
            <td class="info">${s.age}</td>
            <td class="info">
                <button class="stdInfo detailBtn btn" data-num="${s.num}">세부사항</button>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<div class="studentDetailInfo non">
    <h2><span>ss</span>의 세부정보</h2>
    <ul class="DetailList">
        <li class="info">학번 : <span>14</span></li>
        <li class="info">이름 : <span>14</span></li>
        <li class="info">성별 : <span>14</span></li>
        <li class="info">나이 : <span>14</span></li>
        <li class="info">전화번호 : <span>14</span></li>
        <li class="info">주소 : <span>14</span></li>
    </ul>
    <button class="btn detailBtn update">정보 수정</button>
    <button class="btn detailBtn delete">정보 삭제</button>
</div>

<div class="deleteModal modal non">
    <div>
        <h1>정말 삭제하시겠습니까?</h1>
        <p>영구 삭제 되어 데이터가 사라집니다.</p>
        <div class="btnWrap">
            <button id="delYes" class="del_btn btn">삭제</button>
            <button id="delNo" class="del_btn btn">아니요</button>
        </div>
    </div>
</div>

<div class="updateModal modal non">
    <div class="modalWrap">
        <h1>정보 수정 폼</h1>
        <form class="updateForm">
            <p>학 번 <input class="inputForm" type="text" name="num" readonly></p>
            <div class="line"></div>
            <p>이 름 <input class="inputForm" type="text" name="name"></p>
            <div class="line"></div>
            <p>성 별 <select class="inputForm" name="gender">
                <option>남</option>
                <option>여</option>
            </select></p>
            <div class="line"></div>
            <p>나 이 <input class="inputForm" type="text" name="age"></p>
            <div class="line"></div>
            <p>전 화 번 호 <input class="inputForm" type="text" name="phoneNum"></p>
            <div class="line"></div>
            <p>주 소 <input class="inputForm" type="text" name="address"></p>
        </form>
        <div class="btnWrap">
            <button id="updateYes" class="updateBtn btn">수정</button>
            <button id="updateNo" class="updateBtn btn">취소</button>
        </div>
    </div>
</div>
</body>
</html>