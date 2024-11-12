package Day16;

import java.util.Random;

//추상화 클래스
abstract class Animal {
    //prtected(상속) 자식만 접근 가능하게
    //Random r = new Random();
    protected Random r = new Random();
    //품종
    //색깔
    private String name;
    private String color;

    Animal() {
        String[] colors = {"갈색", "검은색", "흰색", "노란색", "점박이"};
        color = colors[r.nextInt(colors.length)];
    }

    abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Dog1 extends Animal {
    Dog1() {
        String[] names = {"말티즈", "요크셔테리어", "포메라니안", "시바", "웰시코기"};
        setName(names[r.nextInt(names.length)]);
    }

    void print() {
        System.out.println(getColor() + "의 " + getName() + "는 짖는다.");
    }
}

class Cat1 extends Animal {
    Cat1() {
        String[] names = {"먼치킨", "스핑크스", "뱅갈", "샴", "폴드"};
        setName(names[r.nextInt(names.length)]);
    }

    void print() {
        System.out.println(getColor() + "의 " + getName() + "는 야옹한다.");
    }
}

class Bird1 extends Animal {
    Bird1() {
        String[] names = {"앵무새", "참새", "닭", "까마귀", "비둘기"};
        setName(names[r.nextInt(names.length)]);
    }

    void print() {
        System.out.println(getColor() + "의 " + getName() + "는 날아다닌다.");
    }
}

public class Q2 {
    public static void main(String[] args) {
        //Animal 배열 6크기 객체 생성
        Animal[] woori = new Animal[6];
        //객체 생성
        for (int i = 0; i < woori.length; i++) {
            if (i < 3) {
                woori[i] = new Dog1(); //0,1,2 변수 Animal 실객체 Dog 참조자료형변환 업캐스팅
            } else if (i < 5) {
                woori[i] = new Cat1(); //3,4 변수 Animal 실객체 Cat 참조자료형변환 업캐스팅
            } else {
                woori[i] = new Bird1();//5 변수 Animal 실객체 Bird 참조자료형변환 업캐스팅
            }
        }

        for (Animal a : woori) {
            a.print();//Animal 부모를 이용해서 메소드 오버라이딩을 통해서 자식 실객체 print가 출력
        }
    }
}
