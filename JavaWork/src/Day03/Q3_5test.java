package Day03;

import java.util.Scanner;

public class Q3_5test {
    public static void main(String[] args) {


        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("홀수만 입력 :");
            int num = sc.nextInt();
            if (num % 2 != 0) {
                int result = num / 2;
                for (int i = 0; i < result + 1; i++) {
                    for (int j = result + 1; j > i; j--) {
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
                for (int i = 0; i < result; i++) {
                    for (int j = 0; j < i + 2; j++) {
                        System.out.print(" ");
                    }
                    for (int str = result; str > i; str--) {
                        System.out.print("*");
                    }
                    for (int str = result; str > i + 1; str--) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
