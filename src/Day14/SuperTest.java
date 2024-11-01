package Day14;

class A {
    int a;

    A(int a) {
        this.a = a;
    }

    A(String str) {

    }
}

class B extends A {
    B() {
        super(5);
    }

    B(String str) {
        super(6);
    }

    void abc() {
        this.a = 20;
        super.a = 30;
    }
}

public class SuperTest {
    public static void main(String[] args) {
        B b = new B("하이"); //b
        B b1 = new B(); //b1

        b1.abc();
        System.out.println(b.a);
        System.out.println(b1.a);
    }
}
