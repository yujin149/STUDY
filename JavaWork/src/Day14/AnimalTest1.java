package Day14;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void thinking() {
        System.out.println("사람은 생각합니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class AnimalTest1 {
    public static void main(String[] args) {
        AnimalTest1 aTest = new AnimalTest1();
        aTest.moveAnimal(new Human());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());

        aTest.thinkingAnimal(new Tiger());
        aTest.thinkingAnimal(new Human());

    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }

    public void thinkingAnimal(Animal animal) {
        if (animal instanceof Human) {
            Human h = (Human) animal;
            h.thinking();

        } else {
            System.out.println("현재 동물은 생각을 하지 못합니다.");
        }
    }
}
