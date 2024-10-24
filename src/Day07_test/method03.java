package Day07_test;

import java.util.Scanner;

/*
1~n까지 합을 구해주는 메소드
배열의 인덱스는 사용자가 입력한 값이며,
10을 입력할 경우 1~10까지 더한 값이 출력되어야 한다.
 */
public class method03 {
    //1. 입력
    static int input() {
        //주고 안받고
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("1이상의 숫자를 입력해주세요.");
            System.out.print("숫자 입력 : ");
            num = sc.nextInt();
            if (num < 1) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            } else {
                return num;
            }
        }
    }


    //2. 합계 구하기
    static int sum() {
        int num = input();
        int[] arr = new int[num];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            result += arr[i];
        }
        return result;
    }

    //3. 출력
    public static void main(String[] args) {
        System.out.println("총 합 : " + sum());

    }
}
