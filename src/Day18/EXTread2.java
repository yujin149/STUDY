package Day18;

class A {
    synchronized void plus(int i) {//임계 영역 메소드
        for (int j = 0; j < 5; j++) {
            System.out.println(j * i);
            try {
                Thread.sleep(500); //0.5초 실행을 멈춥니다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class B extends Thread {
    A a;
    int i;

    B(A a, int i) {
        this.a = a;
        this.i = i;
    }

    @Override
    public void run() { //종업원 기능
        a.plus(i); // A 객체 plus 메소드 호출 => plus 메소드 synchronized입니다.
        //한번에 한 쓰레드만 접근이 가능해집니다.
    }
}


public class EXTread2 {
    public static void main(String[] args) {
        A a = new A();
        B b1 = new B(a, 3);
        B b2 = new B(a, 7);
        b1.start();
        b2.start();
        // 임계영역으로 순서가 일정하게 나온다.

    }
}
