package Day05_test;

import java.util.Scanner;

public class Q1_1 {
    static void input(Scanner sc, int[] num) {
        for (int i = 0; i < 2; i++) {
            System.out.print((i + 1) + "번째 숫자 입력 : ");
            num[i] = sc.nextInt();
        }
    }

    static int gcd(int num[]) {


        int gcd = 0;
        for (int i = 1; i < num[0] || i < num[1]; i++) {
            if (num[0] % i == 0 && num[1] % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    static int lcm(int[] num) {
        return (num[0] * num[1]) / gcd(num);
    }

    public static void main(String[] args) {
        int[] num = new int[2];
        Scanner sc = new Scanner(System.in);
        input(sc, num);

        System.out.println("최대공약수 : " + gcd(num) + ", 최소공배수 : " + lcm(num));
    }
}
