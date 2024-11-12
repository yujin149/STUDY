package Day05_test;

import java.util.Scanner;

public class Q4_1 {
    static int seatList(boolean[][] seat) {
        int count = 0;
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                seat[i][j] = true;
                count++;
            }
        }
        return count;
    }

    static void inputSeat(Scanner sc, int count, int[] num) {
        System.out.println("예약하실 좌석을 입력해주세요.(총 " + count + "석)");
        System.out.print("행 입력 : ");
        num[0] = sc.nextInt();
        System.out.print("열 입력 : ");
        num[1] = sc.nextInt();
    }

    static int reservation(int count, int[] num, boolean[][] seat) {
        if (num[0] > 0 && num[0] <= seat.length && num[1] > 0 && num[1] <= seat[0].length) {
            if (seat[num[0] - 1][num[1] - 1]) {
                seat[num[0] - 1][num[1] - 1] = false;
                System.out.println("예약이 완료되었습니다.");
                count--;
            } else {
                System.out.println("이미 예약된 자리입니다. 다시 예약해주세요.");
                System.out.println("======== 예약 가능한 자리 (총 " + count + "석) ========");
                for (int i = 0; i < seat.length; i++) {
                    for (int j = 0; j < seat[i].length; j++) {
                        if (seat[i][j]) {
                            System.out.println("[" + (i + 1) + "][" + (j + 1) + "]");
                        }
                    }
                }
            }
        } else {
            System.out.println("잘못된 입력입니다.");
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] seat = new boolean[9][2];
        int[] num = new int[2];

        int count = seatList(seat);
        while (count > 0) {
            inputSeat(sc, count, num);
            count = reservation(count, num, seat);
        }

        System.out.println("모든 좌석이 예약되었습니다.");
    }
}
