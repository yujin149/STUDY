package Practice_241025;

import java.util.Scanner;

/*
String id = “korea”
String passwd = “1234”

Id 입력 : XXXX
패스워드 입력 : XXXXX

Id와 패스워드가 맞으면  -> “환영합니다. Korea님”

Id와 또는 패스워드가 틀리면
id가 틀린경우 패스워드 맞고 -> id가 올바르지 않습니다.
id가 맞고 패스워드가 틀린 경우 -> 패스워드가 올바르지 않습니다.
id 패스워드 모두 틀린 경우 -> id와 패스워드가 올바르지 않습니다.
 */
public class Q2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Id 입력 : ");
        String id = sc.next();
        System.out.print("패스워드 입력 : ");
        String passwd = sc.next();

        if (id.equals("Korea") && passwd.equals("1234")) {
            System.out.println("환영합니다. " + id + "님");
        } else if (id.equals("Korea") && !passwd.equals("1234")) {
            System.out.println("패스워드가 올바르지 않습니다.");
        } else if (!id.equals("Korea") && passwd.equals("1234")) {
            System.out.println("id가 올바르지 않습니다.");
        } else {
            System.out.println("id와 패스워드가 올바르지 않습니다.");
        }
    }
}
