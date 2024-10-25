package Day09;

import java.util.Random;

public class Q2_2test {
    public static void main(String[] args) {
        Random r = new Random();

        int totalMove = 0; //총 거리

        int turn = 1; // 턴
        while (true) {
            if (totalMove > 100) {
                break;
            } else {
                System.out.println("========== " + turn + "턴 ==========");
                int randomCont = r.nextInt(2);
                if (randomCont == 1) {
                    System.out.println("돌발상황 발생");
                    System.out.println("전진 거리 : " + totalMove);
                } else {
                    int move = r.nextInt(10) + 1;
                    totalMove += move;
                    System.out.println("전진 거리 : " + totalMove);
                }
                turn++;


            }
        }
    }
}
