package Day06;

import java.util.Scanner;

public class Q2 {
    //sum 1. 주고 받고
    static int add(int a, int b) {
        return a + b;
    }

    //minus 3. 안주고 받고
    static void minus(int a, int b) {
        System.out.println("결과 값 : " + (a - b) + "입니다.");
    }

    //mul 2. 주고 안받고
    static int mul() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        return num1 * num2;
    }

    //div 4. 안주고 안받고
    static void div() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("숫자 2 입력 : ");
        int num2 = sc.nextInt();
        System.out.printf("결과 값 : %.1f입니다.", (double) num1 / num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 입력 : ");
        String op = sc.next();
        int num1;
        int num2;
        //2. 출력
        switch (op) {
            case "+":
                System.out.println("숫자 1 입력 : ");
                num1 = sc.nextInt();
                System.out.println("숫자 2 입력 : ");
                num2 = sc.nextInt();
                System.out.printf("결과 값 : %d입니다.", add(num1, num2));
                break;
            case "-":
                System.out.println("숫자 1 입력 : ");
                num1 = sc.nextInt();
                System.out.println("숫자 2 입력 : ");
                num2 = sc.nextInt();
                minus(num1, num2);
                break;
            case "*":
                int result = mul();
                System.out.printf("결과 값 : %d입니다.", result);
                break;
            case "/":
                div();
                break;
            default:
                System.out.println("잘못된 연산자 입니다.");
                break;
        }
    }
}
