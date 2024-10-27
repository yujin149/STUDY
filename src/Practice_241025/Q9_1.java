package Practice_241025;

import java.util.Scanner;

public class Q9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.직사각형\t2. 정직삼각형\t3. 역직삼각형\t4. 피라미드\t5. 다이아몬드\t6. 종료");
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();

            if (num > 0 && num < 7) {
                if (num == 1) {
                    System.out.print("행 입력 : ");
                    int row = sc.nextInt();

                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < row; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                } else if (num == 2) {
                    System.out.print("행 입력 : ");
                    int row = sc.nextInt();
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                } else if (num == 3) {
                    System.out.print("행 입력 : ");
                    int row = sc.nextInt();
                    for (int i = 0; i < row; i++) {
                        for (int j = row - 1; j >= 0; j--) {
                            if (i < j) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                } else if (num == 4) {
                    System.out.print("행 입력 : ");
                    int row = sc.nextInt();
                    for (int i = 0; i < row; i++) {

                        for (int j = row - 1; j > i; j--) {
                            System.out.print(" ");
                        }

                        for (int k = 0; k <= i * 2; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                } else if (num == 5) {
                    System.out.print("행 입력 : ");
                    int row = sc.nextInt();

                    for (int i = 0; i < row / 2 + 1; i++) {

                        for (int j = row / 2; j > i; j--) {
                            System.out.print(" ");
                        }

                        for (int k = 0; k <= i * 2; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    int stars = row; //별 개수 초기화
                    for (int i = 0; i < row / 2; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" ");
                        }
                        // 별 출력
                        stars -= 2; //이전 줄에서 별 -2씩 빼기
                        for (int k = 0; k < stars; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                } else {
                    System.out.println("프로그램 종료");
                    break;
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
