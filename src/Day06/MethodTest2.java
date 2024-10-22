package Day06;

public class MethodTest2 {

    static int a = 0; //메모리에 바로 올라가서 전역변수처럼 됨.

    //1. 주고 받고
    static String printHello(String name) {
        a = 10;
        return "안녕하세요" + name + "님";
    }

    //2. 주고 안받고
    static int sum() {
        int a = 5;
        int b = 20;
        return a + b;
    }

    //3. 안주고 받고
    static void outputName(String name) {
        System.out.println("안녕하세요" + name + "님");
    }

    //4.안주고 안받고
    static void printBye() {
        System.out.println("잘가세요.");
    }

    public static void main(String[] args) {
        String result = printHello("홍길동");
        System.out.println(result); //안녕하세요홍길동님
        System.out.println(a); //10
        //int iresult = sum()
        System.out.println(sum()); //25
        //System.out.println(a); //10
        outputName("강아지");
        printBye();

    }
}
