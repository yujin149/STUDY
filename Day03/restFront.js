async function getUser() { // 로딩 시 사용자 가져오는 함수
  try {
    const res = await axios.get('/users'); //restServer.js에서 GET요청을 보내 사용자 데이터 가져옴.
    const users = res.data;
    const list = document.getElementById('list');
    list.innerHTML = ''; //list 내용을 초기화
    // 사용자마다 반복적으로 화면 표시 및 이벤트 연결
    Object.keys(users).map(function (key) { //users 객체의 키를 순차적으로 가져옴.
      const userDiv = document.createElement('div'); //div 요소 생성
      const span = document.createElement('span');
      span.textContent = users[key]; // span.textContent 는 이름 / user[key] name
      const edit = document.createElement('button'); 
      edit.textContent = '수정';
      edit.addEventListener('click', async () => { // 수정 버튼 클릭
        const name = prompt('바꿀 이름을 입력하세요');
        if (!name) {
          return alert('이름을 반드시 입력하셔야 합니다');
        }
        try {
          await axios.put('/user/' + key, { name });
          getUser();
        } catch (err) {
          console.error(err);
        }
      });
      const remove = document.createElement('button');
      remove.textContent = '삭제';
      remove.addEventListener('click', async () => { // 삭제 버튼 클릭
        try {
          await axios.delete('/user/' + key);
          getUser();
        } catch (err) {
          console.error(err);
        }
      });
      userDiv.appendChild(span); //생성한 userDiv를 list에 추가하여 화면에 표시
      userDiv.appendChild(edit);
      userDiv.appendChild(remove);
      list.appendChild(userDiv);
      console.log(res.data);
    });
  } catch (err) {
    console.error(err);
  }
}

window.onload = getUser; // 화면 로딩 시 getUser 호출
// 폼 제출(submit) 시 실행
document.getElementById('form').addEventListener('submit', async (e) => {
  e.preventDefault(); //기본 폼 제출 동작 방지 // 여러 번 클릭하면 한번 만 인식하고 무시.
  const name = e.target.username.value; //restFront의 id가 username인거의 값
  if (!name) {
    return alert('이름을 입력하세요');
  }
  try {
    await axios.post('/user', { name }); //POST요청을 통해 새 사용자 추가
    getUser(); //사용자 목록 갱신
  } catch (err) {
    console.error(err);
  }
  e.target.username.value = ''; //폼 제출 후 입력값을 초기화.
});
