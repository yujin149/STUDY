package Day16;

import java.util.Random;
import java.util.Scanner;

class Water {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    Water() {
        Random r = new Random();
        num = r.nextInt(8) + 1;
    }

    public void printNum() {
        System.out.print(num + " ");
    }
}


class Person {
    private Water[] waters;

    Person() {
        waters = new Water[10];
        int addWater = 0;

        for (int i = 0; i < waters.length; i++) {
            waters[i] = new Water();
        }
    }

    public int printWaters() {
        int addWater = 0;
        for (int i = 0; i < waters.length; i++) {
            //System.out.print("Water " + (i + 1) + ": ");
            // waters[i].printNum();  // 각 Water 객체의 num 배열 출력

            addWater += waters[i].getNum();
        }
        System.out.println(addWater);
        return addWater;
    }
}


public class Q1_test {
    public static void main(String[] args) {
        Water water = new Water();
        //int waterNum = water.getNum();


        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        System.out.print("사람 1의 총 물양 : ");
        int total1 = person1.printWaters();

        System.out.print("사람 2의 총 물양 : ");
        int total2 = person2.printWaters();

        System.out.print("사람 3의 총 물양 : ");
        int total3 = person3.printWaters();


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("물을 제일 많이 가지고 있는 사람은?");
            int inputNum = sc.nextInt();

            if (inputNum > 3 || inputNum < 0) {
                System.out.println("잘못 입력하셨습니다.");
            } else {
                if (inputNum == 1) {
                    if (total1 > total2 && total1 > total3) {
                        System.out.println("정답입니다.");
                        break;
                    } else {
                        System.out.println("틀렸습니다.");
                    }
                }
                if (inputNum == 2) {
                    if (total2 > total1 && total2 > total3) {
                        System.out.println("정답입니다.");
                        break;
                    } else {
                        System.out.println("틀렸습니다.");
                    }
                }
                if (inputNum == 3) {
                    if (total3 > total1 && total3 > total2) {
                        System.out.println("정답입니다.");
                        break;
                    } else {
                        System.out.println("틀렸습니다.");
                    }
                }
            }
        }


    }
}
