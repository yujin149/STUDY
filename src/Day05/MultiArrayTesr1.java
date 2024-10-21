package Day05;

public class MultiArrayTesr1 {
    public static void main(String[] args) {
        int[][] d = new int[3][]; //첫번째는 필수로 입력해야한다.

        //d[0][0] = 10;  뒤에는 배열을 안만들어있기때문에, null인 곳에 10을 넣은 것과 마찬가지임. 따라서 error.

        d[0] = new int[5];
        d[1] = new int[2];
        d[2] = new int[3];

        d[0][0] = 10;

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i].length);
        }

        int[][][] k = new int[3][][];
        k[0] = new int[5][2];

    }
}
