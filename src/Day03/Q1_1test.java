package Day03;

import java.util.Scanner;

public class Q1_1test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        for (int i = num; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
            if (i % 2 == 1) {
                System.out.print(i);
            }
        }
    }
}
