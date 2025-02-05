const condition = true; //true이면 resolve, false이면 reject
const promise = new Promise((resolve, reject) => {
  if(condition){
    resolve('성공');
  }else{
    reject('실패');
  }
}) ;

promise
  .then((message) => { //성공을 받아서 여기로 옴.
    return new Promise((resolve, reject) => { 
      resolve(message); 
    });
  })
  .then((message2) => { //resolve(message)
    console.log(message2);
    return new Promise((resolve, reject) => {
      resolve(message2); //성공
    });
  })
  .then((message3) => { //resolve(message2)
    console.log(message3); //성공
  })

  .catch((error) => {
    console.error(error);
  });