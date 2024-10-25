package Practice_241025;

import java.util.Scanner;

/*
숫자 2개를 입력 받아서 더하기 빼기 결과 값을 출력하는 프로그램
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num1 = sc.nextInt();

        System.out.print("숫자 입력 : ");
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);

    }

}
