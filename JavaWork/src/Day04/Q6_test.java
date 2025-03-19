package Day04;

import java.util.Scanner;

/*
두 수의 최소 공배수와 최대 공약수를 구해주세요.
(단, 두 수를 입력 받아서 해주세요.)

유클리드 호제법
120*36/최대공약수 -> 최소공배수

최대공약수
두 숫자가 나눠지는 수에서 공통적으로 나오는 수 중 제일 큰수
최대공약수는 두 숫자를 나눌 수 있는 공통의 큰 숫자.

최소공배수
각각의 배수를 구해서 공통적으로 나오는 수 중 제일 작은 수
최소공배수는 두 숫자가 동시에 나오는 가장 작은 숫자.

*/
public class Q6_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력 :");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력 :");
        int num2 = sc.nextInt();

//        int num1 = 120;
//        int num2 = 36;
        int gcd = 0;
        boolean check = true;

        for (int i = num1; i >= 1; i--) {
            if (num1 % i == 0 && check) {
                for (int j = num2; j >= 1; j--) {
                    if (num2 % j == 0 && i == j) {
                        gcd = j;
                        check = false;
                        break;
                    }
                }
            }
        }
        int lcm = (num1 * num2) / gcd;
        System.out.printf("최대공약수 : %d, 최소공배수 : %d ", gcd, lcm);


    }
}
