package Day16;

import java.util.Random;

abstract class Ani {
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String color;


    Ani() {

    }

    abstract void print();
}

class Dog extends Ani {
    Dog() {
        Random r = new Random();
        String[] n = {"말티즈", "요크셔테리어", "포메라니안", "시바", "웰시코기"};
        String[] c = {"갈색", "검은색", "흰색", "노란색", "점박이"};

        setName(n[r.nextInt(n.length)]);
        setColor(c[r.nextInt(c.length)]);
    }

    void print() {
        System.out.println(getColor() + "의 " + getName() + "는 짖는다.");
    }
}

class Cat extends Ani {
    Cat() {
        Random r = new Random();
        String[] n = {"먼치킨", "스핑크스", "뱅갈", "샴", "폴드"};
        String[] c = {"갈색", "검은색", "흰색", "노란색", "점박이"};

        setName(n[r.nextInt(n.length)]);
        setColor(c[r.nextInt(c.length)]);
    }

    void print() {
        System.out.println(getColor() + "의 " + getName() + "는 야옹한다.");
    }
}


class Bird extends Ani {
    Bird() {
        Random r = new Random();
        String[] n = {"앵무새", "참새", "닭", "까마귀", "비둘기"};
        String[] c = {"갈색", "검은색", "흰색", "노란색", "점박이"};

        setName(n[r.nextInt(n.length)]);
        setColor(c[r.nextInt(c.length)]);
    }

    void print() {
        System.out.println(getColor() + "의 " + getName() + "는 날아다닌다.");
    }
}

public class Q2_test {
    public static void main(String[] args) {

        Dog[] dog = new Dog[3];
        for (int i = 0; i < dog.length; i++) {
            dog[i] = new Dog();
            dog[i].print();
        }

        System.out.println("=============================");

        Cat[] cat = new Cat[2];
        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cat();
            cat[i].print();
        }

        System.out.println("=============================");

        Bird bird = new Bird();
        bird.print();

    }
}
