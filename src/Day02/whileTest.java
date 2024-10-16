package Day02;

public class whileTest {
    public static void main(String[] args) {
        //1~10까지 더한 결과 값 출력

        int num = 1;
        int result = 0;

        while( num <= 10){
            //result = result + num;
            result += num;
            num++;
        }
        System.out.println("1부터 10까지 합은"+result+"입니다.");
    }
}
