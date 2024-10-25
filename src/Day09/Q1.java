package Day09;

class Car {
    String color;
    String menu;
    int maxSpeed;

    Car(String c, String m, int max) {
        color = c;
        menu = m;
        maxSpeed = max;
    }

    void take1() {
        System.out.println(menu + "의 " + color + "자동차를 " + maxSpeed + "로 운전합니다.");
    }
}

class Bike {
    String menu;
    String function;

    Bike(String m, String f) {
        menu = m;
        function = f;
    }

    void take1() {
        System.out.println(menu + "인 자전거의 기능인 " + function + "을 사용해서 자전거를 탑니다.");
    }
}

class Moto {
    String color;
    String menu;
    int maxSpeed;

    Moto(String c, String m, int max) {
        color = c;
        menu = m;
        maxSpeed = max;
    }

    void take1() {
        System.out.println(menu + "의 " + color + "오토바이를 " + maxSpeed + "로 운전합니다.");
    }
}

class Human1 {

    String name;
    Car c1;
    Car c2;

    Human1(String n, Car car1, Car car2) {
        name = n;
        c1 = car1;
        c2 = car2;
    }

    void driveC1() {
        System.out.print(name + "는 ");
        c1.take1();
    }

    void driveC2() {
        System.out.print(name + "는 ");
        c2.take1();
    }
}

class Human2 {
    String name;
    Bike b;
    Moto m;

    Human2(String n, Bike bike, Moto moto) {
        //n = name;
        name = n;
        b = bike;
        m = moto;
    }

    void driveB() {
        System.out.print(name + "는 ");
        b.take1();
    }

    void driveM() {
        System.out.print(name + "는 ");
        m.take1();
    }

}

public class Q1 {
    public static void main(String[] args) {
        Car c1 = new Car("은색", "Ford", 220);
        Car c2 = new Car("검정색", "BMW", 240);
        Car c3 = new Car("하얀색", "삼성", 200);
        Car c4 = new Car("형광색", "현대", 180);

        Bike b1 = new Bike("삼천리", "산악용");
        Bike b2 = new Bike("자이언트", "접이식용");

        Moto m1 = new Moto("대림", "빨간색", 180);
        c1.take1();
        c2.take1();
        c3.take1();
        c4.take1();

        b1.take1();
        b2.take1();

        m1.take1();


        Human1 human1 = new Human1("철수", c2, c4);
        c2 = null;
        c4 = null;
        Human2 human2 = new Human2("영희", b1, m1);


        //System.out.print("첫번째 사람은 ");
        //human1.c1.take1();
        //human1.c2.take1();
        human1.driveC1();
        human1.driveC2();

        //System.out.print("두번째 사람은 ");
        //human2.b.take1();
        //human2.m.take1();
        human2.driveB();
        human2.driveM();
    }
}
