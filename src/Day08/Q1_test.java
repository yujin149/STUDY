package Day08;

import java.util.Random;

public class Q1_test {
    public static void main(String[] args) {
        //호수
        Random r = new Random();
        int[][] hosu = new int[5][5];


        //물고기 3마리 랜덤 위치에 넣기
        //1은 총 3개(물고기 들어갈 위치)
        for (int i = 0; i < 3; i++) {
            int x = r.nextInt(5); //배열 0
            int y = r.nextInt(5); //배열 1
            if (hosu[x][y] == 1) { //이미 값이 1이면,
                i--; // i 1을 빼서 다시 반복문 돌리기
            } else { // 그렇지 않으면 1을 넣어줌.
                hosu[x][y] = 1;
            }
        }

        //물과 물고기 표시하기
        for (int i = 0; i < hosu.length; i++) {
            for (int j = 0; j < hosu[i].length; j++) {
                if (hosu[i][j] == 1) { //이 위치에 1을 가지고 있으면 물고기 표시
                    System.out.print(" 🦐");
                } else {
                    System.out.print(" 💧"); //1이 아니면 물 표시
                }
            }
            System.out.println();
        }

    }
}
