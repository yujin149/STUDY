package Day14;

class C {
}

public class EqualsTest {
    public static void main(String[] args) {
        C c = new C();
        C c1 = new C();

        System.out.println(c == c1);
        System.out.println(c.equals(c1));

        C c2 = new C();
        C c3 = c2;
        System.out.println(c2 == c3);
        System.out.println(c2.equals(c3));

    }
}
