const $detail_btn = [...document.querySelectorAll('.detail_btn')];
const $del_btn = document.querySelector('.delete');
const $detail_Info = document.querySelector('.student_Detail_Info');

$detail_btn.forEach((btn) => {
  btn.addEventListener('click', () => {
    $detail_Info.classList.remove('non');
  });
});

$del_btn.addEventListener('click', () => {
  const $del_Modal = document.querySelector('.delete_Modal');
  const $modal_back = document.getElementById('modal_back');
  const $del_yes = document.getElementById('del_yes');
  $del_Modal.classList.remove('non');
  $modal_back.classList.remove('non');

  $del_yes.addEventListener('click', () => {
    $del_Modal.classList.add('non');
    $modal_back.classList.add('non');
    $detail_Info.classList.add('non');
  });
});
