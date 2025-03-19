package Day03;

public class Q3_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    for (int k = 0; k <= i * 2; k++) {
                        System.out.print("*");
                    }
                    break;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 3; k - (i * 2) > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
