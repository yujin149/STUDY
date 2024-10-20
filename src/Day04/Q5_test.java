package Day04;

import java.util.Random;

public class Q5_test {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        int temp;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

