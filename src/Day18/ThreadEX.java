package Day18;

class Buffer {
    private int contents;//결과물
    private boolean available = false; // 반복 제어 변수

    public synchronized void put(int value) {
        while (available == true) {
            try {
                wait(); // Thread wait() 실행 notify 전까지 계속 기다림
            } catch (InterruptedException e) {

            }
        }
        contents = value;
        System.out.println("생산자##### : 생산 " + contents);
        notify(); // Thread가 wait() 하고 있는 경우 깨워주는 기능
        available = true;
    }

    public synchronized int get() {
        while (available == false) {
            try {
                wait(); //Thread wait() 실행 notify 전까지 계속 기다림
            } catch (InterruptedException e) {

            }
        }
        System.out.println("소비자##### : 소비 " + contents);
        notify(); //Thread가 wait() 하고 있는 경우 깨워주는 기능
        available = false;
        return contents;
    }
}

//생산자
class Producer extends Thread {
    private Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            b.put(i);
        }
    }
}

//소비자
class Cousumer extends Thread {
    private Buffer b;

    Cousumer(Buffer b) {
        this.b = b;
    }

    @Override
    public void run() {
        int value = 0;
        for (int i = 1; i <= 10; i++) {
            value = b.get();
        }
    }
}

public class ThreadEX {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Cousumer c = new Cousumer(b);
        p.start();
        c.start();
    }
}
