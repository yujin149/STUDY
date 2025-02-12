/** Function 키워드 사용용
const MyFooter = function() {
  return <footer>푸터</footer>;
}

export default MyFooter;
*/

/**화살표 함수 사용하기기 
const MyFooter = () => {
  return <footer>푸터</footer>
}

export default MyFooter;
*/

/** export default와 function 합쳐서 사용 */
export default function MyFooter() {
  return <footer>푸터</footer>;
}


