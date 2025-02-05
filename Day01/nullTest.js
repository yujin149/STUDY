const a = 0;
const b = a || 3; // || 연산자는 false 값이면 뒤로 넘어감 // 0은 false
console.log(b);

const c = 0;
const d = c ?? 3; //?? null이거나 undefined일때만 뒤로 넘어감
console.log(d);

const e = null;
const f = e ?? 3;
console.log(f);

const g = undefined;
const h = g ?? 3;
console.log(h);

const i = null;

i?.d; // ?를 넣으면 죽지가 않음. null이지만, 에러 발생하지 않음.
i?.x();