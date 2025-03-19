package Day13;

import java.util.Scanner;

class Computer {
    String menu; //제조사
    String cpu; //CPU
    int price; //가격

    Computer(String menu, String cpu, int price) {
        this.menu = menu;
        this.cpu = cpu;
        this.price = price;
    }

    void use() {
        System.out.println("제조사가" + menu + "인" + cpu + "컴퓨터를 사용한다.");
    }
}

class AirCorn {
    String menu; //제조사
    String type; //타입
    int price; //가격

    AirCorn(String menu, String type, int price) {
        this.menu = menu;
        this.type = type;
        this.price = price;
    }

    void use() {
        System.out.println("제조사가" + menu + "인" + type + "에어컨을 사용한다.");
    }
}

class Ref {
    String menu; //제조사
    String type; //타입
    String size; //크기
    int price; //가격

    Ref(String menu, String type, String size, int price) {
        this.menu = menu;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    void use() {
        System.out.println("제조사가" + menu + "인" + type + "형" + size + "냉장고가 식품을 관리한다.");
    }
}

class AirCleaner {
    String menu; //제조사
    int price; //가격

    AirCleaner(String menu, int price) {
        this.menu = menu;
        this.price = price;
    }

    void use() {
        System.out.println("제조사가" + menu + "인 공기청정기가 공기를 깨끗하게 한다.");
    }
}

class Mart {
    //1. 컴퓨터 10대
    Computer[] c = new Computer[10];
    //2. 에어컨 10대
    AirCorn[] a = new AirCorn[10];
    //3. 냉장고 10대
    Ref[] r = new Ref[10];
    //4. 공기청정기 10대
    AirCleaner[] ac = new AirCleaner[10];

    int index = -1;

    Mart() {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {// 0~4
                c[i] = new Computer("삼성", "i7", 200);
                a[i] = new AirCorn("삼성", "벽걸이", 100);
                r[i] = new Ref("삼성", "양문", "600L", 200);
                ac[i] = new AirCleaner("LG", 80);
            } else {
                c[i] = new Computer("LG", "i5", 150);
                a[i] = new AirCorn("LG", "스탠드", 250);
                r[i] = new Ref("LG", "4도어", "800L", 350);
                ac[i] = new AirCleaner("다이슨", 60);
            }
        }
    }

    //삼성 0~5 LG 5~10
    Computer sendComputer(int star, int end) {
        for (int i = star; i < end; i++) {
            if (c[i] != null) {
                index = i;
                return c[i];
            }
        }
        return null;
    }

    AirCorn sendAirCorn(int star, int end) {
        for (int i = star; i < end; i++) {
            if (a[i] != null) {
                index = i;
                return a[i];
            }
        }
        return null;
    }

    Ref sendRef(int star, int end) {
        for (int i = star; i < end; i++) {
            if (r[i] != null) {
                index = i;
                return r[i];
            }
        }
        return null;
    }

    AirCleaner sendAirCleaner(int star, int end) {
        for (int i = star; i < end; i++) {
            if (ac[i] != null) {
                index = i;
                return ac[i];
            }
        }
        return null;
    }

    void changeNullComputer() {
        c[index] = null;
    }

    void changeNullAirCorn() {
        a[index] = null;
    }

    void changeNullRef() {
        r[index] = null;
    }

    void changeNullAirCleaner() {
        ac[index] = null;
    }
}

class Consumer {
    String name;
    //1. 컴퓨터 10대
    Computer[] c = new Computer[10];
    //2. 에어컨 10대
    AirCorn[] a = new AirCorn[10];
    //3. 냉장고 10대
    Ref[] r = new Ref[10];
    //4. 공기청정기 10대
    AirCleaner[] ac = new AirCleaner[10];

    int money;

    Consumer(String name) {
        this.name = name;
    }

    void receiveComputer(Computer com) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = com;
                break;
            }
        }
    }

    void receiveAirCorn(AirCorn airCorn) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                a[i] = airCorn;
                break;
            }
        }
    }

    void receiveRef(Ref ref) {
        for (int i = 0; i < r.length; i++) {
            if (r[i] == null) {
                r[i] = ref;
                break;
            }
        }
    }

    void receiveAirCleaner(AirCleaner airCleaner) {
        for (int i = 0; i < ac.length; i++) {
            if (ac[i] == null) {
                ac[i] = airCleaner;
                break;
            }
        }
    }

    //제품구매목록 출력
    void allPrint() {
        System.out.println(name + " 소비자");
        for (int i = 0; i < 10; i++) {
            if (c[i] != null) {
                c[i].use();
            }
            if (a[i] != null) {
                a[i].use();
            }
            if (r[i] != null) {
                r[i].use();
            }
            if (ac[i] != null) {
                ac[i].use();
            }
        }
    }
}

