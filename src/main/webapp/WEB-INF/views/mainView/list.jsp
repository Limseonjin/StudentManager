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
<div id="addStudentWrap">
    <button id="addStudent" class="btn">학생 추가</button>
</div>
<div class="tableWrap">

    <!-- 고정된 thead를 포함하는 테이블 -->
    <table class="studentList">
        <thead class="tableHead">
        <tr>
            <th class="info headTd">학번</th>
            <th class="info headTd">이름</th>
            <th class="info headTd">성별</th>
            <th class="info headTd">나이</th>
            <th class="info headTd">기타</th>
        </tr>
        </thead>
    </table>

    <!-- 스크롤되는 tbody를 포함하는 테이블 -->
    <div class="tbodyScroll">
        <table class="studentList">
            <tbody id="stuList" class="studentInfo">
            <!-- 행 데이터 -->


            </tbody>
        </table>
    </div>
</div>
<div class="studentDetailInfo non">
    <h2><span id="detailName">ss</span>의 세부정보</h2>
    <div id="detailList">

    </div>

    <button class="btn detailBtn update">정보 수정</button>
    <button class="btn detailBtn delete">정보 삭제</button>
</div>

<div class="addWrap non">
    <form class="addForm">
        <p>학 번 <input id="num" class="inputForm" type="text" name="num"></p>
        <div class="line"></div>
        <p>이 름 <input id="name" class="inputForm" type="text" name="name"></p>
        <div class="line"></div>
        <p>성 별 <select id="gender" class="inputForm" name="gender">
            <option value="1">남</option>
            <option value="2">여</option>
        </select></p>
        <div class="line"></div>
        <p>나 이 <input id="age" class="inputForm" type="text" name="age"></p>
        <div class="line"></div>
        <p>전 화 번 호 <input id="phone" class="inputForm" type="text" name="phoneNum"></p>
        <div class="line"></div>
        <p>주 소 <input id="address" class="inputForm" type="text" name="address"></p>
    </form>
    <div class="btnWrap">
        <button id="addYes" class="addBtn btn">추가</button>
        <button id="addNo" class="addBtn btn">취소</button>
    </div>
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
            <p>학 번 <input id="stuNo" class="inputForm" type="text" name="num" readonly></p>
            <div class="line"></div>
            <p>이 름 <input id="stuName" class="inputForm" type="text" name="name"></p>
            <div class="line"></div>
            <p>성 별 <select id="stuGender" class="inputForm" name="gender">
                <option value="1">남</option>
                <option value="2">여</option>
            </select></p>
            <div class="line"></div>
            <p>나 이 <input id="stuAge" class="inputForm" type="text" name="age"></p>
            <div class="line"></div>
            <p>전 화 번 호 <input id="stuPhone" class="inputForm" type="text" name="phoneNum"></p>
            <div class="line"></div>
            <p>주 소 <input id="stuAddress" class="inputForm" type="text" name="address"></p>
        </form>
        <div class="btnWrap">
            <button id="updateYes" class="updateBtn btn">수정</button>
            <button id="updateNo" class="updateBtn btn">취소</button>
        </div>
    </div>
</div>
</body>
</html>