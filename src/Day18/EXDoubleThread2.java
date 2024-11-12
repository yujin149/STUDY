package Day18;

public class EXDoubleThread2 {
    public static void main(String[] args) throws InterruptedException { //쓰레드는 예외처리가 많기 때문에 이걸 써줘야함.
        ThreadTest1 t1 = new ThreadTest1("배우기 쉬운 자바");
        ThreadTest1 t2 = new ThreadTest1("배우기 어려운 자바");
        System.out.println("******************** 쓰레드 시작 전 ********************");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("******************** 쓰레드 시작 후 ********************"); //join을 쓰게 되면 마지막으로 고정이 된다.
    }
}
