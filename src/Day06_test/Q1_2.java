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

        //이동
        while (fishcount > 0) {
            System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
            int num = sc.nextInt();

            if (num == 1) {
                x--;
                if (x < 0) {
                    System.out.println("더이상 위로 움직일 수 없습니다.");
                    x = 0;
                }
            } else if (num == 2) {
                x++;
                if (x > 4) {
                    System.out.println("더이상 아래로 움직일 수 없습니다.");
                    x = 4;
                }
            } else if (num == 3) {
                y--;
                if (y < 0) {
                    System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                    y = 0;
                }
            } else if (num == 4) {
                y++;
                if (y > 4) {
                    System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                    y = 4;
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            if (hosu[x][y] == 1) {
                System.out.println("물고기를 잡았습니다.");
                hosu[x][y] = 0;
                fishcount--;
            }
            //출력
            for (int i = 0; i < hosu.length; i++) {
                for (int j = 0; j < hosu[i].length; j++) {
                    if (i == x && j == y) {
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
        System.out.println("물고기를 모두 잡았습니다.");

    }
}
