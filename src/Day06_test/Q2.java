package Day06_test;


import java.util.Scanner;

public class Q2 {

    static String inputOp(Scanner sc) {
        System.out.print("연산자 입력 : ");
        return sc.next();
    }

    static void inputNum(Scanner sc, int[] num) {
        for (int i = 0; i < 2; i++) {
            System.out.print("숫자 " + (i + 1) + "번째 입력 :");
            num[i] = sc.nextInt();
        }
    }

    //더하기 연산 (주고 받고)
    static int sum(int[] num) {
        return num[0] + num[1];
    }

    //빼기 연산 (안주고 받고)
    static void sub(int[] num) {
        System.out.println("결과 값 : " + (num[0] - num[1]));
    }

    //곱하기 연산 (주고 안받고)
    static int mul() {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];
        inputNum(sc, num);

        return num[0] * num[1];
    }

    //나누기 연산 (안주고 안받고)
    static void div() {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];
        inputNum(sc, num);

        System.out.printf("결과 값 : %.1f", (double) num[0] / num[1]);
    }

    //결과값 출력
    static void result() {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];

        while (true) {
            String op = inputOp(sc);
            if (op.equals("+")) {
                inputNum(sc, num);
                System.out.println("결과 값 : " + sum(num));
                break;
            } else if (op.equals("-")) {
                inputNum(sc, num);
                sub(num);
                break;
            } else if (op.equals("*")) {
                System.out.println("결과 값 : " + mul());
                break;
            } else if (op.equals("/")) {
                div();
                break;
            } else {
                System.out.println("잘못된 연산자입니다.");
            }
        }
    }


    public static void main(String[] args) {
        result();
    }
}
