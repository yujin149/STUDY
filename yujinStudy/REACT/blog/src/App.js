//import logo from './logo.svg';
import { useState } from 'react'; //import{useState}
import './App.css';

function App() {
  let post = '강남 우동 맛집'; //자료 저장할때 변수 쓸수 있음.
  let[a, b] = useState('남자 코트 추천'); //let[작명, 작명] = useState(보관할 자료)
  //재렌더링하고 싶을 때 사용.

  //a는 state에 보관했던 자료 나옴.
  //b는 state 변경 도와주는 함수.
  /** Destructuring 문법 
   * let num =[1,2,3] array자료
   * let num =[1,2]를 빼고싶을때,
   * let a = num[0]
   * let c = num[1] 이거를
   * let[a, c] = [1,2]이렇게 쓸 수 있다.
  */
  let[logo, setLogo] = useState('ReactBlog'); 
  
  return ( //return 안에는 병렬 태그로 2개이상 기입 금지
    
    <div className="App">
      <div className="black-nav">
        {/* 스타일 넣을 때에는 style = {{스타일명 : '값'}} */}
        <h4 style={{color:'white', fontSize:'16px'}}>{ logo }</h4>
      </div>
      <div className='list'>
        <h4>{ post } </h4>
        <p>2월 17일 발행</p>
      </div>
      <div className='list'>
        <h4>{ a }</h4>
        <p>2월 17일 발행</p>
      </div>
      <div className='list'>
        <h4>글제목</h4>
        <p>2월 17일 발행</p>
      </div>
      <h4>{ post }</h4>
    </div>
  );
}

export default App;
