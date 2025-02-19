import { Link } from 'react-router-dom';

export default function Home() {
  return (
    <>
      <header>페이지 라우팅 살펴보기</header>
      <h1>소개</h1>
      <Link to="/about">소개</Link>
    </>
  );
}
