package Day04_test;

import java.util.Random;

/*
3개의 변수 1~9까지 랜덤 수를 부여합니다.
각각의 변수의 숫자가 다르게 가질 수 있도록 구현해주세요.
 */
public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        int com1 = r.nextInt(9) + 1;
        int com2 = r.nextInt(9) + 1;
        int com3 = r.nextInt(9) + 1;

        while (true) {
            if (com1 == com2) {
                com2 = r.nextInt(9) + 1;
            }
            if (com1 == com3 || com2 == com3) {
                com3 = r.nextInt(9) + 1;
            } else {
                System.out.println(com1 + ", " + com2 + ", " + com3);
                break;
            }
        }
    }
}
