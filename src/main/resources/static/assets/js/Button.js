const $detail_btn = [...document.querySelectorAll('.stdInfo')];
const $del_btn = document.querySelector('.delete');
const $detail_Info = document.querySelector('.studentDetailInfo');
const $update_btn = document.querySelector('.update');
const $modal_back = document.getElementById('modalBack');
//========= 버튼 핸들러 함수 ===========/
//삭제 모달 핸들러
function delBtnHandler(){
    const $del_Modal = document.querySelector('.deleteModal');
    const $del_yes = document.getElementById('delYes');
    const $del_no = document.getElementById('delNo');

    $del_Modal.classList.remove('non');
    $modal_back.classList.remove('non');
    //삭제모달에서 yes 버튼 클릭시
    $del_yes.addEventListener('click', () => {
        $del_Modal.classList.add('non');
        $modal_back.classList.add('non');
        $detail_Info.classList.add('non');
    });
    //No 버튼 클릭시 모달만 닫힘
    $del_no.onclick = e =>{
        $del_Modal.classList.add('non');
        $modal_back.classList.add('non');
    }
}

//정보수정 버튼 핸들러
function updateBtnHandler() {
    const $update_Modal = document.querySelector('.updateModal')
    const $update_Yes = document.getElementById('updateYes')
    const $update_No = document.getElementById('updateNo')
    $update_Modal.classList.remove('non');
    $modal_back.classList.remove('non');

    //Yes 버튼 클릭시
    $update_Yes.onclick = e =>{
        $update_Modal.classList.add('non');
        $modal_back.classList.add('non');
    }

    //NO버튼 클릭시
    $update_No.onclick= e =>{
        $update_Modal.classList.add('non');
        $modal_back.classList.add('non');
    }
}
//세부사항 버튼 클릭 핸들러
function detailBtnHandler(e) {
    $detail_Info.classList.remove('non');
    let num = +e.target.dataset.num;
    fetchGetStudentDetail(num);
}
// ============== 버튼 클릭 이벤트 =========== //
//세부사항 버튼 클릭시
$detail_btn.forEach((btn) => {
    btn.addEventListener('click', detailBtnHandler)
});

//삭제버튼 클릭시 이벤트
$del_btn.addEventListener('click', delBtnHandler);
$update_btn.addEventListener('click', updateBtnHandler);
