package Day05;

import java.util.Scanner;

public class Q5_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][2];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
                //System.out.println(arr[i][j]);
            }
        }


        while (true) {
            System.out.println("예약하실 좌석을 입력해주세요. ( 총 " + count + "석 )");
            System.out.print("행 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("행 입력 : ");
            int num2 = sc.nextInt();

            if (num1 > 9 || num1 < 0 || num2 > 1 || num2 < 0) {
                System.out.println("잘못된 입력입니다.");
            } else if (arr[num1][num2] == -1) {
                System.out.println("예약이 완료된 자리입니다. 다시 예약해주세요.");
                System.out.println("비어있는 좌석");
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] == -1) {
                            continue;
                        }
                        System.out.println("비어있는 좌석은 " + i + " " + j);
                    }
                }
            } else {
                arr[num1][num2] = -1;
                System.out.println("예약이 완료 됐습니다.");
                count--;

                if (count == 0) {
                    System.out.println("예약이 끝났습니다.");
                    break;
                }


            }
        }

    }
}
