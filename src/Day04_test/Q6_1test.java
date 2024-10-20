package Day04_test;

import java.util.Scanner;

public class Q6_1test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        int cnt = 0;
        while (check) {
            System.out.print("첫 번째 숫자를 입력해주세요");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력해주세요");
            int num2 = sc.nextInt();
            int big = 1; // 기본값
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    big = i;
                }
            }
            System.out.println("최대공약수는: " + big);
            System.out.println("최소공배수는: " + (num1 * num2) / big);

        }


    }

}

