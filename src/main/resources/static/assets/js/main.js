
const URL = '/api/v1/stuDetail';

(()=>{
    fetchGetStudent();
})()
function renderStudentList(sList) {
    const $tbody = document.getElementById('stuList');
    let tag = ``;
    for (const s of sList) {
        tag += `
           <tr>
                <td class="info">${s.num}</td>
                <td class="info">${s.name}</td>
                <td class="info">${s.gender}</td>
                <td class="info">${s.age}</td>
                <td class="info">
                    <button class="stdInfo detailBtn btn" data-num="${s.num}">세부사항</button>
                </td>
            </tr>
          `

    }
    $tbody.innerHTML = tag;

}

//전체 조회 비동기 처리
function fetchGetStudent(){
    fetch(`${URL}`)
        .then(res => res.json())
        .then(sList =>{
            renderStudentList(sList);
        })
}

//개별 조회한 것을 JSON으로 받아오는 함수
function fetchGetStudentDetail(num=1) {
    console.log(`${URL}/${num}`)
    fetch(`${URL}/${num}`)
      .then(res=> res.json())
      .then(student =>{
          // console.log(student);
        renderStudentDetail(student);
      })
}
// 상세정보 렌더링
function renderStudentDetail({name,num,age,phoneNum,gender,address}) {
    let tag = '';
    const $detail_ul = document.getElementById('detailList');
    const $detail_Name = document.getElementById('detailName');
    $detail_Name.textContent= `${name}`
    tag = `
   <ul class="DetailList">
        <li class="info">학번 : <span>${num}</span></li>
        <li class="info">이름 : <span>${name}</span></li>
        <li class="info">성별 : <span>${gender}</span></li>
        <li class="info">나이 : <span>${age}</span></li>
        <li class="info">전화번호 : <span>${phoneNum}</span></li>
        <li class="info">주소 : <span>${address}</span></li>
    </ul>
    `
    $detail_ul.innerHTML = tag;
}
// 학생 추가 처리
function addStu(){
    const payload ={
        num : document.getElementById('num').value,
        name :document.getElementById('name').value,
        age:document.getElementById('age').value,
        gender: document.getElementById('gender').value,
        phoneNum: document.getElementById('phone').value,
        address:document.getElementById('address').value
    }
    const reqInfo = {
        method : 'POST',
        headers: {
            'content-type' : 'application/json'
        },
        body:JSON.stringify(payload)
    }
    fetch(`${URL}`,reqInfo)
        .then(res => res.json())
        .then(stu=>{
            // console.log(stu);
            renderStudentList(stu.stuList);
        })
}
// 학생 정보 삭제 처리
function deleteStu(num){
    const requestInfo = {
        method : 'DELETE'
    }
    fetch(`${URL}/${num}`,requestInfo)
        .then(res=> {
            if (res.status === 200){
                return res.json()
            }else{
                return ;
            }})
        .then(student =>{
            console.log(student);
            renderStudentList(student);
        })
}

//학생 정보 수정 처리
function updateStudent(){
    const payload = {
        num : +document.getElementById('stuNo').value,
        name : document.getElementById('stuName').value,
        age : +document.getElementById('stuAge').value,
        gender : valueTransGender(document.getElementById('stuGender').value),
        phoneNum : document.getElementById('stuPhone').value,
        address :  document.getElementById('stuAddress').value
    }
    const requestInfo = {
        method : 'PUT',
        headers :{
            'content-type' : 'application/json'
        },
        body : JSON.stringify(payload)
        ,
    }
    fetch(`${URL}`,requestInfo)
        .then(res => res.json())
        .then(stu => {
            console.log(stu)
            renderDetailandList(stu)
        })
}

// 수정 후 디테일과 리스트 비동기 처리
function renderDetailandList({stuList,stu}){
    renderStudentList(stuList)
    renderStudentDetail(stu)
}
