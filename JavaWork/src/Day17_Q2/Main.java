package Day17_Q2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class TelData {
    String name;
    String tel;
    String address;
    int age;

    TelData(String name, String tel, String address, int age) {
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.age = age;
    }

    public String toString() {
        return "이름 : " + name + "\n전화번호 : " + tel + "\n 주소 : "
                + address + "\n나이 : " + age + "세";
    }

}

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<TelData> telDataArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

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
                telDataArrayList.add(new TelData(name, tel, address, age));
            } else if (num == 2) {
                System.out.print("이름 : ");
                String name = sc.next();
                boolean check = true;
                for (int i = 0; i < telDataArrayList.size(); i++) {
                    if (telDataArrayList.get(i).name.equals(name)) {
                        telDataArrayList.remove(i);
                        System.out.println(name + "을 삭제 했습니다.");
                        check = false;
                    }
                }
                if (check) {
                    System.out.println("전화번호부에 없습니다.");
                }
            } else if (num == 4) {
                System.out.println("이름 : ");
                String name = sc.next();
                boolean check = true;
                for (int i = 0; i < telDataArrayList.size(); i++) {
                    if (telDataArrayList.get(i).name.equals(name)) {
                        System.out.println(telDataArrayList.get(i));
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
