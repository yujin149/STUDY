package Day05;

public class Q4_test {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = count++;
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 3; i < 4; i++) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 4; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
