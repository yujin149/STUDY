import { Link } from 'react-router-dom';

export default function About() {
  return (
    <>
      <header>소개</header>
      <p>안녕하세요.</p>
      <Link to="/">돌아가기</Link>
    </>
  );
}
