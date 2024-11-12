package Day18;

class ThreadTest1 extends Thread {
    public ThreadTest1(String str) {
        setName(str); //Thread에 setName => 쓰레드 이름을 저장
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + getName()); //저장했던 쓰레드 이름 얻어온다.
        }
        System.out.println("끝" + getName());
    }
}

public class EXDoubleThread1 {
    public static void main(String[] args) {
        ThreadTest1 t1 = new ThreadTest1("권윤경");
        ThreadTest1 t2 = new ThreadTest1("송유진");
        t1.start();
        t2.start();
        System.out.println("바이~");
    }


}
