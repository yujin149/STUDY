package Day02;
/*
* String id ="Korea"
* String passwd = /"1234"
* 
* Id 입력 : xxxx
* 패스워드 입력 : xxxx
* 
* id와 패스워드 모두 맞는 경우
* id가 틀리고 패스워드가 맞는경우
* id가 맞고 패스워드가 틀린경우
* id와 패스워드 모두 틀린 경우
*/
import java.util.Scanner;

public class Q1_test {
    public static void main(String[] args) {
        //1. 변수 선언과 동시에 초기화 입력문 사용하기 위해 Scanner 준비

        Scanner sc = new Scanner(System.in);
        String id = "Korea";
        String password = "1234";
        //2. 입력


        System.out.print("id 입력 : ");
        String idInput = sc.next();

        System.out.print("pw 입력 : ");
        String pwInput = sc.next();
        //3. 입력 받은 값과 선언한 변수 값 비교해서 출력
        //3-1 모두 맞는 경우

        if(idInput.equals(id)&&pwInput.equals(password)) {
            System.out.println("환영합니다. Korea님");
        }
        //3-2 패스워드만 맞는 경우

        else if(!(id.equals(idInput)) &&pwInput.equals(password)){
            System.out.println("id가 올바르지 않습니다. ");
        }
        //3-3 id만 맞는경우
        else if(idInput.equals(id)&&!(password.equals(idInput))){
            System.out.println("pw가 올바르지 않습니다. ");
        }

        //3-4 모두 틀린경우
        else {
            System.out.println("둘 다 올바르지 않습니다. ");
        }

    }
}
