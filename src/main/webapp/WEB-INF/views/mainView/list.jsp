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
</head>
<body>
<div id="modal_back" class="non"></div>
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
        <tr>
            <td class="info">1</td>
            <td class="info">ㅎㅎ</td>
            <td class="info">남</td>
            <td class="info">4</td>
            <td class="info">
                <button class="detail_btn btn">세부사항</button>
            </td>
        </tr>
        <tr>
            <td class="info">1</td>
            <td class="info">ㅎㅎ</td>
            <td class="info">남</td>
            <td class="info">4</td>
            <td class="info">
                <button class="detail_btn btn">세부사항</button>
            </td>
        </tr>
        </tbody>
    </table>
</div>

<div class="student_Detail_Info non">
    <h2><span>ss</span>의 세부정보</h2>
    <ul class="Detail_List">
        <li class="info">학번 : <span>14</span></li>
        <li class="info">이름 : <span>14</span></li>
        <li class="info">성별 : <span>14</span></li>
        <li class="info">나이 : <span>14</span></li>
        <li class="info">전화번호 : <span>14</span></li>
        <li class="info">주소 : <span>14</span></li>
    </ul>
    <button class="btn detail_btn update">정보 수정</button>
    <button class="btn detail_btn delete">정보 삭제</button>
</div>

<div class="delete_Modal modal non">
    <div>
        <h1>정말 삭제하시겠습니까?</h1>
        <p>영구 삭제 되어 데이터가 사라집니다.</p>
        <div class="btn_wrap">
            <button id="del_yes" class="del_btn btn">삭제</button>
            <button id="del_no" class="del_btn btn">아니요</button>
        </div>
    </div>
</div>

<div class="update_Modal modal non">
    <div class="modal_wrap">
        <h1>정보 수정 폼</h1>
        <form class="update_Form">
            <p>학 번 <input class="input_form" type="text" name="num" readonly></p>
            <div class="line"></div>
            <p>이 름 <input class="input_form" type="text" name="name"></p>
            <div class="line"></div>
            <p>성 별 <select class="input_form" name="gender">
                <option>남</option>
                <option>여</option>
            </select></p>
            <div class="line"></div>
            <p>나 이 <input class="input_form" type="text" name="age"></p>
            <div class="line"></div>
            <p>전 화 번 호 <input class="input_form" type="text" name="phoneNum"></p>
            <div class="line"></div>
            <p>주 소 <input class="input_form" type="text" name="address"></p>
        </form>
        <div class="btn_wrap">
            <button id="update_yes" class="update_btn btn">수정</button>
            <button id="update_no" class="update_btn btn">취소</button>
        </div>
    </div>
</div>
</body>
</html>