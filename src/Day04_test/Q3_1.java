package Day04_test;

import java.util.Random;
import java.util.Scanner;

public class Q3_1 {
    static void comRandom(Random r, int[] com) {
        com[0] = r.nextInt(9) + 1;
        com[1] = r.nextInt(9) + 1;
        com[2] = r.nextInt(9) + 1;
    }

    static void comChk(Random r, int[] com) {
        comRandom(r, com);
        while (true) {
            if (com[0] == com[1]) {
                com[1] = r.nextInt(9) + 1;
            }
            if (com[0] == com[2] || com[1] == com[2]) {
                com[2] = r.nextInt(9) + 1;
            } else {
                System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
                break;
            }
        }
    }

    static void userInput(Scanner sc, int[] user) {
        System.out.print("첫번째 자리 : ");
        user[0] = sc.nextInt();
        System.out.print("두번째 자리 : ");
        user[1] = sc.nextInt();
        System.out.print("세번째 자리 : ");
        user[2] = sc.nextInt();
    }

    static void userChk(Scanner sc, int[] user) {
        userInput(sc, user);
        while (true) {
            if (user[0] > 0 && user[0] < 10 && user[1] > 0 && user[1] < 10 && user[2] > 0 && user[2] < 10) {
                if (user[1] == user[0]) {
                    System.out.println("동일한 숫자를 입력하셨습니다.");
                    System.out.print("두번째 자리 : ");
                    user[1] = sc.nextInt();
                } else if (user[2] == user[0] || user[2] == user[1]) {
                    System.out.println("동일한 숫자를 입력하셨습니다.");
                    System.out.print("세번째 자리 : ");
                    user[2] = sc.nextInt();
                } else {
                    break;
                }

            } else {
                System.out.println("잘못된 입력입니다.");
                System.out.print("첫번째 자리 : ");
                user[0] = sc.nextInt();
                System.out.print("두번째 자리 : ");
                user[1] = sc.nextInt();
                System.out.print("세번째 자리 : ");
                user[2] = sc.nextInt();
            }
        }
    }

    static void baseBallChk(Random r, int[] com, Scanner sc, int[] user) {

        comChk(r, com);
        userChk(sc, user);

        int strike = 0;
        int ball = 0;

        if (user[0] == com[0] || user[0] == com[1] || user[0] == com[2]) {
            if (user[0] == com[0]) {
                strike++;
            } else {
                ball++;
            }
        }
        if (user[1] == com[0] || user[1] == com[1] || user[1] == com[2]) {
            if (user[1] == com[1]) {
                strike++;
            } else {
                ball++;
            }
        }
        if (user[2] == com[0] || user[2] == com[1] || user[2] == com[2]) {
            if (user[2] == com[2]) {
                strike++;
            } else {
                ball++;
            }
        }

        if (strike == 3) {
            System.out.print("홈런");
        }
        if (strike == 2) {
            System.out.print("2 Strike ");
        }
        if (strike == 1) {
            System.out.print("1 Strike ");
        }
        if (ball == 3) {
            System.out.print("3 ball ");
        }
        if (ball == 2) {
            System.out.print("2 ball ");
        }
        if (ball == 1) {
            System.out.print("1 ball ");
        }
        if (strike == 0 && ball == 0) {
            System.out.print("OUT ");
        }


        System.out.print("입니다.");
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] comRan = new int[3];


        Scanner sc = new Scanner(System.in);
        int[] userNum = new int[3];


        baseBallChk(r, comRan, sc, userNum);

    }
}
