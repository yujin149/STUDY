package Day05_test;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int num2 = sc.nextInt();

        int gcd = 0;

        for (int i = 1; i < num1 || i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                //System.out.print(i + " ");
                gcd = i;
            }
        }

        int lcm = (num1 * num2) / gcd;
        System.out.println("최대공약수 : " + gcd + ", 최소공배수 : " + lcm);
    }
}

