package Day08;

class A {
    int a;

    void print() {
        System.out.println("a는 " + a + "입니다.");
    }
}


public class ClassTest1 {
    //public이 들어간 class가 하나밖에 안들어가며, 이름 소스명과 같아야한다.
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        a.a = 20;
        a.print(); //20
        b.print(); //0
    }

}
