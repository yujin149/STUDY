package Day05;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        //1. 배열생성과 랜덤 객체 생성
        int[] array = new int[10];
        Random r = new Random();

        int max = 0;
        //2. 랜덤값 배열에 넣기
        for (int i = 0; i < 10; i++) {
            array[i] = r.nextInt(11);
            System.out.print(array[i] + " ");
        }
        System.out.println();


        //3. 최대값 찾기
        for (int i = 0; i < 10; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        //4. 최대값 인덱스 출력
        for (int i = 0; i < 10; i++) {
            if (array[i] == max) {
                System.out.println("index : " + i);
            }
        }
    }
}
