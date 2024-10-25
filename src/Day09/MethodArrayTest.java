package Day09;


public class MethodArrayTest {
    static void abc(int[][] c) {

    }

    static int[] def(int[][][][] d) {
        return d[0][0][0]; //int[]의 값을 불러오기 때문에 소거하여 int [][][]이라는 것을 알 수 있다.
    }

    public static void main(String[] args) {
        int[][][][] a = new int[3][3][3][3];
        abc(a[0][0]);
    }
}
