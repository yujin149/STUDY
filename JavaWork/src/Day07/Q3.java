package Day07;

import java.util.Random;

/*
1. 난수값 만들기 ( 주고 안받고)
2. 난수값 연산 + 65 (주고 받고)
3. 더하는 결과값 문자로 바꾸기 (주고 받고)
4. 10번 실행하는 거 (안주고 안받고)
5. 10개 문자를 더하기 연산 (주고 받고)
6. 10개 문자를 출력 (안주고 받고)

 */
public class Q3 {

    //1. 난수값 만들기 ( 주고 안받고)
    static int randomMake() {
        Random r = new Random();
        return r.nextInt(26);
    }

    //2. 난수값 연산 + 65 (주고 받고)
    static int add(int ran) {
        return 65 + ran;
    }

    //3. 더하는 결과값 문자로 바꾸기 (주고 받고)
    static char makeChar(int result) {
        return (char) result;
    }

    //4. 10번 실행하는 거 (안주고 안받고)
    static void start() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            int ran = randomMake();
            int val = add(ran);
            char ch = makeChar(val);
            result += makeString(ch);
        }
        printString(result);
    }

    //5. 10개 문자를 더하기 연산 (주고 받고)
    static String makeString(char ch) {
        return ch + "";
    }

    //6. 10개 문자를 출력 (안주고 받고)
    static void printString(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        start();
    }
}
