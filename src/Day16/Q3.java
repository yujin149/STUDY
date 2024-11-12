package Day16;

import java.util.ArrayList;
import java.util.Scanner;

class PhoneData {
    String name;
    String telNumber;
    String address;
    int age;

    PhoneData(String name, String telNumber, String address, int age) {
        this.name = name;
        this.telNumber = telNumber;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n 전화번호 : " + telNumber + "\n 주소 : " + address + "\n 나이 : " + age + "세";
    }
}

public class Q3 {
    public static void main(String[] args) {
        //1.List 필요 => PhoneData
        ArrayList<PhoneData> phoneDataArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        /////////////////////////////////////////////////////////////////
        // 1,2,3,4,5 그 이외
        while (true) {
            System.out.print("1.추가 2.삭제 3.전체 출력 4.이름 검색 5.종료 : ");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.print("이름 : ");
                String name = sc.next();
                System.out.print("전화번호 : ");
                String tel = sc.next();
                sc.nextLine();
                System.out.print("주소 : ");
                String address = sc.nextLine();
                System.out.print("나이 : ");
                int age = sc.nextInt();

                System.out.println(name + "님 정보가 추가되었습니다.");
                phoneDataArrayList.add(new PhoneData(name, tel, address, age));
            } else if (num == 2) {
                System.out.print("이름 : ");
                String name = sc.next();

                boolean check = true;
                for (int i = 0; i < phoneDataArrayList.size(); i++) {
                    if (phoneDataArrayList.get(i).name.equals(name)) {
                        phoneDataArrayList.remove(i);
                        System.out.println(name + "님 정보를 삭제했습니다.");
                        check = false;
                    }
                }
                if (check) {
                    System.out.println("전화번호부에 없습니다.");
                }

            } else if (num == 3) {
                for (PhoneData p : phoneDataArrayList) {
                    System.out.println(p);
                    System.out.println("=========================");
                }

            } else if (num == 4) {
                System.out.print("이름 : ");
                String name = sc.next();

                boolean check = true;
                for (int i = 0; i < phoneDataArrayList.size(); i++) {
                    if (phoneDataArrayList.get(i).name.equals(name)) {
                        System.out.println(phoneDataArrayList.get(i));
                        check = false;
                    }
                }
                if (check) {
                    System.out.println("전화번호부에 없습니다.");
                }

            } else if (num == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
