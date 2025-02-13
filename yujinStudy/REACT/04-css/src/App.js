// App.js
import React from 'react';
import MyHeader from './components/MyHeader'; // MyHeader 컴포넌트 불러오기
import './App.css'; // App.css 스타일 불러오기

function App() {
  const user = {
    name: '유진',
    age: 26
  };

  return (
    <div className="App">
      <MyHeader />
      <h1 id="title">안녕하세요! {user.name}님</h1>
      <p className="desc">
        {user.name}님의 나이는 {user.age}세 맞으신가요?
      </p>
    </div>
  );
}

export default App;
