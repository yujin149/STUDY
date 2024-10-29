package Day10;

class X {
    int a;

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

public class AcessTest {
    public static void main(String[] args) {
        X x = new X();
        x.setA(5);
        System.out.println(x.getA());

    }

}
