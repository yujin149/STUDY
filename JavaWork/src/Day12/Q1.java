package Day12;

import java.util.Scanner;

class Computer {
    String made;
    String cpu;
    int price;

    Computer(String made, String cpu, int price) {
        this.made = made;
        this.cpu = cpu;
        this.price = price;
    }

    void use() {
        System.out.println("제조사가 " + made + "인 " + cpu + " 컴퓨터를 사용한다.");
    }
}

class Aircon {
    String made;
    String type;
    int price;

    Aircon(String made, String type, int price) {
        this.made = made;
        this.type = type;
        this.price = price;
    }

    void use() {
        System.out.println("제조사가 " + made + "인 " + type + " 에어컨을 사용한다.");
    }
}

class Refri {
    String made;
    String type;
    int size;
    int price;

    Refri(String made, String type, int size, int price) {
        this.made = made;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    void use() {
        System.out.println("제조사가 " + made + "인 " + type + "형 " + size + "L 냉장고가 식품을 관리한다.");
    }
}

class AirPurifier {
    String made;
    int price;

    AirPurifier(String made, int price) {
        this.made = made;
        this.price = price;
    }

    void use() {
        System.out.println("제조사가 " + made + "인 공기청정기가 공기를 깨끗하게 한다.");
    }
}


class Mart {
    Computer[] com1 = new Computer[5];
    Computer[] com2 = new Computer[5];
    Aircon[] aircon1 = new Aircon[5];
    Aircon[] aircon2 = new Aircon[5];
    Refri[] refri1 = new Refri[5];
    Refri[] refri2 = new Refri[5];
    AirPurifier[] airPu1 = new AirPurifier[5];
    AirPurifier[] airPu2 = new AirPurifier[5];

    Mart() {
        for (int i = 0; i < com1.length; i++) {
            com1[i] = new Computer("삼성", "i7", 200);
            com2[i] = new Computer("LG", "i5", 150);
            aircon1[i] = new Aircon("삼성", "벽걸이", 100);
            aircon2[i] = new Aircon("LG", "스탠드", 250);
            refri1[i] = new Refri("삼성", "양문", 600, 250);
            refri2[i] = new Refri("LG", "4도어", 800, 350);
            airPu1[i] = new AirPurifier("LG", 80);
            airPu2[i] = new AirPurifier("다이슨", 60);
        }
    }
}

class Cart {

}

class Person1 {
    String name;

    // cart 나중에 산 물건들 표시해야할 게 필요해..
    Cart cart; //구매한 물건

    int inputMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 가지고 있는 돈 : ");
        return sc.nextInt();
    }

    int select1() {
        Scanner sc = new Scanner(System.in);
        System.out.println(name + "님 상품을 선택해주세요.");
        System.out.println("1.컴퓨터  2.에어컨  3.냉장고  4.공기청정기");
        return sc.nextInt();
    }

    int select2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("제조사 및 사양을 선택해주세요.");
        while (true) {
            int select1 = select1();
            if (select1 > 4 || select1 < 1) {
                System.out.println("잘못된 입력입니다.");
            } else if (select1 == 1) {
                System.out.println("1.삼성(i7)  2.LG(i5)");
                return sc.nextInt();
            } else if (select1 == 2) {
                System.out.println("1.삼성(벽걸이)  2.LG(스탠드)");
                return sc.nextInt();
            } else if (select1 == 3) {
                System.out.println("1.삼성(양문형, 600L)  2.LG(4도어, 800L)");
                return sc.nextInt();
            } else {
                System.out.println("1.LG  2.다이슨");
                return sc.nextInt();
            }
        }
    }

    void buy(int select1, int select2) {
        int haveMoney = inputMoney();
        while (haveMoney > 60) {
            if (select1 == 1 && select2 == 1) {
                System.out.println(name + "님 " + "삼성(i7) 컴퓨터를 구매하셨습니다.");
                haveMoney -= 200;
            } else if (select1 == 1 && select2 == 2) {
                System.out.println(name + "님 " + "LG(i5) 컴퓨터를 구매하셨습니다.");
                haveMoney -= 150;
            } else if (select1 == 2 && select2 == 1) {
                System.out.println(name + "님 " + "삼성(벽걸이) 에어컨을 구매하셨습니다.");
                haveMoney -= 200;
            } else if (select1 == 2 && select2 == 2) {
                System.out.println(name + "님 " + "LG(스탠드) 에어컨을 구매하셨습니다.");
                haveMoney -= 250;
            } else if (select1 == 3 && select2 == 1) {
                System.out.println(name + "님 " + "삼성(양문형, 600L) 냉장고를 구매하셨습니다.");
                haveMoney -= 200;
            } else if (select1 == 3 && select2 == 2) {
                System.out.println(name + "님 " + "LG(4도어, 800L) 냉장고를 구매하셨습니다.");
                haveMoney -= 350;
            } else if (select1 == 4 && select2 == 1) {
                System.out.println(name + "님 " + "LG 공기청정기를 구매하셨습니다.");
                haveMoney -= 80;
            } else if (select1 == 4 && select2 == 2) {
                System.out.println(name + "님 " + "다이슨 공기청정기를 구매하셨습니다.");
                haveMoney -= 60;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}


public class Q1 {
    public static void main(String[] args) {

    }
}
