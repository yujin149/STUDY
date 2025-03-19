function App() {
  const isOnline = true;
  const hasPermission = true;
  const isLoggedIn = true;
  const isEmailVisible = true;

  return (
    <div className={isOnline && 'online'}>
      {/* 삼항연산자 사용하기 */}
      <p>{1+1 === 2 ? (<div>정답</div>) : (<div>땡!</div>)}</p>

      {/* AND 연산자 사용하기 
          단순히 조건이 true일 땐 보여주고, false일 경우 아무것도 보여주지 않는다.
      */}
      {1 + 1 === 2 && <div>정답</div>} 

      {/* 조건부 렌더링과 클래스명 변경 예제 */}
      <p>{isOnline ? '온라인 상태' : '오프라인 상태'}</p>

      {/* 조건에 따른 여러 컴포넌트 렌더링 예제 
          hasPermission과 isLoggedIn이 모두 true일 경우에만 "접근이 허용된 사용자입니다!"가 렌더링된다.
      */}
      {hasPermission && isLoggedIn && <p>접근이 허용된 사용자입니다!</p>}

      {/* 조건부 렌더링을 사용한 폼 입력 예제
          폼에서 조건에 따라 특정 필드를 렌더링하거나 숨길 때도 &&연산자를 사용 할 수 있다.
      */}
      <input type="text" placeholder="사용자 이름" />
      {isEmailVisible && <input type="email" placeholder="이메일 주소" />}

    </div>
  );
}

export default App;
