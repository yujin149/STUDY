package Day16_test;

import java.util.ArrayList;
import java.util.Scanner;


public class Q3_test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> phonebook = new ArrayList<>();

        while (true) {
            System.out.println("1.추가 2.삭제 3.전체 출력 4.이름검색 5.종료");
            int inputnum = sc.nextInt();
            if (inputnum > 5 || inputnum < 0) {
                System.out.println("잘못된 입력입니다~");
            } else {
                if (inputnum == 1) {
                    System.out.print("이름 : ");
                    phonebook.add(0, sc.next());
                    System.out.print("전화번호 : ");
                    phonebook.add(1, sc.next());
                    System.out.print("주소 : ");
                    phonebook.add(2, sc.next());
                    System.out.print("나이 : ");
                    phonebook.add(3, sc.next());

                    System.out.println(phonebook.get(0) + "님 정보가 입력되었습니다 환영합니다");
                } else if (inputnum == 2) {
                    phonebook.remove(0);
                    String n = "null";
                    phonebook.add(0, n);
                    System.out.println("이름이 삭제되었습니다");
                } else if (inputnum == 3) {
                    String s = "null";
                    if (s.equals(phonebook.get(0))) {
                        System.out.println(phonebook.get(1) + phonebook.get(2) + phonebook.get(3));
                    } else {
                        System.out.println(phonebook.get(0) + phonebook.get(1) + phonebook.get(2) + phonebook.get(3));
                    }
                } else if (inputnum == 4) {
                    phonebook.get(0);
                    System.out.print("이름 검색 : ");
                    String str = sc.next();
                    if (str.equals(phonebook.get(0))) {
                        System.out.println(phonebook.get(0));
                    } else {
                        System.out.println("전화번호부에 없습니다");
                    }
                } else {
                    System.out.println("종료합니다");
                    break;
                }
            }
        }
    }
}