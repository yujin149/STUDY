package Day11;

class D {
}

public class ObjectArrayMethodTest {
    static D[] sendD(D[][] d, int i, int j) {
        d[i][j] = new D();
        return d[i];
    }

    public static void main(String[] ars) {
        D[][] d1 = new D[3][3];
        D[] d2 = sendD(d1, 0, 2);
        for (int i = 0; i < d2.length; i++) {
            if (d2[i] == null) {
                System.out.println("index : " + i + "null 입니다.");
            } else {
                System.out.println("index : " + i + "객체가 있습니다.");
            }
        }
    }
}
