package Day01_test;

public class 삼항연산자 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        String num3 = num1 < num2 ? "num2가 큽니다." : "num2가 크지 않습니다.";
        System.out.println(num3);
        //결과가 string으로 한다면 string으로 변수를 지정하면 된다!!!


        String str1 = "a";
        String str2 = "b";
        int str3 = str1 != str2 ? 10 : 20;
        System.out.println(str3);


    }
}
