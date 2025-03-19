package Day10_test;

import java.util.Scanner;

// 문방구에서 학생들이 학용품을 구매하는 프로그램

/*
 * 문방구 - 주황색 연필, 초록색 연필, 노란색 연필, 파란색 연필 / 회색 지우개, 빨간 지우개
 *         주황 펜, 초록 펜, 노란 펜, 파란 펜
 *
 * A 학생 - 필통 - 색연필 2, 지우개 1, 펜 2
 * B 학생 - 필통 - 색연필 2, 지우개 1, 펜 2
 *
 * 원하는 물건이 없으면 다시 고르게 한다.
 * 색이 없는 것을 말하면 다시 고르게 한다.
 */
class ColorPencil {
    String color; // 색연필의 색

    ColorPencil(String color) {
        this.color = color; // 색연필 생성자
    }
}

class Eraser {
    String color; // 지우개의 색

    Eraser(String color) {
        this.color = color; // 지우개 생성자
    }
}

class ColorPen {
    String color; // 칼라펜의 색

    ColorPen(String color) {
        this.color = color; // 칼라펜 생성자
    }
}

class Philtong {
    ColorPencil cpc1; // 첫 번째 색연필
    ColorPencil cpc2; // 두 번째 색연필
    Eraser e; // 지우개
    ColorPen cp1; // 첫 번째 칼라펜
    ColorPen cp2; // 두 번째 칼라펜
}

class Student {
    String name; // 학생 이름
    Philtong p; // 학생의 필통

    Student(String name) {
        this.name = name; // 학생 이름 설정
        p = new Philtong(); // 새 필통 생성
    }

    // 색연필이 모두 선택되었는지 확인
    boolean checkPencil() {
        return p.cpc1 == null || p.cpc2 == null; // null이 있으면 false
    }

    // 지우개가 선택되었는지 확인
    boolean checkEraser() {
        return p.e == null; // null이면 false
    }

    // 칼라펜이 모두 선택되었는지 확인
    boolean checkPen() {
        return p.cp1 == null || p.cp2 == null; // null이 있으면 false
    }

    // 학생의 구매 목록 출력
    void philtongPrint() {
        System.out.println("====== " + this.name + " 구매 목록 ======");
        System.out.println("색연필 1 : " + p.cpc1.color);
        System.out.println("색연필 2 : " + p.cpc2.color);
        System.out.println("지우개 : " + p.e.color);
        System.out.println("칼라펜 1 : " + p.cp1.color);
        System.out.println("칼라펜 2 : " + p.cp2.color);
    }
}

class MunbangGu {
    ColorPencil[] cpc = new ColorPencil[4]; // 색연필 배열
    Eraser[] e = new Eraser[2]; // 지우개 배열
    ColorPen[] cp = new ColorPen[4]; // 칼라펜 배열

    MunbangGu() {
        String[] color = {"주황색", "초록색", "노란색", "파란색"}; // 색연필 색깔 배열
        String[] color1 = {"회색", "빨간색"}; // 지우개 색깔 배열

        // 색연필과 칼라펜 초기화
        for (int i = 0; i < cpc.length; i++) { // 4개
            cpc[i] = new ColorPencil(color[i]); // 색연필 객체 생성
            cp[i] = new ColorPen(color[i]); // 칼라펜 객체 생성
        }
        // 지우개 초기화
        for (int i = 0; i < e.length; i++) {
            e[i] = new Eraser(color1[i]); // 지우개 객체 생성
        }
    }
}

class Controller {
    // 연필, 지우개, 펜을 구매하는 기능을 구현

    void buyPencil(MunbangGu m, Student s, String color) {
        int i;
        // 색연필을 찾아서 구매 처리
        for (i = 0; i < m.cpc.length; i++) {
            if (m.cpc[i] != null) {
                if (m.cpc[i].color.equals(color)) {
                    // 필통에 색연필 추가
                    if (s.p.cpc1 == null) {
                        s.p.cpc1 = m.cpc[i];
                    } else {
                        s.p.cpc2 = m.cpc[i];
                    }
                    m.cpc[i] = null; // 문방구에서 색연필 제거
                    System.out.println(s.name + " 학생이 샀습니다.");
                    break;
                }
            }
        }
        // 색연필이 없을 경우 메시지 출력
        if (i == m.cpc.length) {
            System.out.println("벌써 팔렸습니다.");
        }
    }

