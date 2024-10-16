package Day02_test;

import java.util.Scanner;

/*
 * 연산자  해서 출력
 * 연산자가 잘 못입력되면 잘못된 연산자입니다. 라고 출력
 * 나눗셈은 소숫점 첫자리까지 출력
 * */
public class Q3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();

        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        System.out.print("연산자 입력 :");
        String operator = sc.next();

        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            System.out.println("잘못된 연산자입니다.");
        } else {
            if (operator.equals("+")) {
                int add = num1 + num2;
                System.out.println(add);
            } else if (operator.equals("-")) {
                int sub = num1 - num2;
                System.out.println(sub);
            } else if (operator.equals("*")) {
                int mul = num1 * num2;
                System.out.println(mul);
            } else {
                double div = (double) num1 / num2;
                //int div = (double) num1 / num2;
                System.out.printf("%.1f", div);
            }
        }


    }
}