public class MartTest {
    public static void main(String[] args) {
        Mart m = new Mart();
        Consumer[] cons = new Consumer[3];
        Scanner sc = new Scanner(System.in);

        //1. 돈받기
        for (int i = 0; i < cons.length; i++) {
            cons[i] = new Consumer((i + 1) + "번");
            System.out.print((i + 1) + "번째 소비자 : ");
            cons[i].money = sc.nextInt();
        }

        //2.물건사기
        while (cons[0].money >= 60 || cons[1].money >= 60 || cons[2].money >= 60) {
            for (int i = 0; i < cons.length; i++) {
                System.out.println((i + 1) + "번째 소비자 남은 금액 : " + cons[i].money);
                if (cons[i].money >= 60) {
                    System.out.print((i + 1) + "번째 소비자 상품을 선택해주세요 1. 컴퓨터 2. 에어콘" +
                            "3. 냉장고 4. 공기청정기 : ");
                    int num = sc.nextInt();
                    if (num == 1) {
                        System.out.print("1.삼성 2.LG : ");
                        int type = sc.nextInt();
                        if (type == 1) {
                            if (cons[i].money >= 200) {
                                Computer c = m.sendComputer(0, 5);
                                if (c == null) {
                                    System.out.println("물건이 다 팔렸습니다.");
                                } else {
                                    cons[i].money -= c.price;
                                    cons[i].receiveComputer(c);
                                    m.changeNullComputer();
                                }
                            } else {
                                System.out.println("돈이 부족합니다.");
                            }
                        } else if (type == 2) {
                            if (cons[i].money >= 150) {
                                Computer c = m.sendComputer(5, 10);
                                if (c == null) {
                                    System.out.println("물건이 다 팔렸습니다.");
                                } else {
                                    cons[i].money -= c.price;
                                    cons[i].receiveComputer(c);
                                    m.changeNullComputer();
                                }
                            } else {
                                System.out.println("돈이 부족합니다.");
                            }
                        } else {
                            System.out.println("잘못된 입력입니다.");
                        }
                    } else if (num == 2) {
                        System.out.print("1.삼성 2.LG : ");
                        int type = sc.nextInt();
                        if (type == 1) {
                            if (cons[i].money >= 100) {
                                AirCorn a = m.sendAirCorn(0, 5);
                                if (a == null) {
                                    System.out.println("물건이 다 팔렸습니다.");
                                } else {
                                    cons[i].money -= a.price;
                                    cons[i].receiveAirCorn(a);
                                    m.changeNullAirCorn();
                                }
                            } else {
                                System.out.println("돈이 부족합니다.");
                            }
                        } else if (type == 2) {
                            if (cons[i].money >= 250) {
                                AirCorn a = m.sendAirCorn(5, 10);
                                if (a == null) {
                                    System.out.println("물건이 다 팔렸습니다.");
                                } else {
                                    cons[i].money -= a.price;
                                    cons[i].receiveAirCorn(a);
                                    m.changeNullAirCorn();
                                }
                            } else {
                                System.out.println("돈이 부족합니다.");
                            }
                        } else {
                            System.out.println("잘못된 입력입니다.");
                        }
                    } else if (num == 3) {
                        System.out.print("1.삼성 2.LG : ");
                        int type = sc.nextInt();
                        if (type == 1) {
                            if (cons[i].money >= 200) {
                                Ref r = m.sendRef(0, 5);
                                if (r == null) {
                                    System.out.println("물건이 다 팔렸습니다.");
                                } else {
                                    cons[i].money -= r.price;
                                    cons[i].receiveRef(r);
                                    m.changeNullRef();
                                }
                            } else {
                                System.out.println("돈이 부족합니다.");
                            }
                        } else if (type == 2) {
                            if (cons[i].money >= 350) {
                                Ref r = m.sendRef(5, 10);
                                if (r == null) {
                                    System.out.println("물건이 다 팔렸습니다.");
                                } else {
                                    cons[i].money -= r.price;
                                    cons[i].receiveRef(r);
                                    m.changeNullRef();
                                }
                            } else {
                                System.out.println("돈이 부족합니다.");
                            }
                        } else {
                            System.out.println("잘못된 입력입니다.");
                        }
                    } else if (num == 4) {
                        System.out.print("1.LG 2.다이슨 : ");
                        int type = sc.nextInt();
                        if (type == 1) {
                            if (cons[i].money >= 80) {
                                AirCleaner ac = m.sendAirCleaner(0, 5);
                                if (ac == null) {
                                    System.out.println("물건이 다 팔렸습니다.");
                                } else {
                                    cons[i].money -= ac.price;
                                    cons[i].receiveAirCleaner(ac);
                                    m.changeNullAirCleaner();
                                }
                            } else {
                                System.out.println("돈이 부족합니다.");
                            }
                        } else if (type == 2) {
                            if (cons[i].money >= 60) {
                                AirCleaner ac = m.sendAirCleaner(5, 10);
                                if (ac == null) {
                                    System.out.println("물건이 다 팔렸습니다.");
                                } else {
                                    cons[i].money -= ac.price;
                                    cons[i].receiveAirCleaner(ac);
                                    m.changeNullAirCleaner();
                                }
                            } else {
                                System.out.println("돈이 부족합니다.");
                            }
                        } else {
                            System.out.println("잘못된 입력입니다.");
                        }
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }

                }
            }
        }
        //3. 물건산거 출력하기
        for (int i = 0; i < cons.length; i++) {
            cons[i].allPrint();
        }
    }
}
