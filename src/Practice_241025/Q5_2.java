package Practice_241025;

import java.util.Scanner;

public class Q5_2 {
    static int input(Scanner sc) {
        System.out.print("숫자 입력 : ");
        return sc.nextInt();
    }

    static boolean mPrint(int num) {
        if (num > 1) {
            System.out.print(num + "의 약수는 ");
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    System.out.print(i + ",");
                }
            }

            System.out.println(num + "입니다.");
            return false;
        } else {
            System.out.println("잘못된 입력입니다.");
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = input(sc);
            mPrint(num);
        }
    }
}
