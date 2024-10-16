package Day02;

/*
 * 1. 입력 -> 국어, 영어, 수학
 * 2. 분기를 통한 출력
 * 2-1 올바른 경우 평균과 학점 출력
 * 2-2 올바르지 않은 경우 - > 과목마다 잘 못 입력됬습니다.
 * */

import java.util.Scanner;

public class Q5_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 :");
        int kor = sc.nextInt();

        System.out.print("영어 : ");
        int eng = sc.nextInt();

        System.out.print("수학 : ");
        int math = sc.nextInt();

        double aver = (kor + eng + math) / 3.0;

        if (kor > 100 || kor < 0 || eng > 100 || eng < 0 || math > 100 || math < 0) {
            if (kor > 100 || kor < 0) {
                System.out.print("국어 ");
            }
            if (eng > 100 || eng < 0) {
                System.out.print("영어 ");
            }
            if (math > 100 || math < 0) {
                System.out.print("수학 ");
            }
            System.out.print("점수가 잘 못 입력 됐습니다.");
        } else if (aver >= 95) {
            System.out.printf("평균 %.1f점이고 학점은 A+ 입니다.", aver);
        } else if (aver >= 90) {
            System.out.printf("평균 %.1f점이고 학점은 A 입니다.", aver);
        } else if (aver >= 85) {
            System.out.printf("평균 %.1f점이고 학점은 B+ 입니다.", aver);
        } else if (aver >= 80) {
            System.out.printf("평균 %.1f점이고 학점은 B 입니다.", aver);
        } else if (aver >= 75) {
            System.out.printf("평균 %.1f점이고 학점은 C+ 입니다.", aver);
        } else if (aver >= 70) {
            System.out.printf("평균 %.1f점이고 학점은 C 입니다.", aver);
        } else if (aver >= 60) {
            System.out.printf("평균 %.1f점이고 학점은 D 입니다.", aver);
        } else {
            System.out.printf("평균 %.1f점이고 학점은 F 입니다.", aver);
        }

    }
}

