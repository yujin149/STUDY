package Day06_test;

import java.util.Scanner;

public class Q3 {
    static int[] inputSubject() { //주고 안받고
        int[] score = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            String subject;
            if (i == 0) {
                subject = "국어";
            } else if (i == 1) {
                subject = "영어";
            } else {
                subject = "수학";
            }
            System.out.print(subject + " 점수 : ");
            score[i] = sc.nextInt();

            if (score[i] > 100 || score[i] < 0) {
                wrongScore();
                i--;
            }

        }

        return score;
    }

    //평균 연산 (주고받고)
    static double avgScore(int[] score) {
        return (score[0] + score[1] + score[2]) / 3.0;
    }

    //학점 출력 (안주고 받고)
    static void printAvg(int[] score) {
        double avg = avgScore(score);
        if (avg >= 95) {
            System.out.printf("평균은 %.1f이며, 학점은 A+입니다.", avg);
        } else if (avg >= 90) {
            System.out.printf("평균은 %.1f이며, 학점은 A입니다.", avg);
        } else if (avg >= 80) {
            System.out.printf("평균은 %.1f이며, 학점은 B입니다.", avg);
        } else if (avg >= 70) {
            System.out.printf("평균은 %.1f이며, 학점은 C입니다.", avg);
        } else if (avg >= 60) {
            System.out.printf("평균은 %.1f이며, 학점은 D입니다.", avg);
        } else {
            System.out.printf("평균은 %.1f이며, 학점은 F입니다.", avg);
        }
    }

    // 잘못된 입력 값 확인 (안주고 받고)
//    static void wrongCheck(){
//        if (score[i] > 100 || score[i] < 0) {
//            wrongScore();
//            i--;
//        }
//    }

    //잘못된 입력 출력 (안주고 안받고)
    static void wrongScore() {
        System.out.println("점수를 잘못 입력하였습니다.");
    }


    public static void main(String[] args) {
        int[] score = inputSubject();
        printAvg(score);
    }
}
