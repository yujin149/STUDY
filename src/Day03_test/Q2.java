package Day03_test;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.원하는 구구단 출력 2.전체 구구단 출력 3.종료");
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.print("원하는 단 입력 : ");
                System.out.print("숫자 입력 : ");
                int dan = sc.nextInt();

                if (dan >= 2 && dan <= 9) {
                    System.out.printf("%d단", dan);
                    for (int i = 1; i < 10; i++) {
                        System.out.printf("%d X %d = %d", dan, i, dan * i);
                        System.out.println();
                    }
                } else {
                    System.out.println("잘못된 입력입니다.");
                }

            } else if (num == 2) {
                for (int i = 2; i < 10; i++) {
                    System.out.printf("%d단", i);
                    System.out.println();
                    for (int j = 1; j < 10; j++) {
                        System.out.printf("%d X %d = %d", i, j, i * j);
                        System.out.println();
                    }
                    System.out.println();
                }
            } else if (num == 3) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
