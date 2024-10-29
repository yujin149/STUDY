package Day11;

/*
연필, 지우개, 펜
필통
학생
문방구
물물교환 일어나는 클래스
 */

import java.util.Scanner;

class ColorPencil {
    String color;

    ColorPencil(String color) {
        this.color = color;
    }
}

class Eraser {
    String color;

    Eraser(String color) {
        this.color = color;
    }
}

class ColorPen {
    String color;

    ColorPen(String color) {
        this.color = color;
    }
}

class Case {
    ColorPencil cpc1;
    ColorPencil cpc2;
    Eraser e;
    ColorPen cp1;
    ColorPen cp2;
    //나중에 (문방구에서) 객체를 채워넣어야 하기때문에, 변수만 지정

}

class Student {
    String name;
    Case c;

    Student(String name) {
        this.name = name;
        c = new Case();
    }

    Boolean checkPencil() {
        if (c.cpc1 == null || c.cpc2 == null) {
            return true;
            //고른 색연필이 없으면, 반복문 돌려야함.
        }
        return false;
    }

    Boolean checkEraser() {
        if (c.e == null) {
            return true;
        }
        return false;
    }

    Boolean checkPen() {
        if (c.cp1 == null || c.cp2 == null) {
            return true;
        }
        return false;
    }

    String tellObject(String str) { //str은  색연필, 지우개, 색깔펜
        Scanner sc = new Scanner(System.in);
        System.out.println(name + ", " + str + " 색깔을 골라주세요.");
        return sc.next();
    }

    void CasePrint() {
        System.out.println("==============" + this.name + "구매 목록 ==============");
        System.out.println("색연필 1 : " + c.cpc1.color);
        System.out.println("색연필 1 : " + c.cpc2.color);
        System.out.println("지우개 : " + c.e.color);
        System.out.println("칼라펜 1 : " + c.cp1.color);
        System.out.println("칼라펜 2 : " + c.cp2.color);
    }
}

class MunbangGu {
    ColorPencil[] cpc = new ColorPencil[4];
    Eraser[] e = new Eraser[2];
    ColorPen[] cp = new ColorPen[4];

    MunbangGu() {
        String[] color = {"주황색", "초록색", "노란색", "파란색"};
        String[] color2 = {"회색", "빨간색"};

        for (int i = 0; i < color.length; i++) {
            cpc[i] = new ColorPencil(color[i]);
            cp[i] = new ColorPen(color[i]);
            //똑같이 4개의 색깔 동일하기때문에, 같이 써도됨.
        }
        for (int i = 0; i < color2.length; i++) {
            e[i] = new Eraser(color2[i]);
        }
    }
}

class Controller {
    //구조화만들고, 필요할 것 같은 것 넣는 곳.

    void buyPencil(MunbangGu m, Student s, String color) {
        // 반복횟수 => 문방구 연필 배열 길이만큼
        // 배열 안에 객체가 있는지 여부 확인
        // 객체가 있다면 색깔 확인.
        //위에 모든 것이 맞다면 문방구에 있는 연필을 학생에게 준다. => 줄때 비어져 있는 곳에 줘야한다.
        // 그리고 문방구 연필 배열 안에 있는 객체를 null로 바꿔준다.

        int i; //i를 초기화
        for (i = 0; i < m.cpc.length; i++) {
            if (m.cpc[i] != null && m.cpc[i].color.equals(color)) {
                if (s.c.cpc1 == null) {
                    s.c.cpc1 = m.cpc[i];
                } else {
                    s.c.cpc2 = m.cpc[i];
                }
                m.cpc[i] = null;
                System.out.println(s.name + "이 샀습니다.");
            }
        }
        if (i == m.cpc.length) {
            System.out.println("벌써 팔렸습니다.");
        }
    }

    void buyEraser(MunbangGu m, Student s, String color) {
        // 반복횟수 => 문방구 연필 배열 길이만큼
        // 배열 안에 객체가 있는지 여부 확인
        // 객체가 있다면 색깔 확인.
        //위에 모든 것이 맞다면 문방구에 있는 연필을 학생에게 준다. => 줄때 비어져 있는 곳에 줘야한다.
        // 그리고 문방구 연필 배열 안에 있는 객체를 null로 바꿔준다.

        int i; //i를 초기화
        for (i = 0; i < m.e.length; i++) {
            if (m.e[i] != null && m.e[i].color.equals(color)) {
                if (s.c.e == null) {
                    s.c.e = m.e[i];
                }
                m.e[i] = null;
                System.out.println(s.name + "이 샀습니다.");
            }
        }
        if (i == m.e.length) {
            System.out.println("벌써 팔렸습니다.");
        }
    }

    void buyPen(MunbangGu m, Student s, String color) {
        // 반복횟수 => 문방구 연필 배열 길이만큼
        // 배열 안에 객체가 있는지 여부 확인
        // 객체가 있다면 색깔 확인.
        //위에 모든 것이 맞다면 문방구에 있는 연필을 학생에게 준다. => 줄때 비어져 있는 곳에 줘야한다.
        // 그리고 문방구 연필 배열 안에 있는 객체를 null로 바꿔준다.

        int i; //i를 초기화
        for (i = 0; i < m.cp.length; i++) {
            if (m.cp[i] != null && m.cp[i].color.equals(color)) {
                if (s.c.cp1 == null) {
                    s.c.cp1 = m.cp[i];
                } else {
                    s.c.cp2 = m.cp[i];
                }
                m.cp[i] = null;
                System.out.println(s.name + "이 샀습니다.");
            }
        }
        if (i == m.cp.length) {
            System.out.println("벌써 팔렸습니다.");
        }
    }
}


public class MunbangGuTest {
    public static void main(String[] args) {
        //필요 객체를 생성
        MunbangGu m = new MunbangGu(); //펜 , 지우개, 연필 객체가 만들어집니다.
        Student a = new Student("A 학생");
        Student b = new Student("B 학생");
        Controller c = new Controller(); //이후에 컨트롤러 진행하기 위해 넣어줌

        //아래 반복을 언제까지? => 학생 색연필이 꽉 찼을 때, => 학생
        //1. A 학생이 색연필을 골라야 해서 색깔 요청 // Student => tellObject
        //check 색깔 범위에 문자열 입력이 아니면 잘못된 입력처리 후 다시 재입력 받는다. => 분기 해결
        //Controller 에서 해결 => buyPencil
        //2. 문방구에서 색깔펜이 있는지 확인을 해서 A학생에게 전달.
        //3. 전달이 되면 문방구 색깔펜 객체는 null 로 변경.

        while (a.checkPencil()) {
            String color = a.tellObject("색연필");
            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
                c.buyPencil(m, a, color);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        while (b.checkPencil()) {
            String color = b.tellObject("색연필");
            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
                c.buyPencil(m, b, color);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        while (a.checkEraser()) {
            String color = a.tellObject("지우개");
            if (color.equals("회색") || color.equals("빨간색")) {
                c.buyEraser(m, a, color);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        while (b.checkEraser()) {
            String color = b.tellObject("지우개");
            if (color.equals("회색") || color.equals("빨간색")) {
                c.buyEraser(m, b, color);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        while (a.checkPen()) {
            String color = a.tellObject("색깔펜");
            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
                c.buyPen(m, a, color);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        while (b.checkPen()) {
            String color = b.tellObject("색깔펜");
            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
                c.buyPen(m, b, color);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        a.CasePrint();
        b.CasePrint();

    }
}
