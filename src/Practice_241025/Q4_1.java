package Practice_241025;

import java.util.Scanner;

/*
**출력 결과 예시)**
첫 번째 숫자 입력 : 5
두 번째 숫자 입력 : 10
연산자 입력 : +
결과 값 : 15입니다.

연산자는 + * - / 만 입력 받으며, 연산자가 잘못 입력되면 “잘못된 연산자입니다.” 를 출력합니다.
나눗셈은 소숫점 첫번째 자리까지 출력해주세요.
 */
public class Q4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 입력 : ");
        String op = sc.next();

        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
            if (op.equals("+")) {
                System.out.println("결과 값 : " + (num1 + num2) + "입니다.");
            } else if (op.equals("-")) {
                System.out.println("결과 값 : " + (num1 - num2) + "입니다.");
            } else if (op.equals("*")) {
                System.out.println("결과 값 : " + (num1 * num2) + "입니다.");
            } else {
                System.out.println("결과 값 : " + ((double) num1 / num2) + "입니다.");
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
        }


    }
}
