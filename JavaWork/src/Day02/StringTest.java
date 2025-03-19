package Day02;

public class StringTest {
    public static void main(String[] args) {
        String str = "hi";

        if(str == "hi"){
            System.out.println("hi");
        }else{
            System.out.println("no hi");
        }

        //참조자료형은 원래 비교가 안된다.
        //if(str.equals("hi"))
        //문자열 비교는 이렇게 쓰는게 더 안전하게 비교할 수 있다.


    }
}

