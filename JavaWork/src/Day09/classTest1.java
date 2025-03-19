package Day09;

class A {
    int a; //멤버변수

    void print(int a /*매개변수 or 인자*/) {
        int b; // 메소드 변수 or 지역변수
    }

    //생성자
    A() {
        a = 10;
    }
    /* 디폴트 생성자가 아님.
       생성자 선언 안했을때 넣어주는게 디폴트

    */
}

public class classTest1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
    }

}
