package Day03;

import java.util.Scanner;

public class Q5_test {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.직사각형 2.정직삼각형 3.역직삼각형 4.피라미드 5.다이아몬드 6.종료");
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();
            if (num == 1) {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("행 입력 :");
                int num1 = sc1.nextInt();
                for (int i = 0; i < num1; i++) {
                    for (int j = 0; j < num1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (num == 2) {
                Scanner sc2 = new Scanner(System.in);
                System.out.print("행 입력 :");
                int num2 = sc2.nextInt();
                for (int i = 0; i < num2; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (num == 3) {
                Scanner sc3 = new Scanner(System.in);
                System.out.print("행 입력 :");
                int num3 = sc3.nextInt();
                for (int i = 0; i < num3; i++) {
                    for (int j = num3; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int str = 0; str < i + 1; str++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } else if (num == 4) {
                Scanner sc4 = new Scanner(System.in);
                System.out.print("숫자를 입력 : ");
                int num4 = sc.nextInt();
                for (int i = 0; i < num4; i++) {
                    for (int j = num4; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int str = 0; str < i + 1; str++) {
                        System.out.print("*");
                    }
                    for (int str = 0; str < i; str++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (num == 5) {
                Scanner sc5 = new Scanner(System.in);
                System.out.print("숫자를 입력 : ");
                int num5 = sc.nextInt();
                if (num5 % 2 == 0 || num5 < 0) {
                    System.out.println("잘못된 입력입니다.");
                } else {
                    int result = num5 / 2;
                    for (int i = 0; i < result + 1; i++) {
                        for (int j = result + 1; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int str = 0; str < i + 1; str++) {
                            System.out.print("*");
                        }
                        for (int str = 0; str < i; str++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < result; i++) {
                        for (int j = 0; j < i + 2; j++) {
                            System.out.print(" ");
                        }
                        for (int str = result; str > i; str--) {
                            System.out.print("*");
                        }
                        for (int str = result; str > i + 1; str--) {
                            System.out.print("*");
                        }
                        System.out.println();

                    }

                }
            } else if (num == 6) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
