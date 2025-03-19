package Day16;

import java.util.ArrayList;
import java.util.Scanner;

class TelBook {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String tel;
    private String address;
    private int age;

    TelBook(String name, String tel, String address, int age) {
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.age = age;
    }

    void print() {
        System.out.println("이름 : " + name +
                ", 전화번호 : " + tel + ", 주소 : " + address + ", 나이 : " + age + "세");
    }
}


public class Q3_test {

    public static void main(String[] args) {
        ArrayList<TelBook> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.추가  2.삭제  3.전체 출력  4.이름 검색  5.종료");
            System.out.print("번호 입력 :");
            int num = sc.nextInt();
            if (num < 1 || num > 5) {
                System.out.println("잘못된 입력입니다.");
            } else {
                if (num == 1) {
                    System.out.print("이름: ");
                    String name = sc.next();
                    System.out.print("전화번호: ");
                    String tel = sc.next();
                    System.out.print("주소: ");
                    String address = sc.next();
                    System.out.print("나이: ");
                    int age = sc.nextInt();
                    list.add(new TelBook(name, tel, address, age));
                    System.out.println(name + "님의 정보가 추가되었습니다.");

                } else if (num == 2) {
                    System.out.print("삭제할 이름: ");
                    String deleteName = sc.nextLine();

                    
                }
            }
        }

    }
}
