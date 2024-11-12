package Day15;

import java.util.Random;
import java.util.Scanner;

//부모 클래스 제품 : 브랜드, 제품명, 출력하는(추상화 메소드)
abstract class Product {
    Random r = new Random();

    String type; //제품명
    String br; //브랜드

    abstract void print();
}

class Computer extends Product {
    Computer() {
        type = "컴퓨터";
        String[] brands = {"삼성", "LG"};
        br = brands[r.nextInt(brands.length)];
    }

    void print() {
        System.out.println(type + ", " + br);
    }
}

class Aircon1 extends Product {
    Aircon1() {
        type = "에어컨";
        String[] brands = {"삼성", "LG"};
        br = brands[r.nextInt(brands.length)];
    }

    void print() {
        System.out.println(type + ", " + br);
    }
}


class Ref1 extends Product {
    Ref1() {
        type = "냉장고";
        String[] brands = {"삼성", "LG"};
        br = brands[r.nextInt(brands.length)];
    }

    void print() {
        System.out.println(type + ", " + br);
    }
}

class AirCleaner extends Product {
    AirCleaner() {
        type = "공기청정기";
        String[] brands = {"LG", "다이슨"};
        br = brands[r.nextInt(brands.length)];
    }

    void print() {
        System.out.println(type + ", " + br);
    }
}


public class Q2 {
    public static void main(String[] args) {
        //1. 입력 객체, 랜덤 객체
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        //2. 제품 40개 배열 객체 생성
        Product[] pList = new Product[40];

        //3. 40개 배열 실제 객체 추가
        for (int i = 0; i < pList.length; i++) {
            int num = r.nextInt(4);
            if (num == 0) {
                pList[i] = new Computer();
            } else if (num == 1) {
                pList[i] = new Aircon1();
            } else if (num == 2) {
                pList[i] = new Ref1();
            } else {
                pList[i] = new AirCleaner();
            }
            pList[i].print();
        }
        System.out.print("제품 입력 : ");
        String type = sc.next();
        System.out.print("제조사 : ");
        String br = sc.next();

        boolean check = true;
        for (int i = 0; i < pList.length; i++) {
            if (pList[i].type.equals(type) && pList[i].br.equals(br)) {
                System.out.println(i + "번째 제품입니다.");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("제품이 없습니다.");
        }
    }
}
