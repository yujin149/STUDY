package Day07;

import java.util.Scanner;

/*
    별찍기
 */
public class Q4_test {
    //첫화면 입력 1.구구단 출력 2.별찍기 출력 3. 종료
    static int inputStart() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.구구단 출력\t2.별찍기 출력\t3. 종료");
        System.out.print("번호 입력 : ");
        return sc.nextInt();
    }

    //원하는 구구단 선택
    static int inputMulTable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.원하는 구구단 출력\t2.전체 구구단 출력\t3. 종료");
        System.out.print("번호 입력 : ");
        return sc.nextInt();
    }

    //별찍기 선택 입력
    static int inputStarList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.직사각형\t2.정직삼각형\t3. 역직삼각형\t4.피라미드\t5.다이아몬드\t6.종료");
        System.out.print("번호 입력 : ");
        return sc.nextInt();
    }

    //무한반복 첫화명
    static void infi() {
        int input = inputStart();
        if (input == 1) {
            inputMulTable();

        } else if (input == 2) {
            inputStarList();

        } else if (input == 3) {
            System.out.println("프로그램을 종료합니다.");

        } else {
            System.out.println("잘못된 입력입니다.");
            infi();
        }
    }

    //구구단
    static void gugudan() {
        int num = inputMulTable();
        if (num == 1) {
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("원하는 구구단 : ");
                int dan = sc.nextInt();

                if (dan >= 2 && dan <= 9) {
                    System.out.println(dan + "단!!!");
                    for (int times = 1; times <= 9; times++) {
                        System.out.println(dan + "X" + times + "=" + dan * times);
                    }
                    break;
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            }
        } else if (num == 2) {
            for (int dan = 2; dan <= 9; dan++) {
                System.out.println(dan + "단!!!");
                for (int times = 1; times <= 9; times++) {
                    System.out.println(dan + "X" + times + "=" + dan * times);
                }
                System.out.println();
            }
        } else if (num == 3) {
            System.out.println("프로그램을 종료합니다.");

        } else {
            System.out.println("잘못된 입력입니다.");
            inputMulTable();
        }
    }


    //별찍기
    static void star() {
        Scanner sc = new Scanner(System.in);
        int num = inputStarList();
        if (num == 1) {

            System.out.print("숫자 입력");
            int count = sc.nextInt();
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (num == 2) {

            System.out.print("숫자 입력");
            int count = sc.nextInt();
            for (int i = 0; i < count; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (num == 3) {
            System.out.print("숫자 입력");
            int count = sc.nextInt();
            for (int i = 0; i < count; i++) {
                for (int j = count - 1; j >= 0; j--) {
                    if (i < j) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

        } else if (num == 4) {
            System.out.print("숫자 입력");
            int count = sc.nextInt();
            for (int i = 0; i < count; i++) {
                for (int j = count - 1; j >= 0; j--) {
                    if (i < j) {
                        System.out.print(" ");
                    } else {
                        for (int k = 0; k <= i * 2; k++) {
                            System.out.print("*");
                        }
                        break;
                    }
                }
                System.out.println();
            }
        } else if (num == 5) {
            System.out.print("숫자 입력");
            int count = sc.nextInt();
            for (int i = 0; i < count / 2 + 1; i++) {
                for (int j = count / 2; j >= 0; j--) {
                    if (i < j) {
                        System.out.print(" ");
                    } else {
                        for (int k = 0; k <= i * 2; k++) {
                            System.out.print("*");
                        }
                        break;
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < count / 2; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                //7
                //4
                // 3 -> 0 5 -> 1 7 -> 2 9 -> 3
                for (int k = count / 2 + (count / 2 - 1); k - (i * 2) > 0; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (num == 6) {
            //3. 종료
            System.out.println("프로그램을 종료합니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
            inputStarList();
        }
    }

    //출력
    static void print() {

    }

    public static void main(String[] args) {
        infi();
    }


}
