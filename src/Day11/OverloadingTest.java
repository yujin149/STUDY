package Day11;


class A {
    //생성자 오버로딩
    A() {
        System.out.println("매개변수 없음");
    }

    A(int a) {
        System.out.println("매개변수 int");
    }

    A(double a) {
        System.out.println("매개변수 double");
    }

    //메소드 오버로딩
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a) {
        return a + 5;
    }
}

public class OverloadingTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(10));
        System.out.println(a.add(5, 7));
        System.out.println(a.add(1.7, 2.8));

        A a1 = new A(10.7); // A클래스의  생성자 double

        
    }

}
