
const URL = '/api/v1/StudentDetail'

//개별 조회한 것을 JSON으로 받아오는 함수
function fetchGetStudentDetail(num=1) {


    fetch(`\${URL}/\${num}`)
      .then(res=> res.json())
      .then(student =>{
        renderStudentDetail(student);
      })

}
function renderStudentDetail(student) {
    let tag = '';
}
