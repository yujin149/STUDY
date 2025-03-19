package Day12;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        boolean[][] lake = new boolean[5][5];

        //물고기 잡기
        for (int i = 0; i < 3; i++) {
            int lakeX = r.nextInt(5);
            int lakeY = r.nextInt(5);
            if (lake[lakeX][lakeY]) {
                i--;
            } else {
                lake[lakeX][lakeY] = true;
            }
        }

        //출력
        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                if (lake[i][j]) {
                    System.out.print("★");
                } else {
                    System.out.print("☆");
                }
            }
            System.out.println();
        }


    }
}
