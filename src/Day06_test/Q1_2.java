package Day06_test;

import java.util.Random;
import java.util.Scanner;

public class Q1_2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int[][] hosu = new int[5][5];
        int col; //행
        int row; //열
        int fishcount = 0; //물고기갯수

        //물고기 3개 랜덤 위치
        for (int i = 0; i < 3; i++) {
            col = r.nextInt(5);
            row = r.nextInt(5);
            if (hosu[col][row] == 1) {
                i--;
            } else {
                hosu[col][row] = 1;
                fishcount++;
            }
        }

        //출력
        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (hosu[i][j] == 1) {
                    System.out.print("🦐 \t");
                } else {
                    System.out.print("💧 \t");
                }
            }
            System.out.println();
        }

        //while문을 돌기 위한 조건
        int x = -1;
        int y = -1;

        while (x < 0 || x > 4 || y < 0 || y > 4) {
            System.out.print("행 입력 : ");
            x = sc.nextInt();
            System.out.print("열 입력 : ");
            y = sc.nextInt();
        }

        //캐스팅 출력
        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (i == x && j == y) {
                    //hosu[i][j] == hosu[x][y]는 값의 비교라서 위에 처럼 써야함.
                    System.out.print("❤️ \t");
                } else if (hosu[i][j] == 1) {
                    System.out.print("🦐 \t");
                } else {
                    System.out.print("💧 \t");
                }
            }
            System.out.println();
        }

    }
}
