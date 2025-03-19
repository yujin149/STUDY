package Day01;

public class TypeInference {
    public static void main(String[] args) {
        var i = 10;
        var j =10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);
        
        //str=3; 처음에 문자열로 받았기 때문에 문자열로만 넣어야한다. 에러가 난다...!!
        //에러나는 이유 : 선언 시 정의된 자료형만 가능해짐
        
    }
}
