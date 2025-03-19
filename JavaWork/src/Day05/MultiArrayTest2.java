package Day05;

public class MultiArrayTest2 {
    public static void main(String[] args) {
        int[][] a = new int[5][];
        a[3] = new int[5];
        System.out.println(a[3][2]); //0

        int[][][][][] c = new int[4][4][4][][];

        c[0][0][0] = new int[5][5];
        c[1][1][1] = a;


        System.out.println("=====================");
        int[][][] b = new int[2][2][2];

        int count = 1;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int x = 0; x < b[i][j].length; x++) {
                    b[i][j][x] = count++;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int x = 0; x < b[i][j].length; x++) {
                    System.out.print(b[i][j][x] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
