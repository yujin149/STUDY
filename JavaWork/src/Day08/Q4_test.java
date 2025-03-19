package Day08;

class Dog1 {
    String color;
    int weight;

    void getDog1() {
        System.out.println("개의 몸무게는 " + weight + "이고 색상은 " + color + "이며 짖는다.");
    }
}

class Cat1 {
    String color;
    int weight;

    void getCat1() {
        System.out.println("고양이의 몸무게는 " + weight + "이고 색상은 " + color + "이며 야옹한다.");
    }
}

class Bird1 {
    String color;
    int weight;

    void getBird1() {
        System.out.println("새의 몸무게는 " + weight + "이고 색상은 " + color + "이며, 날아다닌다.");
    }
}

public class Q4_test {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.weight = 10;
        dog1.color = "갈색";
        dog1.getDog1();

        Dog1 dog2 = new Dog1();
        dog2.weight = 14;
        dog2.color = "하얀색";
        dog2.getDog1();

        Cat1 cat1 = new Cat1();
        cat1.weight = 4;
        cat1.color = "하얀색";
        cat1.getCat1();

        Cat1 cat2 = new Cat1();
        cat2.weight = 5;
        cat2.color = "회색";
        cat2.getCat1();

        Bird1 bird1 = new Bird1();
        bird1.weight = 2;
        bird1.color = "노란색";
        bird1.getBird1();

    }


}
