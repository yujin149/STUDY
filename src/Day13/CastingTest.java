package Day13;

class A {
    int a;
}

class B extends A {
    int b;
}

class C extends A {
    int c;
}

class D extends A {
    int d;
}

public class CastingTest {
    public static void main(String[] args) {
        A a = new B();// 업캐스팅
        //a.b = 20;에러 변수 b 클래스 B에만 있기 때문에
        B b = (B) a;
        b.a = 20;
        b.b = 30;

        B[] listB = new B[10];
        C[] listC = new C[10];
        D[] listD = new D[10];

        A[] listA = new A[10];

        listA[0] = new B();
        listA[1] = new C();
        listA[2] = new D();

        if (listA[1] != null) {
            if (listA[1] instanceof B) {
                System.out.println("객체 B 입니다.");
                B b1 = (B) listA[1];
                b1.b = 30;
            } else if (listA[1] instanceof C) {
                System.out.println("객체 C 입니다.");
                C c1 = (C) listA[1];
                c1.c = 20;
            } else if (listA[1] instanceof D) {
                System.out.println("객체 D 입니다.");
                D d1 = (D) listA[1];
                d1.d = 20;
            } else {
                System.out.println("객체는 A 입니다.");
            }
        }

    }
}
