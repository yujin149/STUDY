package Day05_test;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] array = new int[10];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(11);
            System.out.print("array[" + i + "] : " + array[i] + ", ");

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
}
