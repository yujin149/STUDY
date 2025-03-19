package Day05_test;

public class Q3 {
    public static void main(String[] args) {
        int[][] array2 = new int[5][5];
        int num = 1;

        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = num++;
                }
            } else {
                for (int j = array2[i].length - 1; j >= 0; j--) {
                    array2[i][j] = num++;
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
