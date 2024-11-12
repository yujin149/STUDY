package Day06_test;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int[][] hosu = new int[5][5]; //5X5 호수
        int fishCnt = 0; //물고기 갯수

        for (int i = 0; i < 3; i++) { //물고기 총 3마리 랜덤배치
            int hy = r.nextInt(5); // 인덱스 0~4
            int hx = r.nextInt(5);
            if (hosu[hy][hx] == 1) {
                i--; //해당 위치가 1이면 반복문 다시 돌리기
            } else {
                hosu[hy][hx] = 1; //그렇지 않으면 1 넣어주기
                fishCnt++; //물고기 갯수 증가
            }
        }

        //호수 출력
        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (hosu[i][j] == 1) {
                    System.out.print("🦐 \t"); //1일때 물고기 출력
                } else {
                    System.out.print("💧 \t");
                }
            }
            System.out.println();
        }


        int y = -1;
        int x = -1;
        //y와 x가 반복문 조건에 맞아야 입력 할 수 있으므로,

        while (y < 0 || y > 4 || x < 0 || x > 4) { //인덱스 위치가 0~4이 아닐때, 다시한번 입력
            System.out.print("행 입력 : ");
            y = sc.nextInt();
            System.out.print("열 입력 : ");
            x = sc.nextInt();
        }

        System.out.println("y : " + y + ", x : " + x);

        if (hosu[y][x] == 1) {
            System.out.println("물고기를 잡았습니다.");
            hosu[y][x] = 0;
            fishCnt--;
        }

        //캐스팅 후 호수 출력
        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (i == y && j == x) {
                    System.out.print("❤️ \t"); //찌 위치
                } else if (hosu[i][j] == 1) {
                    System.out.print("🦐 \t");
                } else {
                    System.out.print("💧 \t");
                }
            }
            System.out.println();
        }

        while (fishCnt > 0) {
            //1.위 2.아래 3.왼쪽 4.오른쪽
            System.out.println("1.위 2.아래 3.왼쪽 4.오른쪽");
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();

            if (num == 1) {
                y--;
                if (y < 0) {
                    System.out.println("더이상 위로 움직일 수 없습니다.");
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
                System.out.println("잘못된 입력 입니다.");
            }
            if (hosu[y][x] == 1) {
                System.out.println("물고기를 잡았습니다.");
                hosu[y][x] = 0;
                fishCnt--;
            }

            for (int i = 0; i < hosu.length; i++) {
                for (int j = 0; j < hosu[i].length; j++) {
                    if (i == y && j == x) {
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
