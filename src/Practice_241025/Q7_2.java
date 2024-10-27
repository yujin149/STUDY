package Practice_241025;

import java.util.Scanner;

public class Q7_2 {
    static int inputNum(Scanner sc) {
        System.out.print("숫자 입력 : ");
        return sc.nextInt();
    }

    static void evenNum(int num) {
        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void oddNum(int num) {
        for (int i = 1; i < num; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = inputNum(sc);

        System.out.print("짝수 : ");
        evenNum(num);
        System.out.println();
        System.out.print("홀수 : ");
        oddNum(num);

    }
}
