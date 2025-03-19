package Day07;
/*
 1. 입력
 2. 1~3까지 입력 -> 1. 구구단 2.별찍기 3.종료
 3. 1인경우 1.원하는 구구단 2.전체 구구단
 4. 2인경우 1.네모 2.직삼각형 3.역직삼각형 4. 피라미드 5.다이아몬드
 5. 3입력 종료
 6. 위에 값 입력 X 잘못된 입력입니다. 출력
 */

import java.util.Scanner;

public class Q4 {
    static int mainInput(Scanner sc) {
        System.out.print("1.구구단 출력");
        System.out.print("2.별찍기 출력");
        System.out.print("3.종료");
        int num = sc.nextInt();
        return num;
    }

    static void mainStart(Scanner sc) {
        while (true) {
            int num = mainInput(sc);
            if (num == 1) {
                //구구단
                guguMain(sc, guguInput(sc));
            } else if (num == 2) {
                //별찍기
                starMain(starInput(sc));
            } else if (num == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                wrongPrint();
            }
        }
    }

    static int guguInput(Scanner sc) {
        System.out.println("1. 원하는 구구단 출력");
        System.out.println("2. 전체 구구단 출력");
        return sc.nextInt();
    }

    static void guguMain(Scanner sc, int guNum) {
        if (guNum == 1) {
            wantGugu(sc);
        } else if (guNum == 2) {
            allGugu();
        } else {
            wrongPrint();
        }
    }

    static void wantGugu(Scanner sc) {
        System.out.print("원하는 구구단 : ");
        int dan = sc.nextInt();
        if (dan >= 2 && dan <= 9) {
            System.out.println(dan + "단!!!");
            for (int times = 1; times <= 9; times++) {
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
        } else {
            wrongPrint();
        }
    }

    static void allGugu() {
        int dan;
        int times;
        for (times = 1; times <= 9; times++) {
            for (dan = 2; dan <= 5; dan++) {
                System.out.printf("%d * %d = %d\t", dan, times, dan * times);
            }
            System.out.println();
        }
        System.out.println();
        for (times = 1; times <= 9; times++) {
            for (dan = 6; dan <= 9; dan++) {
                System.out.printf("%d * %d = %d\t", dan, times, dan * times);
            }
            System.out.println();
        }
    }

    static int starInput(Scanner sc) {
        System.out.println("1.직사각형");
        System.out.println("2.정직삼각형");
        System.out.println("3.역직삼각형");
        System.out.println("4.피라미드");
        System.out.println("5.다이아몬드");
        return sc.nextInt();
    }

    static void starMain(int starNum) {
        if (starNum == 1) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (starNum == 2) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (starNum == 3) {
            for (int i = 0; i < 5; i++) {
                for (int j = 4; j >= 0; j--) {
                    if (i < j) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        } else if (starNum == 4) {
            for (int i = 0; i < 5; i++) {
                for (int j = 4; j >= 0; j--) {
                    if (i < j) {
                        System.out.print(" ");
                    } else {
                        //        0           0 0
                        //      0 1 2         1 2
                        //    0 1 2 3 4       2 4
                        //  0 1 2 3 4 5 6     3 6
                        // 0 1 2 3 4 5 6 7 8  4 8
                        for (int k = 0; k <= i * 2; k++) {
                            System.out.print("*");
                        }
                        break;
                    }
                }
                System.out.println();
            }
        } else if (starNum == 5) {
            for (int i = 0; i < 3; i++) {
                for (int j = 2; j >= 0; j--) {
                    if (i < j) {
                        System.out.print(" ");
                    } else {
                        //        0           0 0
                        //      0 1 2         1 2
                        //    0 1 2 3 4       2 4
                        //  0 1 2 3 4 5 6     3 6
                        // 0 1 2 3 4 5 6 7 8  4 8
                        for (int k = 0; k <= i * 2; k++) {
                            System.out.print("*");
                        }
                        break;
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 3; k - (i * 2) > 0; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            wrongPrint();
        }
    }

    static void wrongPrint() {
        System.out.println("잘못된 입력입니다.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainStart(sc);
    }
}
