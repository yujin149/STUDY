package Day06_test;

import java.util.Scanner;

public class arrayPractice06_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            int idNum = sc.nextInt();
            arr[i] = idNum;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("총 합 : " + sum);
    }
}
