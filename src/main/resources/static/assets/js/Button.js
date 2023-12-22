const $detail_btn = document.querySelector('.studentInfo');
const $del_btn = document.querySelector('.delete');
const $detail_Info = document.querySelector('.studentDetailInfo');
const $update_btn = document.querySelector('.update');
const $modal_back = document.getElementById('modalBack');
const $del_Modal = document.querySelector('.deleteModal');

//========= 버튼 핸들러 함수 ===========/

//성별 value로 변환
function transGender(gender){
    if (gender === '여'){
        return 2
    }else if (gender === '남'){
        return 1
    }
}
function valueTransGender(gender){
    if (gender === '1'){
        return "남"
    }else if (gender === '2'){
        return "여"
    }
}

// 삭제모달에서 삭제 버튼을 눌렀을때 이벤트 핸들러
function clickYesHandler(){
    $del_Modal.classList.add('non');
    $modal_back.classList.add('non');
    $detail_Info.classList.add('non');
    deleteStu($del_Modal.dataset.num)
}

function clickNoHandler(){
    $del_Modal.classList.add('non');
    $modal_back.classList.add('non');
}
//삭제 모달 핸들러
function delBtnHandler(){

    const $del_yes = document.getElementById('delYes');
    const $del_no = document.getElementById('delNo');

    $del_Modal.classList.remove('non');
    $modal_back.classList.remove('non');
    //삭제모달에서 yes 버튼 클릭시
    $del_yes.addEventListener('click', clickYesHandler);
    //No 버튼 클릭시 모달만 닫힘
    $del_no.addEventListener('click',clickNoHandler)

}

//정보수정 버튼 핸들러
function updateBtnHandler() {
    const $detailList = document.querySelector('.DetailList');

    const $update_Modal = document.querySelector('.updateModal')
    const $update_Yes = document.getElementById('updateYes')
    const $update_No = document.getElementById('updateNo')
    $update_Modal.classList.remove('non');
    $modal_back.classList.remove('non');

    document.getElementById('stuNo').value= $detailList.children[0].children[0].textContent
    document.getElementById('stuName').value = $detailList.children[1].children[0].textContent
    document.getElementById('stuGender').value=transGender($detailList.children[2].children[0].textContent)
    document.getElementById('stuAge').value=($detailList.children[3].children[0].textContent)
    document.getElementById('stuPhone').value=($detailList.children[4].children[0].textContent)
    document.getElementById('stuAddress').value=($detailList.children[5].children[0].textContent)


    //Yes 버튼 클릭시
    $update_Yes.onclick = e =>{
        $update_Modal.classList.add('non');
        $modal_back.classList.add('non');
        updateStudent()
    }

    //NO버튼 클릭시
    $update_No.onclick= e =>{
        $update_Modal.classList.add('non');
        $modal_back.classList.add('non');
    }
}
//세부사항 버튼 클릭 핸들러
function detailBtnHandler(e) {
    if (e.target.matches('.stdInfo')){
        console.log("버튼눌렷뇽")
        $detail_Info.classList.remove('non');
        let num = +e.target.dataset.num;
        fetchGetStudentDetail(num);
        document.querySelector('.deleteModal').dataset.num = ""+num;
    }
}
// ============== 버튼 클릭 이벤트 =========== //
//세부사항 버튼 클릭시
$detail_btn.addEventListener('click', detailBtnHandler)

//삭제버튼 클릭시 이벤트
$del_btn.addEventListener('click', delBtnHandler);
//수정버튼 클릭시 이벤트
$update_btn.addEventListener('click', updateBtnHandler);
