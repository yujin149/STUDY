package Day06_test;
/*
3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여
오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로
값을 넣어 출력하세요. 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우
“다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요.

출력 결과 예시
정수 : 4
다시 입력하세요.
정수 : -6
다시 입력하세요.
정수 : 5
1 2 3 2 1
 */

import java.util.Scanner;

public class arrayPractice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("5 이상의 홀수를 입력하세요.");
            System.out.print("정수 입력 : ");
            int num = sc.nextInt();

            if (num % 2 == 0 || num < 5) {
                System.out.println("다시 입력하세요.");
            } else {
               /* //int[] arr = new int[num];

                for (int i = 1; i <= num / 2 + 1; i++) {
                    System.out.print(i + " ");
                }
                for (int i = num / 2; i > 0; i--) {
                    System.out.print(i + " ");
                }
                */
                int[] arr = new int[num];
                for (int i = 0; i < num / 2; i++) {
                    for (int j = 1; j <= num / 2 + 1; j++) {
                        arr[i] = j;
                    }
                }
                for (int i = num / 2 + 1; i < num - 1; i--) {
                    for (int j = 1; j <= num / 2 + 1; j++) {
                        arr[i] = j;
                    }
                }
                for (int i = 0; i < num; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;
            }

        }
    }

}
