package Day05_test;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        boolean[][] seat = new boolean[9][2];
        int count = 0;
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                seat[i][j] = true;
                count++;
            }
        }

        Scanner sc = new Scanner(System.in);

        while (count > 0) {
            System.out.println("예약하실 좌석을 입력해주세요.(총 " + (count) + "석)");
            System.out.print("행 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("열 입력 : ");
            int num2 = sc.nextInt();
            if (num1 > 0 && num1 < 10 && num2 > 0 && num2 < 3) {
                if (seat[num1 - 1][num2 - 1] == true) {
                    seat[num1 - 1][num2 - 1] = false;
                    System.out.println("예약이 완료되었습니다.");
                    count--;
                } else {
                    System.out.println("예약이 완료된 자리입니다. 다시 예약해주세요.");
                    System.out.println("======== 예약 가능한 자리 (총 " + (count) + "석) ========");
                    for (int i = 0; i < seat.length; i++) {
                        for (int j = 0; j < seat[i].length; j++) {
                            if (seat[i][j] == false) {
                                continue;
                            }
                            System.out.println("[" + (i + 1) + "][" + (j + 1) + "]");


                        }
                    }
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        System.out.println("모든 좌석이 예약되었습니다.");
    }
}