    void buyEraser(MunbangGu m, Student s, String color) {
        int i;
        // 지우개를 찾아서 구매 처리
        for (i = 0; i < m.e.length; i++) {
            if (m.e[i] != null) {
                if (m.e[i].color.equals(color)) {
                    s.p.e = m.e[i]; // 필통에 지우개 추가
                    m.e[i] = null; // 문방구에서 지우개 제거
                    System.out.println(s.name + " 학생이 샀습니다.");
                    break;
                }
            }
        }
        // 지우개가 없을 경우 메시지 출력
        if (i == m.e.length) {
            System.out.println("벌써 팔렸습니다.");
        }
    }

    void buyPen(MunbangGu m, Student s, String color) {
        int i;
        // 칼라펜을 찾아서 구매 처리
        for (i = 0; i < m.cp.length; i++) {
            if (m.cp[i] != null) {
                if (m.cp[i].color.equals(color)) {
                    // 필통에 칼라펜 추가
                    if (s.p.cp1 == null) {
                        s.p.cp1 = m.cp[i];
                    } else {
                        s.p.cp2 = m.cp[i];
                    }
                    m.cp[i] = null; // 문방구에서 칼라펜 제거
                    System.out.println(s.name + " 학생이 샀습니다.");
                    break;
                }
            }
        }
        // 칼라펜이 없을 경우 메시지 출력
        if (i == m.cp.length) {
            System.out.println("벌써 팔렸습니다.");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        // 입력 객체, 문방구, 학생 2명, Controller 생성
        Scanner sc = new Scanner(System.in);
        MunbangGu m = new MunbangGu(); // 문방구 객체 생성
        Student a = new Student("A학생"); // A학생 객체 생성
        Student b = new Student("B학생"); // B학생 객체 생성
        Controller c = new Controller(); // Controller 객체 생성

        // A학생 색연필 모두 고를 때까지 반복
        while (a.checkPencil()) {
            System.out.print(a.name + " 색연필 색깔을 골라주세요 : ");
            String color = sc.next();
            // 색연필 색상 확인 후 구매
            if (color.equals("주황색") || color.equals("초록색") ||
                    color.equals("노란색") || color.equals("파란색")) {
                c.buyPencil(m, a, color); // 색연필 구매
            } else {
                System.out.println("잘못된 입력입니다."); // 잘못된 입력 처리
            }
        }

        // B학생 색연필 모두 고를 때까지 반복
        while (b.checkPencil()) {
            System.out.print(b.name + " 색연필 색깔을 골라주세요 : ");
            String color = sc.next();
            if (color.equals("주황색") || color.equals("초록색") ||
                    color.equals("노란색") || color.equals("파란색")) {
                c.buyPencil(m, b, color); // 색연필 구매
            } else {
                System.out.println("잘못된 입력입니다."); // 잘못된 입력 처리
            }
        }

        // A학생 지우개 모두 고를 때까지 반복
        while (a.checkEraser()) {
            System.out.print(a.name + " 지우개 색깔을 골라주세요 : ");
            String color = sc.next();
            if (color.equals("빨간색") || color.equals("회색")) {
                c.buyEraser(m, a, color); // 지우개 구매
            } else {
                System.out.println("잘못된 입력입니다."); // 잘못된 입력 처리
            }
        }

        // B학생 지우개 모두 고를 때까지 반복
        while (b.checkEraser()) {
            System.out.print(b.name + " 지우개 색깔을 골라주세요 : ");
            String color = sc.next();
            if (color.equals("빨간색") || color.equals("회색")) {
                c.buyEraser(m, b, color); // 지우개 구매
            } else {
                System.out.println("잘못된 입력입니다."); // 잘못된 입력 처리
            }
        }

        // A학생 칼라펜 모두 고를 때까지 반복
        while (a.checkPen()) {
            System.out.print(a.name + " 칼라펜 색깔을 골라주세요 : ");
            String color = sc.next();
            if (color.equals("주황색") || color.equals("초록색") ||
                    color.equals("노란색") || color.equals("파란색")) {
                c.buyPen(m, a, color); // 칼라펜 구매
            } else {
                System.out.println("잘못된 입력입니다."); // 잘못된 입력 처리
            }
        }

        // B학생 칼라펜 모두 고를 때까지 반복
        while (b.checkPen()) {
            System.out.print(b.name + " 칼라펜 색깔을 골라주세요 : ");
            String color = sc.next();
            if (color.equals("주황색") || color.equals("초록색") ||
                    color.equals("노란색") || color.equals("파란색")) {
                c.buyPen(m, b, color); // 칼라펜 구매
            } else {
                System.out.println("잘못된 입력입니다."); // 잘못된 입력 처리
            }
        }

        // 학생마다 구매한 학용품 출력
        a.philtongPrint(); // A학생 구매 목록 출력
        b.philtongPrint(); // B학생 구매 목록 출력
    }
}
