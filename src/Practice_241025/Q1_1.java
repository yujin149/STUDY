package Practice_241025;

import java.util.Scanner;

public class Q1_1 {

    static void inputNum(Scanner sc, int[] num) {
        System.out.print("숫자 입력 : ");
        num[0] = sc.nextInt();

        System.out.print("숫자 입력 : ");
        num[1] = sc.nextInt();
    }

    static void print(int[] num) {
        System.out.println(num[0] + num[1]);
        System.out.println(num[0] - num[1]);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];

        inputNum(sc, num);
        print(num);
    }
}
