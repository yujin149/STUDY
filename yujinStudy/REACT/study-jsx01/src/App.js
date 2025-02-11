import logo from './logo.svg';
import './App.css';

function App() {
  const user = {
    name : '유진',
    age : '26'
  };
  return (
    //<div className="App">
      <header>
        <h1>안녕하세요. {user.name} 님!</h1>
        <br/>
        <p>{user.name}의 나이는 {user.age}인가요?</p>
      </header>
    //</div>
  );
}

export default App;
