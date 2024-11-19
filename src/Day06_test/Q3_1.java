package Day06_test;

import java.util.Scanner;

public class Q3_1 {

    //세 과목 점수 입력받기 (주고 안받고)
    static int[] inputSubject() {
        int[] score = new int[3];
        Scanner sc = new Scanner(System.in);
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < score.length; i++) {
            System.out.print(subject[i] + " 점수 : ");
            score[i] = sc.nextInt();
        }
        return score;
    }

    // 평균학점 연산 (주고 받고)
    static double avgScore(int[] score) {
        return (score[0] + score[1] + score[2]) / 3.0;
    }


    //학점 출력 (주고 받고)
    static String unitAvg(double avg) {
        if (avg >= 95) {
            return "A+";
        } else if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // 잘못된 입력 값 확인 (안주고 받고)
    static void wrongCheck(int[] score) {
        if (score[0] > 100 || score[0] < 0 || score[1] > 100 || score[1] < 0 || score[2] > 100 || score[2] < 0) {
            wrongScore();
        } else {
            double avg = avgScore(score);
            String unit = unitAvg(avg);
            printUnit(avg, unit);
        }
    }

    //잘못된 입력 출력 (안주고 안받고)
    static void wrongScore() {
        System.out.println("점수를 잘못 입력하였습니다.");
    }

    //평균학점 출력 (안주고 받고)
    static void printUnit(double avg, String unit) {
        System.out.printf("평균은 %.1f이며, 학점은 %s입니다.", avg, unit);
    }

    public static void main(String[] args) {
        wrongCheck(inputSubject());
    }
}
