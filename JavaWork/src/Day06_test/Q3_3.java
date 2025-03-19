package Day06_test;

import java.util.Scanner;

class InputUser {
    int[] score = new int[3];
    String[] subjects = {"국어", "영어", "수학"};

    InputUser() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {
            System.out.print(subjects[i] + " 점수 : ");
            score[i] = sc.nextInt();

            if (score[i] > 100 || score[i] < 0) {
                System.out.println(subjects[i] + "점수를 잘못 입력하였습니다.");
                i--;
            }
        }
    }

    public int[] getScore() {
        return score;
    }
}

class Avg {
    InputUser input;

    Avg() {
        input = new InputUser();
    }

    double calcAvg() {
        int sum = 0;
        for (int i = 0; i < input.getScore().length; i++) {
            sum += input.getScore()[i];
        }
        return sum / 3.0;
    }

    void print(double avg) {
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
}

public class Q3_3 {
    public static void main(String[] args) {
        Avg avg = new Avg();
        avg.print(avg.calcAvg());
    }
}
