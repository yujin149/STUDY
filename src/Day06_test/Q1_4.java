package Day06_test;

import java.util.Random;
import java.util.Scanner;

//1. 물고기
//2. 호수
//3. 낚시꾼
class Fish {
}

class Hosu {
    Fish[][] lake = new Fish[5][5];

    Hosu() {
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int hy = r.nextInt(5); // 0~4 난수를 받아서 정수 변수 h에 대입
            int hx = r.nextInt(5);// 0~4 난수를 받아서 정수 변수 y에 대입

            if (lake[hy][hx] != null) { //객체가 있으면,
                //for문 초기화변수 i를 1 감소
                i--;

            } else {
                //물고기가 있는 곳에 객체를 넣어줌.
                lake[hy][hx] = new Fish();
            }
        }
    }

    //낚시꾼이 지정한 위치의 물고기를 반환
    Fish giveFish(int[] position) {
        return lake[position[0]][position[1]];
    }

    // 지정 위치의 물고기를 제거(= null로 설정)
    void nullChange(int[] position) {
        lake[position[0]][position[1]] = null;
    }

    //호수 출력
    void printHosu(int[] position) {
        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                //1.찌위치
                // 처음에는 찌위치를 표시하지 않기 위해 -1 -1을 표기
                if (position[0] != -1 && position[1] != -1
                        && i == position[0] && j == position[1]) {
                    System.out.print("🍡");//입력받은 위치 표시
                }
                //2.물고기
                else if (lake[i][j] != null) { //객체가 있을때,
                    System.out.print("🦑");
                }
                //3.아무것도 없는
                else { // 객체가 없을때,
                    System.out.print("🔵");
                }
            }
            System.out.println();
        }
    }
}


class Fisher {
    //1. 찌위치
    int[] position;
    //2. 물고기 담는 그릇
    Fish[] bowl = new Fish[3];
    Scanner sc = new Scanner(System.in);

    //3. 움직이는 입력(기능)캐스팅
    Fisher() {
        while (position[0] < 0 || position[0] > 4 || position[1] < 0 || position[1] > 4) {
            System.out.print("행 입력 : ");
            position[0] = sc.nextInt();
            System.out.print("열 입력 : ");
            position[1] = sc.nextInt();
        }

        System.out.println("y : " + position[0] + ", x : " + position[1]);
    }

    //4. 물고기 받기
    void receiveFish(Fish f) {
        if (f != null) {
            System.out.println("물고기 잡았습니다.");
        }
        for (int i = 0; i < bowl.length; i++) {
            if (bowl[i] == null) {
                bowl[i] = f;
                break;
            }
        }
    }

    //5. 이동
    void fishMove() {
        System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
        int num = sc.nextInt();
        if (num == 1) {
            position[0]--;
            if (position[0] < 0) {
                System.out.println("더이상 위로 움직일 수 없습니다.");
                position[0] = 0;
            }
        } else if (num == 2) {
            position[0]++;
            if (position[0] > 4) {
                System.out.println("더이상 아래로 움직일 수 없습니다.");
                position[0] = 4;
            }
        } else if (num == 3) {
            position[1]--;
            if (position[1] < 0) {
                System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                position[1] = 0;
            }
        } else if (num == 4) {
            position[1]++;
            if (position[1] > 4) {
                System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                position[1] = 4;
            }
        } else {
            System.out.println("잘못된 입력 입니다.");
        }
    }

    //6.종료 확인 물고기 그릇
    boolean checkFish() {
        for (int i = 0; i < bowl.length; i++) {
            if (bowl[i] == null) {
                return true;
            }
        }
        return false;
    }
}

public class Q1_4 {
    public static void main(String[] args) {
        Hosu h = new Hosu();
        int[] temp = {-1, -1}; // 처음에는 찌위치를 표시하지 않기 위해 -1 -1을 표기
        h.printHosu(temp);
        Fisher f = new Fisher();

        //f.position 입력받은 찌위치
        //receiveFish는 giveFish가 null이 아니면 물고기가 잡힌 것이므로 bowl 배열에 물고기를 담는다.
        f.receiveFish(h.giveFish(f.position));

        //입력받은 위치에 물고기(객체)가 있으면 null 표기
        h.nullChange(f.position);
        //호수 출력
        h.printHosu(f.position);

        //찌위치 이동
        while (f.checkFish()) {
            f.fishMove();
            f.receiveFish(h.giveFish(f.position));
            h.nullChange(f.position);
            h.printHosu(f.position);
        }
        System.out.println("물고기 모두 잡았습니다.");
    }
}
