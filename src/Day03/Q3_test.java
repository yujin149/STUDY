package Day03;

import java.util.Scanner;

public class Q3_test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=======================");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=======================");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=======================");
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력 : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int str = 0; str < i + 1; str++) {
                System.out.print("*");
            }
            for (int str = 0; str < i; str++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=======================");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int str = 0; str < i + 1; str++) {
                System.out.print("*");
            }
            for (int str = 0; str < i; str++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < i + 2; j++) {
                System.out.print(" ");
            }
            for (int str = 2; str > i; str--) {
                System.out.print("*");
            }
            for (int str = 2; str > i + 1; str--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
