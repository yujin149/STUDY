package Day06_test;

import java.util.Random;
import java.util.Scanner;

public class Q1_1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        boolean[][] hosu = new boolean[5][5];
        int fishCnt = 0;

        for (int i = 0; i < 3; i++) {
            int hy = r.nextInt(5);
            int hx = r.nextInt(5);

            if (hosu[hy][hx]) {
                i--;
            } else {
                hosu[hy][hx] = true;
                fishCnt++;
            }
        }

        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (hosu[i][j]) {
                    System.out.print("🦐\t");
                } else {
                    System.out.print("💧\t");
                }
            }
            System.out.println();
        }

        int x = -1;
        int y = -1;

        while (x < 0 || x > 4 || y < 0 || y > 4) {
            System.out.print("행 입력 : ");
            y = sc.nextInt();
            System.out.print("열 입력 : ");
            x = sc.nextInt();
        }

        if (hosu[y][x]) {
            System.out.println("물고기를 잡았습니다.");
            hosu[y][x] = false;
            fishCnt--;
        }

        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (i == y && j == x) {
                    System.out.print("❤️ \t"); //찌 위치
                } else if (hosu[i][j]) {
                    System.out.print("🦐 \t");
                } else {
                    System.out.print("💧 \t");
                }
            }
            System.out.println();
        }

        while (true) {
            System.out.println("1.위 2.아래 3.왼쪽 4.오른쪽");
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();
            if (num == 1) {
                y--;
                if (y < 0) {
                    System.out.println("더이상 위로 움직일 수가 없습니다.");
                    y = 0;
                }
            } else if (num == 2) {
                y++;
                if (y > 4) {
                    System.out.println("더이상 아래로 움직일 수 없습니다.");
                    y = 4;
                }
            } else if (num == 3) {
                x--;
                if (x < 0) {
                    System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                    x = 0;
                }
            } else if (num == 4) {
                x++;
                if (x > 4) {
                    System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                    x = 4;
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            if (hosu[y][x]) {
                System.out.println("물고기를 잡았습니다.");
                hosu[y][x] = false;
                fishCnt--;
            }

            for (int i = 0; i < hosu.length; i++) {
                for (int j = 0; j < hosu[i].length; j++) {
                    if (i == y && j == x) {
                        System.out.print("❤️ \t"); //찌 위치
                    } else if (hosu[i][j]) {
                        System.out.print("🦐 \t");
                    } else {
                        System.out.print("💧 \t");
                    }
                }
                System.out.println();
            }


            if (fishCnt == 0) {
                System.out.println("물고기를 전부 잡았습니다.");
                break;
            }
        }
    }
}
