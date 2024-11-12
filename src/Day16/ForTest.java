package Day16;

public class ForTest {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 9};
        for (int i = 0; i < a.length; i++) { //i는 index
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==================");
        //향상된 for 문은 무조건 자료구조
        //무조건 데이터가 있어야 함.

        for (int i : a) { // i는 value
            System.out.print(i + " ");
        }
    }
}
