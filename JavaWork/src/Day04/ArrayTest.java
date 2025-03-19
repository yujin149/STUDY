package Day04;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[5]; //정수 배열 5개 생성 및 변수 지정

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " : " + a[i]);
        }

        int b[] = new int[5]; //위치를 이렇게 사용하지 않는 걸 추천.

        int[] kor = new int[100];
        for (int i = 0; i < 100; i++) {
            kor[i] = i + 1;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("kor[" + i + "] : " + kor[i]);
        }


        for (int i = 0; i < 5; i++) {
            a[i] = 10 * (i + 1);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("a[" + i + "] : " + a[i]);
        }

        //배열을 사용하지 않으면 아래처럼 변수를 여러개 지정해야한다.
        int c = 10;
        int d = 20;
        int e = 30;
        int f = 40;
        int g = 50;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
