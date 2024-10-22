package Day06_test;

import java.util.Scanner;

public class arrayPractice06_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("총 합 : " + sum);

        sc.close();

    }
}
