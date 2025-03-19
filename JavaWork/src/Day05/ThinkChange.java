package Day05;

import java.util.Random;

public class ThinkChange {
    public static void main(String[] args) {
        Random r = new Random();
        boolean[][] hosu = new boolean[5][5];

        for (int i = 0; i < 3; i++) {
            int h = r.nextInt(5);
            int y = r.nextInt(5);
            if (hosu[h][y]) { //true
                i--;
            } else {
                hosu[h][y] = true;
            }
        }
        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (hosu[i][j]) { //true
                    System.out.print(" ●");
                } else { //false
                    System.out.print(" ○");
                }
            }
            System.out.println();
        }


        System.out.println("=================");

        int[][] hosu1 = new int[5][5];

        for (int i = 0; i < 3; i++) {
            int h = r.nextInt(5);
            int y = r.nextInt(5);
            if (hosu1[h][y] == 1) { //true
                i--;
            } else {
                hosu1[h][y] = 1;
            }
        }
        for (int i = 0; i < hosu1.length; i++) {
            for (int j = 0; j < hosu1[i].length; j++) {
                if (hosu1[i][j] == 1) { //true
                    System.out.print(" ●");
                } else { //false
                    System.out.print(" ○");
                }
            }
            System.out.println();
        }
    }
}
