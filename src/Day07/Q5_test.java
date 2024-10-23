package Day07;

import java.util.Random;
import java.util.Scanner;

/*
문제)배열 숫자야구게임

1. com random
2. user 값 입력
3. 배열 비교
4. 출력
 */
public class Q5_test {

    //com 랜덤
    static int[] comRandom(Random r) {
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
        return com;
    }

    //user 입력
    static int[] userNum(Scanner sc) {
        int[] user = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + "자리 숫자 : ");
            user[i] = sc.nextInt();
            if (user[i] < 1 || user[i] > 9) {
                i--;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (user[i] == user[j]) {
                    i--;
                    break;
                }
            }
        }
        return user;
    }

    //배열 비교
    static void result(int[] com, int[] user) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {  //user
            for (int j = 0; j < 3; j++) { //com
                if (user[i] == com[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        if (strike == 0 && ball == 0) {
            System.out.println("Out입니다.");
        } else if (strike == 3) {
            System.out.println("홈런입니다.");
        } else {
            System.out.println(strike + "Strike / " + ball + "ball 입니다.");
        }

    }

    //출력
    static void print() {


    }

    //출력
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        result(comRandom(r), userNum(sc));
    }
}
