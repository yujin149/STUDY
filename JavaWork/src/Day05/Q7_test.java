package Day05;

import java.util.Random;
import java.util.Scanner;

public class Q7_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[][] lake = new int[5][5];

        for (int i = 0; i < 3; i++) {
            int x = r.nextInt(5);
            int y = r.nextInt(5);
            if (lake[x][y] == 1) {
                i--;
                break;
            } else {
                lake[x][y] = 1;
            }
        }

        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                if (lake[i][j] == 1) { //true
                    System.out.print(" ●");
                } else { //false
                    System.out.print(" ○");
                }
            }
            System.out.println();
        }


        while (true) {
            System.out.print("X : ");
            int col = sc.nextInt();
            System.out.print("Y : ");
            int row = sc.nextInt();
            if (col < 0 || col > 5 || row < 0 || row > 5) {
                System.out.println("잘못된 입력입니다. 다시 캐스팅 해주세요.");
            } else if (lake[col - 1][row - 1] == 1) {
                System.out.print(" X");
                break;
            } else {
                System.out.println("물고기가 없습니다. 다시 캐스팅 해주세요.");
            }


        }
    }
}
