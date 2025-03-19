package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q3_1_2test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] com = new int[3];

        for (int i = 0; i < 3; i++) {
            com[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println("com의 값은 : " + com[0] + "," + com[1] + "," + com[2]);


        while (true) {

            System.out.print("첫번째 숫자 : ");
            int user1 = sc.nextInt();
            System.out.print("두번째 숫자 : ");
            int user2 = sc.nextInt();
            System.out.print("세번째 숫자 : ");
            int user3 = sc.nextInt();

            int strike = 0;
            int ball = 0;
            if (user1 > 0 && user1 < 10 && user2 > 0 && user2 < 10 && user3 > 0 && user3 < 10 && user1 != user2 && user2 != user3 && user1 != user3) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        if (com[i] == user1) {
                            strike++;
                        }
                        if (com[i] == user2 || com[i] == user3) {
                            ball++;
                        }
                    } else if (i == 1) {
                        if (com[i] == user2) {
                            strike++;
                        }
                        if (com[i] == user1 || com[i] == user3) {
                            ball++;
                        }
                    } else {
                        if (com[i] == user3) {
                            strike++;
                        }
                        if (com[i] == user1 || com[i] == user2) {
                            ball++;
                        }
                    }
                }


                if (strike == 3) {
                    System.out.println("홈런입니다.");
                    break;
                } else if (strike == 0 && ball == 0) {
                    System.out.println("Out입니다.");
                } else {
                    System.out.println(strike + "Strike / " + ball + "ball 입니다.");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
