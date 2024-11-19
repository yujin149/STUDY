package Day06_test;

import java.util.Random;
import java.util.Scanner;

class Fish1 {
}

class Hosu1 {
    Fish1[][] hosu = new Fish1[5][5];

    Hosu1() {
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int col = r.nextInt(5);
            int row = r.nextInt(5);

            if (hosu[col][row] != null) {
                i--;
            } else {
                hosu[col][row] = new Fish1();
            }
        }
    }

    //호수 출력
    void printHosu(int[] position) {
        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (i == position[0] && j == position[1] && position[0] != -1 && position[1] != -1) {
                    System.out.print("❤️ \t");
                } else if (hosu[position[0]][position[1]] != null) {
                    System.out.print("🦐 \t");
                } else {
                    System.out.print("💧 \t");
                }
            }
            System.out.println();
        }
    }
}

class Angler {
    Scanner sc = new Scanner(System.in);
    int[] position;

    Angler() {

        //찌 입력 받기
        while (position[0] < 0 || position[1] < 0 || position[0] > 4 || position[1] > 4) {
            System.out.print("행 위치 : ");
            position[0] = sc.nextInt();
            System.out.print("열 위치 : ");
            position[1] = sc.nextInt();
        }
    }


}

public class Q1_5 {
    public static void main(String[] args) {

    }
}
