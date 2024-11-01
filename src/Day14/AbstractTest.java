package Day14;

abstract class Z {
    int a;

    void abc() {
        System.out.println("abc");
    }

    Z(int a, int b) {

    }

    abstract void def(); //추상화 메소드

    abstract void kor(); //추상화 메소드
}

class X extends Z {
    X() {
        super(5, 6);
    }

    @Override
    void def() {
        System.out.println("def");
    }

    @Override
    void kor() {
        System.out.println("kor");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        X x = new X();
        x.abc(); //부모의 일반 메소드 사용이 가능 합니다
        // Z z = new Z(); Z는 추상화 클래스이기 때문에 객체 생성 x
        Z z = new X(); //참조 자료형변환해서 사용은 가능합니다.
    }
}