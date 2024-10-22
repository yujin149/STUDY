package Day06_test;

import java.util.Scanner;

public class arrayPractice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 : ");
        int num = sc.nextInt();
        while (true) {
            if (num < 0) {
                System.out.println("잘못된 입력입니다.");
                System.out.print("양의 정수 : ");
                num = sc.nextInt();
            } else {
                break;
            }
        }

        int[] arr = new int[num];
        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
            value++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
