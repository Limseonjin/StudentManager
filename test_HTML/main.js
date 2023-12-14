const detail_btn = document.querySelectorAll('.detail_btn');

detail_btn.forEach((btn) => {
  btn.addEventListener('click', () => {
    const $detail_Info = document.querySelector('.student_Detail_Info');
    $detail_Info.classList.remove('non');
  });
});
