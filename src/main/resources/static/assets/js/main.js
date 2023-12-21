
const URL = '/api/v1/stuDetail'

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

// 학생 정보 삭제 처리
function deleteStu(num){
    const requestInfo = {
        method : 'DELETE'
    }
    fetch(`${URL}/${num}`,requestInfo)
        .then(res=> res.json())
        .then(student =>{
            console.log(student);
            renderStudentDetail(student);
        })
}

