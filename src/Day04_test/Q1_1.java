package Day04_test;

import java.util.Random;
import java.util.Scanner;

public class Q1_1 {
    static int comRandom() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    static int userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        return sc.nextInt();
    }

    static void print() {
        int com = comRandom();
        System.out.println(com);
        while (true) {
            int user = userInput();
            if (user > 0 && user < 101) {
                if (com == user) {
                    System.out.println("맞췄습니다. 축하합니다.");
                    break;
                } else if (com < user) {
                    System.out.println("다운");
                } else {
                    System.out.println("업");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }


    public static void main(String[] args) {
        print();
    }
}
