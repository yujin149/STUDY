package Day08;

class Pencil01 {
    String[] color;

    public Pencil01(String[] color) {
    }


    void colorName() {
        for (int i = 0; i < color.length; i++) {
            System.out.println("쓰는 기능은 " + color[i] + " 연필로 적습니다.");
        }

    }

}

class Eraser01 {
    String made;

    String made() {
        return made;
    }
}

class Pen01 {
    String color;
    String made;

    String color() {
        return color;
    }

    String made() {
        return made;
    }
}

public class Q3_test {
    public static void main(String[] args) {
        String[] color = {"빨강색", "파란색", "주황색", "노란색"};
        //Pencil pencil = new Pencil(color);
        //pencil.colorName();

    }

}
