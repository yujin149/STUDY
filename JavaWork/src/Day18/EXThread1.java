package Day18;

class ThreadTest extends Thread {
    //쓰레드는 거의 상속을 받는다.


    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("재미없는 자바 : " + i);
        }
    }
}

public class EXThread1 {
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Main 쓰레드 : " + i);

        }
    }
}
