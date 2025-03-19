package Day06;

import java.util.Scanner;

public class Q3_test {
    //주고 안받고
    static int korScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 : ");
        int kor = sc.nextInt();

        while (true) {
            if (kor >= 0 && kor <= 100) {
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        return kor;
    }

    static int engScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("영어 점수 : ");
        int eng = sc.nextInt();

        while (true) {
            if (eng >= 0 && eng <= 100) {
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        return eng;
    }

    static int mathScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수학 점수 : ");
        int math = sc.nextInt();

        while (true) {
            if (math >= 0 && math <= 100) {
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        return math;
    }

    static double avgScore(int num1, int num2, int num3) {
        double avg = ((double) num1 + num2 + num3) / 3;
        return avg;
    }

    static double result = avgScore(korScore(), engScore(), mathScore());


    public static void main(String[] args) {
        if (result >= 95) {
            System.out.printf("평균 %.1f이고 학점은 A+입니다.", result);
        } else if (result >= 90) { // A
            System.out.printf("평균 %.1f이고 학점은 A입니다.", result);
        } else if (result >= 85) { //B+
            System.out.printf("평균 %.1f이고 학점은 B+입니다.", result);
        } else if (result >= 80) { //B
            System.out.printf("평균 %.1f이고 학점은 B입니다.", result);
        } else if (result >= 75) { //C+
            System.out.printf("평균 %.1f이고 학점은 C+입니다.", result);
        } else if (result >= 70) { //C
            System.out.printf("평균 %.1f이고 학점은 C입니다.", result);
        } else if (result >= 60) { //D
            System.out.printf("평균 %.1f이고 학점은 D입니다.", result);
        } else { //F
            System.out.printf("평균 %.1f이고 학점은 F입니다.", result);
        }
    }


}
