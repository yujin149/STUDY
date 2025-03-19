package Day17_Q2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Phone {// 데이터 담을 Phone class
    String name; // 멤버변수 String name;
    String phoneNumber; //멤버변수 String phoneNumber
    String address; // 멤버변수 String address

    //생성자 -> 객체를 만들때 문자열 3개를 받아서
    //본인 멤버변수에 대입
    Phone(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}

class Controller1 {// 전화번호 컨트롤을 하는 class
    //전화번호부 리스트
    ArrayList<Phone> tel; // Phone을 재네릭으 받는 ArrayList 변수 tel
    Scanner sc; // Scanner 자료형 변수 sc

    //생성자
    Controller1() {
        tel = new ArrayList<Phone>(); // 멤버변수 ArrayList 객체 생성
        sc = new Scanner(System.in);// 멤버변수 Scanner 객체 생성
    }

    //1. 입력
    void input(FileWriter fw) throws IOException {
        //멤버 변수 ArrayList에 size가 0이면 실행
        if (tel.size() == 0) {
            //ArrayList에 Phone 객체를 추가 이름 , 전화번호, 주소
            tel.add(new Phone("이름", "전화번호", "주소"));
            //파일에 쓰게될 문자열을 선언
            //1.파일에 쓰려고 할 때 탭만큼 띄기 위해서 \t\t를 중간에 사용
            //2.추후 데이터를 가지고 올 때 \t\t를 구분자로 사용하기 위해서
            String opn1 = "이름" + "\t\t" + "전화번호" + "\t\t" + "주소" + "\r\n";
            //파일쓰기 내용 -> opn1
            fw.write(opn1);
        }

        System.out.print("이름 :"); //입력
        String name = sc.next(); // String name에 입력 값 대입
        System.out.print("전화번호 :"); //입력
        String number = sc.next(); // String number에 입력 값 대입
        sc.nextLine(); // 버퍼 비우기
        System.out.print("주소 :"); // 입력
        String address = sc.nextLine(); // String address에 입력 값 대입
        //ArrayList에 입력 받은 name, number, address 추가
        tel.add(new Phone(name, number, address));
        //입력 받은 name, number, address를 문자열로 중간에 \t\t\가 들어가게 생성
        String total = name + "\t\t" + number + "\t\t" + address + "\r\n";
        //위에 선언 된 문자열 변수 total의 내용을 파일 쓰기 함
        fw.write(total);
        //파일쓰기가 완료되면 종료
        fw.close();
    }

    //2. 삭제

    void delete() throws IOException {
        System.out.print("검색할 이름을 넣어주세요 : "); //입력
        String search = sc.next(); // 문자열 search에 입력 문자열 대입

        int index = -1; // 삭제할 인덱스 값을 담기 위한 변수

        for (int i = 0; i < tel.size(); i++) {
            //전화번호부 리스트에 이름과 입력한 이름이 같은 경우 실행
            if (tel.get(i).name.equals(search)) {
                index = i;//i값을 index에 대입
            }
        }
        //index가 -1면 실행
        if (index == -1) {
            System.out.println("삭제할 이름이 없습니다.");
        }//위의 조건이 아니면 실행
        else {
            //FileWriter객체를 생성
            //생성자 매개변수 -> 파일 경로, false(덮어쓰기)
            FileWriter fw1 = new FileWriter("D:\\04_더조은\\강의02\\WorkJava\\Phonenumber\\phone.txt", false);
            //---> 파일에 내용이 초기화 됩니다.

            //ArrayList에서 위에서 검색한 index 값을 remove를 실행

            tel.remove(index);
            //====>ArrayList 삭제할 내용이 지워진 상태가 됩니다.
            //=---->ArrayList 정보가 무조건 맞습니다.
            //ArrayList size 만큼 반복을 합니다.
            for (int i = 0; i < tel.size(); i++) {
                //문자열 만듭니다. 이름\t\t전화번호\t\t주소\r\n
                String total = tel.get(i).name + "\t\t"
                        + tel.get(i).phoneNumber + "\t\t" + tel.get(i).address + "\r\n";
                //위에 문자열 total을 파일에 쓰기
                fw1.write(total);
            }
            //파일쓰기를 종료시킵니다.
            fw1.close();
        }

    }


    //3. 전체출력
    void allPrint() throws IOException {
        //ArrayList == 파일이랑 데이터 같습니다.
		/*
		if(tel.size() == 0) {
			System.out.println("없습니다.");
		}
		else {
			for(int i = 0;i<tel.size();i++) {
				System.out.println(tel.get(i).name +","+tel.get(i).phoneNumber+","+tel.get(i).address );
			}
		}
		*/
        //ArrayList를 안에 데이터를 모두 지웁니다.
        tel.clear();
        //파일 읽기 객체를 생성
        FileReader fr = new FileReader("D:\\04_더조은\\강의02\\WorkJava\\Phonenumber\\phone.txt");
        //BufferedReader객체를 생성 -> 매개변수 FileReader 객체를 받습니다.
        BufferedReader reader = new BufferedReader(fr);
        String line;//문자열 변수 line 생성
        String[] splitLine = null; // 문자열 배열 변수 splitLine 선언과 동시에 null 값 대입

        //파일에 있는 내용 한줄씩 읽어서 문자열 변수 line에 대입 후 null인지 체크하여 null 아닌경우 계속 반복
        while ((line = reader.readLine()) != null) {
            //문자열 메소드 split을 이용하여 구분자 \t\t 기준으로 자릅니다.
            //자른 데이터를 문자열 배열 splitLine에 대입합니다.
            splitLine = line.split("\t\t"); //split는 특정문자를 자르는 역할
            // splitLine[0](이름), splitLine[1](전화번호), splitLine[2](주소)
            // Phone 객체의 생성자 매개변수로 대입해서 객체를 생성
            // Phone 객체를 ArrayList tel에 추가
            tel.add(new Phone(splitLine[0], splitLine[1], splitLine[2]));
        }
        //파일의 내용을 ArrayList에 대입하였는데 size가 0인경우 실행
        if (tel.size() == 0) {
            System.out.println("없습니다.");
        } else {
            //ArrayList에 값이 있기때문에 전화번호 전체를 출력
            for (int i = 0; i < tel.size(); i++) {
                System.out.println(tel.get(i).name + "," + tel.get(i).phoneNumber + "," + tel.get(i).address);
            }
        }
    }

    //4. 검색
    void search() {
        System.out.print("검색할 이름을 넣어주세요 : "); //입력
        String search = sc.next(); // 문자열 search에 입력 문자열 대입

        int index = -1;// 검색한 값 인덱스를 받을 변수 선언과 동시에 -1 초기화

        //전체 크기의 ArrayList를 반복함
        for (int i = 0; i < tel.size(); i++) {
            //ArrayList 안에 Phone 객체의 name이 검색한 값과 일치하는 경우
            if (tel.get(i).name.equals(search)) {
                //i값을 index에 대입
                index = i;
                break;//반복문 종료
            }
        }
        //index가 -1이면 실행
        if (index == -1) {
            System.out.println("검색결과가 없습니다.");
        }
        //index가 -1이 아닌경우
        else {
            //index에 맞는 tel ArrayList의 객체의 멤버변수
            //이름, 전화번호, 주소를 출력합니다.
            System.out.println(tel.get(index).name + "," + tel.get(index).phoneNumber + "," + tel.get(index).address);//출력
        }

    }
}

public class Q2 {
    public static void main(String[] args) throws IOException {
        //Controller1 객체 생성
        Controller1 c = new Controller1();
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //File 객체 생성
        File f = new File("D:\\04_더조은\\강의02\\WorkJava\\Phonenumber\\phone.txt");
        //File exists -> 파일 존재 여부를 알려줍니다.
        //파일이 존재하면 실행
        if (f.exists()) {
            c.tel.clear(); // 리스트 모든파일 삭제
            //FileReader 객체 생성
            FileReader fr = new FileReader("D:\\04_더조은\\강의02\\WorkJava\\Phonenumber\\phone.txt");
            //BufferReader 객체를 생성시 FileReader 객체를 받습니다.
            BufferedReader reader = new BufferedReader(fr);
            String line;
            String[] splitLine = null;

            while ((line = reader.readLine()) != null) {
                splitLine = line.split("\t\t");
                //Controller1에 있는 ArrayList tel에 Phone 객체를 추가
                c.tel.add(new Phone(splitLine[0], splitLine[1], splitLine[2]));
            }
        }

        //무한 반복
        while (true) {
            System.out.print("1. 입력 2.검색 3.삭제 4.출력 5.종료");// 출력
            int num = sc.nextInt();// 입력
            FileWriter fw;//FileWriter fw 변수 선언
            //Contrller1 tel에 size가 0이면 데이터 X
            if (c.tel.size() == 0) {
                // 덮어쓰기 객체 생성
                fw = new FileWriter("D:\\04_더조은\\강의02\\WorkJava\\Phonenumber\\phone.txt", false); // 덮어쓰기
            } else {
                // 이어쓰기 객체 생성
                fw = new FileWriter("D:\\04_더조은\\강의02\\WorkJava\\Phonenumber\\phone.txt", true); // 이어쓰기
            }
            //입력이 1인경우
            if (num == 1) {
                c.input(fw); //추가 기능 실행 Controller1 -> input메소드
            }
            //입력이 2인경우
            else if (num == 2) {
                c.search(); // 검색 기능 실행 Controller1 -> search메소드
            }
            //입력이 3인경우
            else if (num == 3) {
                c.delete(); // 삭제 기능 실행 Controller1 -> delete메소드
            }
            //입력이 4인경우
            else if (num == 4) {
                c.allPrint(); // 전체 출력 실행 Controller1 -> allPrint메소드
            }
            //입력이 5인경우
            else if (num == 5) {
                System.out.println("프로그램을 종료합니다.");//출력
                break;//반복문 종료
            }
            //위 조건이 모두 아닌경우
            else {
                System.out.println("잘못된 입력입니다."); // 출력
            }

        }
    }
}
