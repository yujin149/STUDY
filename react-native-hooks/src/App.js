import React, {useState} from 'react';
import styled from 'styled-components/native';
import Counter from './components/Counter';
import Form from './components/Form';
import Button from './components/Button';
import Length from './components/Length';
import Dog from './components/Dog';

/**
 * useState : 상태관리
 * const [state, setState] = useState(초기값);
 * 값을 변경 setState(값)
 * 
 * useEffect : 랜더링(화면 뿌려주는 거) 할 때마다 작업
 * useEffect(() ⇒ {}, []);
 * 
 * useRef : 초기값을 잡고 바꿀 수가 없다. (상수 개념) / 랜더링 적용 X
 * useRef(초기값)
 * 
 * useMemo : 반복 연산 수행을 최적화
 * useMemo(() => {},[]);
 */

const Container = styled.View`
  flex:1; 
  background-color:#fff;
  justify-content:center;
  align-items: center;
`;

const App = () => {
  const [isVisible, setIsViisble] = useState(true);
  return (
  <Container>
    {/* 
    <Counter/> 
    <Button 
      title={isVisible ? 'Hide' : 'Show'}
      onPress={() => setIsVisible(prev => !prev)}
    />
    
    {isVisible && <Form />} 
  
    <Length />

    */}

    <Dog />
  </Container>
  )
};

export default App;