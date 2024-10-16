package Day02_test;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 입력 :");
        int num1 = sc.nextInt();
        System.out.print("숫자2 입력 :");
        int num2 = sc.nextInt();

        System.out.print("연산자 입력 :");
        String op = sc.next();


        switch (op) {
            case "+":
                System.out.printf("결과값 : %d입니다.", num1 + num2);
                break;
            case "-":
                System.out.printf("결과값 : %d입니다.", num1 - num2);
                break;
            case "*":
                System.out.printf("결과값 : %d입니다.", num1 * num2);
                break;
            case "/":
                System.out.printf("결과값 : %.1f입니다.", (double) num1 / num2);
                break;
            default:
                System.out.println("잘못된 연산자 입니다.");
        }
    }
}
