package Practice_241025;

import java.util.Scanner;

/*
세 과목(국어, 영어, 수학)의 점수를 입력 받습니다.
평균을 소숫점 첫째 자리까지 계산을 합니다.
그 이후에 평균의 학점을 출력해주세요.

A+ 95점 이상 / A 90점 이상 / B+ 85점 이상 / B 80점 이상
C+ 75점 이상 / C 70점 이상 / D 60점 이상 /F 60점 미만

단, 각 점수마다 100점을 초과하는 점수를 입력하면 평균을 계산하지 않고
입력된 과목과 함께 잘못 입력했습니다. 출력 후 프로그램 종료.

**출력 결과 예시)**
국어 : 120
영어 : 80
수학 : 70

국어 점수가 잘 못 입력됐습니다.
 */
public class Q6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("국어 점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어 점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학 점수 : ");
            int math = sc.nextInt();

            double avg = (kor + eng + math) / 3.0;

            if (kor <= 100 && kor >= 0 && eng <= 100 && eng >= 0 && math <= 100 && math >= 0) {
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
                break;
            } else {
                if (kor < 0 || kor > 100) {
                    System.out.print("국어 ");
                }
                if (eng < 0 || eng > 100) {
                    System.out.print("영어 ");
                }
                if (math < 0 || math > 100) {
                    System.out.print("수학 ");
                }
                System.out.println("점수가 잘 못 입력 됐습니다.");
            }
        }


    }
}
