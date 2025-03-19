package Day15;

import java.util.Random;
import java.util.Scanner;

abstract class Mart {
    String name;
    String madeList;

    Mart(String name, String[] made) {
        this.name = name;
        Random r = new Random();
        this.madeList = made[r.nextInt(made.length)];
    }

    abstract void print();
}

class Com extends Mart {


    Com() {
        super("컴퓨터", new String[]{"삼성", "LG"});
    }

    void print() {
        System.out.println("제품 입력 : " + name);
        System.out.println("제조사 : " + madeList);
    }
}

class Aircon extends Mart {

    Aircon() {
        super("에어컨", new String[]{"삼성", "LG"});
    }

    void print() {
        System.out.println("제품 입력 : " + name);
        System.out.println("제조사 : " + madeList);
    }
}

class Ref extends Mart {

    Ref() {
        super("냉장고", new String[]{"삼성", "LG"});
    }

    void print() {
        System.out.println("제품 입력 : " + name);
        System.out.println("제조사 : " + madeList);
    }
}

class AirPuri extends Mart {

    AirPuri() {
        super("공기청정기", new String[]{"LG", "다이슨"});
    }

    void print() {
        System.out.println("제품 입력 : " + name);
        System.out.println("제조사 : " + madeList);
    }
}

public class Q2_test {
    public static void main(String[] args) {
        Random r = new Random();
        Mart[] product = new Mart[40];
        for (int i = 0; i < product.length; i++) {
            int num = r.nextInt(4);
            if (num == 0) {
                product[i] = new Com();
            } else if (num == 1) {
                product[i] = new Aircon();
            } else if (num == 2) {
                product[i] = new Ref();
            } else {
                product[i] = new AirPuri();
            }
        }

        for (int i = 0; i < product.length; i++) {
            System.out.print((i + 1) + ". ");
            product[i].print();
        }


        System.out.println("==================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 입력 : ");
        String productName = sc.next();
        System.out.print("제조사 : ");
        String productMade = sc.next();


        for (int i = 0; i < product.length; i++) {
            if (product[i].name.equals(productName)) {
                if (product[i].madeList.equals(productMade)) {
                    System.out.println("제품 위치는 " + (i + 1) + "번째에 있습니다. 제품명 : " + product[i].name + ", 제조사 : " + product[i].madeList);
                    product[i] = null;
                    break;
                }
            }
        }
    }
}
