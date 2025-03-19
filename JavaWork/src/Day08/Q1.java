package Day08;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

    static int fishRandomMake(boolean[][] hosu, Random r, int fishCount) {
        for (int i = 0; i < 3; i++) {
            int hy = r.nextInt(5); // 0~4 난수를 받아서 정수 변수 h에 대입
            int hx = r.nextInt(5);// 0~4 난수를 받아서 정수 변수 y에 대입
            //5x5 배열에 h행과 y 열에 값이 true 이면 실행
            if (hosu[hy][hx]) { // true
                //for문 초기화변수 i를 1 감소
                i--;
            }
            //5x5 배열에 h행과 y 열에 값이 false 이면 실행
            else {
                //5x5 배열에 h행과 y열안에 값을 true로 변경
                hosu[hy][hx] = true;
                fishCount++;
            }
        }
        return fishCount;
    }

    static void noCastingPrint(boolean[][] hosu) {
        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (hosu[i][j]) { //true
                    System.out.print("🦑");
                } else { // false
                    System.out.print("🔵");
                }
            }
            System.out.println();
        }
    }

    static void castingFisher(int[] fisher, Scanner sc) {
        while (fisher[0] < 0 || fisher[0] > 4 || fisher[1] < 0 || fisher[1] > 4) {
            System.out.print("행 입력 : ");
            fisher[0] = sc.nextInt();
            System.out.print("열 입력 : ");
            fisher[1] = sc.nextInt();
        }

        System.out.println("y : " + fisher[0] + ", x : " + fisher[1]);
    }

    static int checkFish(boolean[][] hosu, int[] fisher, int fishCount) {
        if (hosu[fisher[0]][fisher[1]]) {
            System.out.println("물고기를 잡았습니다.");
            hosu[fisher[0]][fisher[1]] = false;
            fishCount--;
        }
        return fishCount;
    }

    static void castingPrint(boolean[][] hosu, int y, int x) {
        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                //1.찌위치
                if (i == y && j == x) {
                    System.out.print("🍡");
                }
                //2.물고기
                else if (hosu[i][j]) { //true
                    System.out.print("🦑");
                }
                //3.아무것도 없는
                else { // false
                    System.out.print("🔵");
                }
            }
            System.out.println();
        }
    }

    static int fisherMoveInput(Scanner sc) {
        System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
        int num = sc.nextInt();
        return num;
    }

    static void fisherMove(int[] fisher, int num) {
        if (num == 1) {
            fisher[0]--;
            if (fisher[0] < 0) {
                System.out.println("더이상 위로 움직일 수 없습니다.");
                fisher[0] = 0;
            }
        } else if (num == 2) {
            fisher[0]++;
            if (fisher[0] > 4) {
                System.out.println("더이상 아래로 움직일 수 없습니다.");
                fisher[0] = 4;
            }
        } else if (num == 3) {
            fisher[1]--;
            if (fisher[1] < 0) {
                System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                fisher[1] = 0;
            }
        } else if (num == 4) {
            fisher[1]++;
            if (fisher[1] > 4) {
                System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                fisher[1] = 4;
            }
        } else {
            System.out.println("잘못된 입력 입니다.");
        }
    }

    static void start() {
        //왜 기분이 안좋아요?
        //0. 호수 만들기[5][5], 입력객체생성 , Random 객체 생성 , 입력에 필요한 캐스팅 변수 2개 생성 ,물고기 변수
        Random r = new Random(); // 랜덤객체를 생성해서 변수 r에 대입
        boolean[][] hosu = new boolean[5][5]; // 5x5 boolear 배열을 객체를 생성하고 hosu에 대입
        Scanner sc = new Scanner(System.in);
        int fishCount = 0;
        fishCount = fishRandomMake(hosu, r, fishCount);
        noCastingPrint(hosu);
        int[] fisher = new int[2];
        fisher[0] = -1;
        fisher[1] = -1;
        castingFisher(fisher, sc);
        fishCount = checkFish(hosu, fisher, fishCount);
        castingPrint(hosu, fisher[0], fisher[1]);
//---------------------------------------------------------------------------------
        // 물고기 잡을때까지 반복
        while (fishCount > 0) {
            int num = fisherMoveInput(sc);
            fisherMove(fisher, num);
            fishCount = checkFish(hosu, fisher, fishCount);
            castingPrint(hosu, fisher[0], fisher[1]);
        }
        //----------------------------------------------------------------------------------------
        System.out.println("물고기를 모두 잡았습니다.");
    }

    public static void main(String[] args) {
        start();
    }
}
