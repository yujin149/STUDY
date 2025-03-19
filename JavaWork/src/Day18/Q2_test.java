package Day18;

import java.util.Random;

//자동차 게이지 : _, 자동차 주행 거리 : ___;
abstract class Vehicle {
    int gauge; //게이지
    int move; //주행 거리


    abstract void moveVeh();

}

class Car extends Vehicle {
    Car() {
        this.gauge = 0;
        this.move = 0;
    }

    void moveVeh() {
        Random r = new Random();
        int distance = r.nextInt(21);


//        if (turn % 4 == 0) {
//            distance += 2;
//        }
        if (gauge == 3) {
            gauge = 0;
            distance += 2;
        } else {
            gauge++;
        }
        move += distance;
        System.out.println("자동차 게이지 : " + gauge + ", 총 주행 거리: " + move);
    }
}

class Bicycle extends Vehicle {
    Bicycle() {
        this.gauge = 0;
        this.move = 0;
    }

    void moveVeh() {
        Random r = new Random();
        int distance = r.nextInt(11);

//        if (turn % 2 == 0) {
//            distance += 5;
//        }

        if (gauge == 2) {
            gauge = 0;
            distance += 5;
        } else {
            gauge++;
        }
        move += distance;
        System.out.println("자전거 게이지 : " + gauge + ", 총 주행 거리: " + move);
    }
}

class Bike extends Vehicle {
    Bike() {
        this.gauge = 0;
        this.move = 0;
    }

    void moveVeh() {
        Random r = new Random();
        int distance = r.nextInt(16);

//        if (turn % 3 == 0) {
//            distance += 3;
//        }

        if (gauge == 2) {
            gauge = 0;
            distance += 3;
        } else {
            gauge++;
        }
        move += distance;
        System.out.println("오토바이 게이지 : " + gauge + ", 총 주행 거리: " + move);
    }
}


public class Q2_test {
    public static void main(String[] args) throws InterruptedException {
        //랜덤으로 1~3 중 움직이기 못하게 한다.
        //자동차 0~20 / 자전거 0~10 / 오초바이 0~15까지 턴마다 움직일 수 있다.

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Bike bike = new Bike();

        Random r = new Random();
        //int turn = 1;
        while (car.move < 500 && bicycle.move < 500 && bike.move < 500) {
            int ran = r.nextInt(3) + 1;
            //System.out.println("============= " + (turn++) + "턴 =============");
            if (ran == 1) {
                System.out.println("========== 자동차 돌발상황!!! ==========");
                bicycle.moveVeh();
                bike.moveVeh();
            } else if (ran == 2) {
                System.out.println("========== 자전거 돌발상황!!! ==========");
                car.moveVeh();
                bike.moveVeh();
            } else {
                System.out.println("========== 오토바이 돌발상황!!! ==========");

                car.moveVeh();
                bicycle.moveVeh();
            }
            Thread.sleep(500);
        }
        if (car.move > bicycle.move && car.move > bike.move) {
            System.out.println("자동차 우승입니다.");
        }
        if (bicycle.move > car.move && bicycle.move > bike.move) {
            System.out.println("자전거 우승입니다.");
        }
        if (bike.move > car.move && bike.move > bicycle.move) {
            System.out.println("오토바이 우승입니다.");
        }

    }
}
