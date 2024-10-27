package Practice_241025;

import java.util.Scanner;

public class Q4_2 {
    static String input(Scanner sc, int[] inputNum) {
        System.out.print("첫번째 숫자 입력 : ");
        inputNum[0] = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        inputNum[1] = sc.nextInt();
        System.out.print("연산자 입력 : ");
        return sc.next();
    }

    static void print(String op, int[] inputNum) {
        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
            if (op.equals("+")) {
                System.out.println("결과 값 : " + (inputNum[0] + inputNum[1]) + "입니다.");
            } else if (op.equals("-")) {
                System.out.println("결과 값 : " + (inputNum[0] - inputNum[1]) + "입니다.");
            } else if (op.equals("*")) {
                System.out.println("결과 값 : " + (inputNum[0] * inputNum[1]) + "입니다.");
            } else {
                System.out.println("결과 값 : " + ((double) inputNum[0] / inputNum[1]) + "입니다.");
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputNum = new int[2];
        print(input(sc, inputNum), inputNum);
    }
}
