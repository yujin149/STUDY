package Day06_test;

import java.util.Random;
import java.util.Scanner;

public class Q1_3 {
    static int fish(Random r, int[][] hosu) {
        int col;
        int row;
        int fishcount = 0;
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
        return fishcount;
    }

    static void print(int[][] hosu) {
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
    }

    static void inputLoc(int[] xy, Scanner sc) {
        xy[0] = -1;
        xy[1] = -1;
        while (xy[0] < 0 || xy[0] > 4 || xy[1] < 0 || xy[1] > 4) {
            System.out.print("행 입력 : ");
            xy[0] = sc.nextInt();
            System.out.print("열 입력 : ");
            xy[1] = sc.nextInt();
        }
    }

    static void castingPrint(int[][] hosu, int[] xy) {
        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (i == xy[0] && j == xy[1]) {
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

    static void moving(int fishcount, Scanner sc, int[] xy, int[][] hosu) {
        while (fishcount > 0) {
            System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
            int num = sc.nextInt();

            if (num == 1) {
                xy[0]--;
                if (xy[0] < 0) {
                    System.out.println("더이상 위로 움직일 수 없습니다.");
                    xy[0] = 0;
                }
            } else if (num == 2) {
                xy[0]++;
                if (xy[0] > 4) {
                    System.out.println("더이상 아래로 움직일 수 없습니다.");
                    xy[0] = 4;
                }
            } else if (num == 3) {
                xy[1]--;
                if (xy[1] < 0) {
                    System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                    xy[1] = 0;
                }
            } else if (num == 4) {
                xy[1]++;
                if (xy[1] > 4) {
                    System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                    xy[1] = 4;
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            if (hosu[xy[0]][xy[1]] == 1) {
                System.out.println("물고기를 잡았습니다.");
                hosu[xy[0]][xy[1]] = 0;
                fishcount--;
            }

            castingPrint(hosu, xy);
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int[][] hosu = new int[5][5];
        int[] xy = new int[2];

        int fishcount = fish(r, hosu);
        print(hosu);
        inputLoc(xy, sc);
        castingPrint(hosu, xy);
        moving(fishcount, sc, xy, hosu);
        System.out.println("물고기를 모두 잡았습니다.");
    }
}
