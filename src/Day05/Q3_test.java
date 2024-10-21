package Day05;

import java.util.Random;

public class Q3_test {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (arr[i] > arr[j]) {
                    break;
                }

            }
        }
    }
}
