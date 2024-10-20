package Day04_test;

import java.util.Scanner;

public class Q6_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        int cnt = 0;
        while (check) {
            System.out.print("첫 번째 숫자를 입력해주세요");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력해주세요");
            int num2 = sc.nextInt();
            int temp;
            int big = 1; // 기본값
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    for (int j = 1; j < num2; j++) {
                        if (num2 % j == 0) {
                            if (i == j) {
                                big = i; // 마지막 공약수 업데이트
                            }
                        }
                    }
                }
            }
            System.out.println("마지막 공약수는: " + big);

        }


    }

}

