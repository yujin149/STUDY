package Day01;

public class PrintTest {
    public static void main(String[] args) {
        System.out.print("안녕");
        System.out.print("Hello");
        System.out.println();
        System.out.println("잘가");
        System.out.print("Bye");
        System.out.println(541111212);
        System.out.println(1.7453);

        //printf 줄바꿈
        //특수문자 \n 줄바꿈이 됩니다.
        System.out.printf("나는 %s입니다.\n", "홍길동");
        System.out.printf("%d + %d = %d\n", 5,3,5+3);
        System.out.printf("%f + %f = %f\n", 2.7,3.1,2.7+3.1);
    }
}
