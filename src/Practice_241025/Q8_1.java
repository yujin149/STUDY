package Practice_241025;

import java.util.Scanner;

public class Q8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.원하는 구구단 출력\t2.전체 구구단 출력\t3. 종료");
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();
            if (num > 3 || num < 1) {
                System.out.println("잘못된 입력입니다.");
            } else {
                if (num == 1) {
                    while (true) {
                        System.out.print("원하는 구구단 : ");
                        int mulTable = sc.nextInt();

                        if (mulTable > 9 || mulTable < 2) {
                            System.out.println("잘못된 입력입니다.");
                        } else {
                            System.out.println("< " + mulTable + "단 >");
                            for (int i = 1; i < 10; i++) {
                                System.out.println(mulTable + " X " + i + " = " + (i * mulTable));
                            }
                            break;
                        }
                    }

                } else if (num == 2) {
                    for (int i = 2; i < 10; i++) {
                        System.out.println("< " + i + "단 >");
                        for (int j = 1; j < 10; j++) {
                            System.out.println(i + " X " + j + " = " + (i * j));
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("프로그램 종료");
                    break;
                }
            }
        }
    }
}
