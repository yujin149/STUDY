package Practice_241025;

import java.util.Scanner;

public class Q8_2 {
    static int homeInput(Scanner sc) {
        System.out.println("1.원하는 구구단 출력\t2.전체 구구단 출력\t3. 종료");
        System.out.print("숫자 입력 : ");
        return sc.nextInt();
    }

    static void choiceNum(Scanner sc) {
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
    }

    static void allMulTable() {
        for (int i = 2; i < 10; i++) {
            System.out.println("< " + i + "단 >");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int inputNum = homeInput(sc);
            if (inputNum == 3) {
                System.out.println("프로그램 종료");
                break;
            } else if (inputNum == 1) {
                choiceNum(sc);
            } else if (inputNum == 2) {
                allMulTable();
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
