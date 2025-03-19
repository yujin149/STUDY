package Day18;

class RunableTest implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("재미있는 자바 : " + i);
        }
    }
}

public class EXRunnable1 {
    public static void main(String[] args) {
        RunableTest r = new RunableTest();
        Thread t = new Thread(r);
        t.start();
        //익명 클래스
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello");
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        System.out.println("바이");
    }

}
