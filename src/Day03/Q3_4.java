package Day03;

public class Q3_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    //        0              0 0
                    //      0 1 2            1 2
                    //    0 1 2 3 4          2 4
                    //  0 1 2 3 4 5 6        3 6
                    //0 1 2 3 4 5 6 7 8      4 8
                    for (int k = 0; k <= i * 2; k++) {
                        System.out.print("*");
                    }
                    break;
                }
            }
            System.out.println();
        }
    }
}
