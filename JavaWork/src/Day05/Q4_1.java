package Day05;

public class Q4_1 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int count = 1;
        int sw = 1; //증가하는 방향을 바꾸기 위해

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (sw == 1) {
                    a[i][j] = count++;
                } else {
                    a[i][a[i].length - 1 - j] = count++;
                }
            }

            sw = sw * -1;

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
