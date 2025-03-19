package Day09;

class X {
    int a;
    String str;
    B b; //Has 관계 (X가 B를 가지고 있다)

    /*
    X() {
        b = new B();
    }
    */
}

class B {
    int k;

}

class D {
    B b = new B();  //Has 관계
}


public class HasTest1 {
    public static void main(String[] args) {
        X x = new X();
        //x.b.k = 30; run 에러
        x.b = new B();
        x.b.k = 30;
        System.out.println(x.b.k); //30

        D d = new D();
        d.b.k = 20;
        System.out.println(d.b.k); //20
        d.b = new B();
        System.out.println(d.b.k); //0
    }
}
