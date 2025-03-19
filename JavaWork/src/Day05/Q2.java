package Day05;

import java.util.Scanner;

/*
 * 1. 입력
 * 2. 최대공약수 구하고
 * 3. 최소공배수 구하고
 * 4. 출력
 * */
public class Q2 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 : ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;
        int r = 1;
        /*
        a     b     r
        36 % 120 -> 36
        120 % 36
        r = a % b;
        a = b;
        b = r;
         */

        while (r > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println("최대 공약수 : " + a);
        System.out.println("최소 공배수 : " + num1 * num2 / a);

    }
}
