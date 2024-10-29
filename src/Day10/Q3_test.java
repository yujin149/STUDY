package Day10;

import java.util.Scanner;

class Store {
    String colorPencil;
    String eraser;
    String pen;
}


class PencilCase {
    String colorPencil;
    String eraser;
    String pen;
    Store hasThing;
}

class Student1 {
    String name;
    PencilCase pencilCase;


    Student1(String name) {
        name = name;
    }

    String choose() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    void buy(String thing) {
        while (true) {
            if (thing.equals(pencilCase.colorPencil) || thing.equals(pencilCase.eraser) || thing.equals(pencilCase.pen)) {
                if (thing != null) {
                    System.out.println(thing + "을 구매하였습니다.");
                    thing = null;
                    break;
                } else {
                    System.out.println("팔렸습니다.");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

}

class Student2 {
    String name;
    PencilCase pencilCase;

    Student2(String name) {
        name = name;
    }

    void name() {
        System.out.print(name + " ");
    }

    String choose() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    void buy(String thing) {
        while (true) {
            if (thing.equals(pencilCase.colorPencil) || thing.equals(pencilCase.eraser) || thing.equals(pencilCase.pen)) {
                if (thing != null) {
                    System.out.println(thing + "을 구매하였습니다.");
                    thing = null;
                    break;
                } else {
                    System.out.println("팔렸습니다.");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}

public class Q3_test {
    public static void main(String[] args) {
        Store[] colorPencil = new Store[4];
        for (int i = 0; i < colorPencil.length; i++) {
            colorPencil[i] = new Store();
        }
        colorPencil[0].colorPencil = "주황색";
        colorPencil[1].colorPencil = "연두색";
        colorPencil[2].colorPencil = "노란색";
        colorPencil[3].colorPencil = "파란색";

        Store[] eraser = new Store[2];
        for (int i = 0; i < eraser.length; i++) {
            eraser[i] = new Store();
        }
        eraser[0].eraser = "회색";
        eraser[1].eraser = "빨간색";

        Store[] pen = new Store[4];
        for (int i = 0; i < pen.length; i++) {
            pen[i] = new Store();
        }
        pen[0].pen = "주황색";
        pen[1].pen = "연두색";
        pen[2].pen = "노란색";
        pen[3].pen = "파란색";

        Student1 student1 = new Student1("A 학생");
        Student2 student2 = new Student2("B 학생");


        PencilCase[] selectColorPencil = new PencilCase[2];
        for (int i = 0; i < selectColorPencil.length; i++) {
            System.out.print(student1 + " 색연필 색상을 골라주세요.");
            selectColorPencil[i] = new PencilCase();
            String thing1 = student1.choose();
            student1.buy(thing1);
        }
        for (int i = 0; i < selectColorPencil.length; i++) {
            System.out.print(student2 + " 색연필 색상을 골라주세요.");
            selectColorPencil[i] = new PencilCase();
            String thing2 = student2.choose();
            student2.buy(thing2);
        }

        PencilCase[] selectEraser = new PencilCase[1];
        for (int i = 0; i < selectEraser.length; i++) {
            System.out.print(student1 + " 지우개 색상을 골라주세요.");
            selectEraser[i] = new PencilCase();
            String thing1 = student1.choose();
            student1.buy(thing1);
        }
        for (int i = 0; i < selectEraser.length; i++) {
            System.out.print(student2 + " 지우개 색상을 골라주세요.");
            selectEraser[i] = new PencilCase();
            String thing2 = student2.choose();
            student2.buy(thing2);
        }
        PencilCase[] selectPen = new PencilCase[2];
        for (int i = 0; i < selectPen.length; i++) {
            System.out.print(student1 + " 펜 색상을 골라주세요.");
            selectPen[i] = new PencilCase();
            String thing1 = student1.choose();
            student1.buy(thing1);
        }
        for (int i = 0; i < selectPen.length; i++) {
            System.out.print(student2 + " 펜 색상을 골라주세요.");
            selectPen[i] = new PencilCase();
            String thing2 = student2.choose();
            student2.buy(thing2);
        }
    }
}
