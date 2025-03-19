package Day05_test;

import java.util.Random;

public class Q2_1 {

    static void ranArray(Random r, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(11);
            System.out.print("array[" + i + "] : " + array[i] + ", ");
        }
    }

    static void maxNum(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.print("가장 큰 수의 index : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];

        ranArray(r, array);
        maxNum(array);


    }
}
