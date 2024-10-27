package Practice_241025;

import java.util.Scanner;

public class Q6_2 {

    static void inputSubject(Scanner sc, int[] subject) {
        System.out.print("국어 점수 : ");
        subject[0] = sc.nextInt();
        System.out.print("영어 점수 : ");
        subject[1] = sc.nextInt();
        System.out.print("수학 점수 : ");
        subject[2] = sc.nextInt();
    }

    static double average(int[] subject) {
        return (subject[0] + subject[1] + subject[2]) / 3.0;
    }

    static boolean print(int[] subject, double avg) {
        if (subject[0] <= 100 && subject[0] >= 0 && subject[1] <= 100 && subject[1] >= 0 && subject[2] <= 100 && subject[2] >= 0) {
            if (avg >= 95) {
                System.out.printf("평균은 %.1f이고 학점은 A+입니다.", avg);

            } else if (avg >= 90) {
                System.out.printf("평균은 %.1f이고 학점은 A입니다.", avg);

            } else if (avg >= 85) {
                System.out.printf("평균은 %.1f이고 학점은 B+입니다.", avg);

            } else if (avg >= 80) {
                System.out.printf("평균은 %.1f이고 학점은 B입니다.", avg);

            } else if (avg >= 75) {
                System.out.printf("평균은 %.1f이고 학점은 C+입니다.", avg);

            } else if (avg >= 70) {
                System.out.printf("평균은 %.1f이고 학점은 C입니다.", avg);

            } else if (avg >= 60) {
                System.out.printf("평균은 %.1f이고 학점은 D입니다.", avg);

            } else {
                System.out.printf("평균은 %.1f이고 학점은 F입니다.", avg);

            }
            return false;
        } else {
            if (subject[0] < 0 || subject[0] > 100) {
                System.out.print("국어 ");
            }
            if (subject[1] < 0 || subject[1] > 100) {
                System.out.print("영어 ");
            }
            if (subject[2] < 0 || subject[2] > 100) {
                System.out.print("수학 ");
            }
            System.out.println("점수가 잘 못 입력 됐습니다.");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] subject = new int[3];
        while (true) {
            inputSubject(sc, subject);

            if (!print(subject, average(subject))) { //false를 반환하면 break
                break;
            }

        }


    }
}
