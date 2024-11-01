package Day12;

class C {
    C() {
        System.out.println("C 생성");
    }
}

class D extends C {
    D() {
        System.out.println("D 생성");
    }
}

public class TestInheriatance {
    public static void main(String[] args) {
        D d = new D();
        
    }
}
