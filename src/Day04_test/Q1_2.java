package Day04_test;

import java.util.Random;
import java.util.Scanner;

class Com {
    int random() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }
}

class User {

    int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        return sc.nextInt();
    }
}

class Mc {
    Com com;
    User user;

    Mc() {
        com = new Com();
        user = new User();
    }

    void print() {
        int ranCom = com.random();
        System.out.println(ranCom);
        while (true) {
            int inputUser = user.input();

            if (inputUser > 0 && inputUser < 101) {
                if (ranCom == inputUser) {
                    System.out.println("맞췄습니다. 축하합니다.");
                    break;
                } else if (ranCom < inputUser) {
                    System.out.println("다운");
                } else {
                    System.out.println("업");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}

public class Q1_2 {
    public static void main(String[] args) {
        Mc mc = new Mc();
        mc.print();
    }
}
