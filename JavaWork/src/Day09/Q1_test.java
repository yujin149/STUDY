package Day09;

class Car1 {
    String color1;
    String made1;
    int speed1;

    void take1() {
        System.out.println(made1 + "의 " + color1 + "자동차를 " + speed1 + "로 운전합니다.");
    }
}

class Bicycle1 {
    String made1;
    String fc1;

    void take1() {
        System.out.println(made1 + "인 자전거의 기능인 " + fc1 + "을 사용해서 자전거를 탑니다.");
    }
}

class Bike1 {
    String made1;
    String color1;
    int speed1;

    void take1() {
        System.out.println(made1 + "의 " + color1 + "오토바이를 " + speed1 + "로 운전합니다.");
    }
}

class Person1_1 {

    //String name1;
    //Car1 hasCar1_1 = new Car1();
    //Car1 hasCar1_2 = new Car1();
    Car1 hasCar1_1;
    Car1 hasCar1_2;

}

class Person1_2 {
    //String name1;
    //Bicycle1 hasBy1_1 = new Bicycle1();
    //Bike1 hasB1_1 = new Bike1();
    Bicycle1 hasBy1_1;
    Bike1 hasB1_1;
}

public class Q1_test {
    public static void main(String[] args) {
        Car1 cQ1_1 = new Car1();
        Car1 cQ1_2 = new Car1();
        Car1 cQ1_3 = new Car1();
        Car1 cQ1_4 = new Car1();
        cQ1_1.color1 = "은색";
        cQ1_2.color1 = "검정색";
        cQ1_3.color1 = "하얀색";
        cQ1_4.color1 = "형광색";

        cQ1_1.made1 = "Ford";
        cQ1_2.made1 = "BMW";
        cQ1_3.made1 = "삼성";
        cQ1_4.made1 = "현대";

        cQ1_1.speed1 = 220;
        cQ1_2.speed1 = 240;
        cQ1_3.speed1 = 200;
        cQ1_4.speed1 = 180;

        Bicycle1 byQ1_1 = new Bicycle1();
        Bicycle1 byQ1_2 = new Bicycle1();

        byQ1_1.made1 = "삼천리";
        byQ1_2.made1 = "자이언트";

        byQ1_1.fc1 = "산악용";
        byQ1_2.fc1 = "접이식용";

        Bike1 bQ1_1 = new Bike1();

        bQ1_1.made1 = "대림";
        bQ1_1.color1 = "빨간색";
        bQ1_1.speed1 = 180;

        cQ1_1.take1();
        cQ1_2.take1();
        cQ1_3.take1();
        cQ1_4.take1();

        byQ1_1.take1();
        byQ1_2.take1();

        bQ1_1.take1();


        //첫번째 사람
        Person1_1 hasTake1_1 = new Person1_1();
        //hasTake1_1.name1 = "첫번째 사람";
        hasTake1_1.hasCar1_1.color1 = "검정색";
        hasTake1_1.hasCar1_1.made1 = "BMW";
        hasTake1_1.hasCar1_1.speed1 = 240;

        hasTake1_1.hasCar1_2.color1 = "형광색";
        hasTake1_1.hasCar1_2.made1 = "현대";
        hasTake1_1.hasCar1_2.speed1 = 180;


        //두번째 사람
        Person1_2 hasTake1_2 = new Person1_2();
        //hasTake1_2.name1 = "두번째 사람";

        hasTake1_2.hasBy1_1.made1 = "삼천리";
        hasTake1_2.hasBy1_1.fc1 = "산악용";

        hasTake1_2.hasB1_1.made1 = "대림";
        hasTake1_2.hasB1_1.color1 = "빨간색";
        hasTake1_2.hasB1_1.speed1 = 180;


        System.out.println("첫번째 사람");
        hasTake1_1.hasCar1_1.take1();
        hasTake1_1.hasCar1_2.take1();
        System.out.println("두번째 사람");
        hasTake1_2.hasBy1_1.take1();
        hasTake1_2.hasB1_1.take1();
    }
}
