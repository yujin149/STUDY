package Practice_241025;

import java.util.Scanner;

/*
짝수 홀수 구하는 프로그램
 */
public class Q7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        System.out.print("짝수 : ");
        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("홀수 : ");
        for (int i = 1; i < num; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
