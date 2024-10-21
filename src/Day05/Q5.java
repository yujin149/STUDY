package Day05;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //입력 객체 생성
        Scanner sc = new Scanner(System.in);
        //비행기 좌석 배열 생성
        boolean[][] seat = new boolean[9][2]; //fasle

        int count = 18;
        while (count > 0) {
            //입력
            System.out.println("예약하실 좌석을 입력해주세요. (" + count + "석 )");
            System.out.println("행 : ");
            int h = sc.nextInt();
            System.out.println("열 : ");
            int y = sc.nextInt();

            if (h > 9 || h < 1 || y > 2 || y < 1) {
                System.out.println("잘못된 입력입니다.");
            } else {
                if (seat[h - 1][y - 1]) { //true
                    System.out.println("비어 있는 좌석");
                    for (int i = 0; i < seat.length; i++) {
                        for (int j = 0; j < seat[i].length; j++) {
                            if (!seat[i][j]) {
                                System.out.println("행 : " + (i + 1) + " " + (j + 1));
                            }

                        }
                    }
                } else {
                    System.out.println("예약이 완료 됐습니다.");
                    seat[h - 1][y - 1] = true;
                    count--;
                }
            }

        }
        System.out.println("모든 자리가 예약 됐습니다.");
    }
}
