package Day05_test;

import java.util.Random;

class Array {
    int[] array = new int[10];

    Array() {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {

            array[i] = r.nextInt(11);
            System.out.print("array[" + i + "] : " + array[i] + ", ");
        }
        System.out.println();
    }

    int[] getArray() {
        return array;
    }
}

class MaxNum {
    Array array;
    int max = 0;

    MaxNum() {
        Array array = new Array();

        for (int i = 0; i < array.getArray().length; i++) {
            if (max < array.getArray()[i]) {
                max = array.getArray()[i];
            }
        }

        System.out.print("가장 큰 수의 index : ");
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Q2_2 {
    public static void main(String[] args) {
        new MaxNum();
    }
}
