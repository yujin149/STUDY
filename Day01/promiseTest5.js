const promise1 = Promise.resolve('성공1');
const promise2 = Promise.reject('성공2');
Promise.all([promise1, promise2])
  .then((result) => { //둘다 성공이면 ture가 되는데 성공2는 false이기때문에 성공만 나옴.
    console.log(result); //true일때, ['성공1', '성공2']; //false일때, 성공2
  })
  .catch((error) =>{
    console.error(error);
  });