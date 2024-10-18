package Day03_test;

public class Q5_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) { //0 1 2
            for (int j = 2; j >= 0; j--) { // 2 1 0
                if (j > i) { //2 0 / 1 0
                    System.out.print(" ");
                } else { // 0 0
                    for (int str = 0; str <= i * 2; str++) {
                        System.out.print("*");
                    }
                    break;
                }
            }
            System.out.println();
        }

    }
}
