package Day04;

public class TempTest {
    public static void main(String[] args) {
        int a = 120;
        int b = 36;

        int c = a;
        a = b;
        b = c;

        System.out.println(a + "," + b);
    }
}
