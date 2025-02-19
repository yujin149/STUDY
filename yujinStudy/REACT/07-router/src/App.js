import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import About from './pages/About';
import Header2 from './components/Header2';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Header2 />
        <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />

        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
