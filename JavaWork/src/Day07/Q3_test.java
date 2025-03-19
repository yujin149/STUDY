package Day07;

import java.util.Random;

/*
문자 A(65)에서 랜덤 0~25 추출 (주고 안받고)
더하기 연산 (주고 받고)
문자 만듬 (주고 받고)

랜덤 분자 작업 10번 실행 (안주고 안받고)
10개 문자 더하기 (주고 받고)
10개 문자 출력 (안주고 받고)

 */
public class Q3_test {
    static int aRandom() {

        //문자 A(65)에서 랜덤 0~25 추출 (주고 안받고)
        Random r = new Random();
        int numRandom = r.nextInt(25) + 65;
        return numRandom;
    }

    static int sum(int sumNum) {
        //더하기 연산 (주고 받고)
        int sum = 0;
        sum = sum + sumNum;
        return sum;
    }

    static void inputRandom() {
        //랜덤 분자 작업 10번 실행 (안주고 안받고)
        int[] numList = new int[10];
        for (int i = 0; i < 10; i++) {
            numList[i] = aRandom();
        }
    }

    static int sumResult(int num) {
        //10개 문자 더하기 (주고 받고)
        int sum = 0;
        int[] numList = new int[num];
        inputRandom();
        for (int i = 0; i < num; i++) {
            sum = sum(numList[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumResult(10));
    }
}
