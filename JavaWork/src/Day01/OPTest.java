package Day01;

public class OPTest {
    public static void main(String[] args) {
        //산술연산자
        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore;
        System.out.println(totalScore); //160
        double avgScore = totalScore /2.0; //소숫점 평균 내기 위해서
        System.out.println(avgScore); // 80.0

        System.out.println(6912394%3); //나머지 연산자 나머지는 뒤에값을 넘을 수가 없다.
        int a = 10;
        System.out.println(a++); //후치
        System.out.println(++a); //선치

        //관계 연산자
        int b = 10;
        int c = 12;
        int d = 10;

        System.out.println(b==c); //false
        System.out.println(b != c);//true
        System.out.println(b>=c); //false
        System.out.println(d<=c);//true
        System.out.println(c<b); //false

        //논리 연사자
        System.out.println(5 > 3 && 4 == 7 || 3 != 7); //true

        //단축 연산자
        int e = 10;
        int f = 5;
        e += f;
        System.out.println(e); // 15
        e -=f;
        System.out.println(e); //10

        //삼항 연산자
        int x = e == 10? 1:0;
        System.out.println(x); //1



    }
}
