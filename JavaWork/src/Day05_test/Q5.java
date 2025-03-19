package Day05_test;

public class Q5 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5]; //5만큼 돌아야함.

        int R = 0; //행 // 인덱스가 1로 시작하기때문에 0 // ++로 할거임.
        int C = -1; //열 //인덱스가 0으로 시작하며, -에서 +로 될거기때문에,

        int K = 5; // 반복 횟수
        int SW = 1; // 증가 감소를 위한 스위치
        int N = 1; // 1부터 증가해서 배열에 채워지는 값 (카운트 같은)

        //달팽이 구조는 열에 끝난다. 행으로 내려가기 전에 break;
        while (true) {
            //열 K = 5
            for (int i = 0; i < K; i++) {
                C = C + SW; //C가 -1인데, SW(1)을 더하니까 0이 된다. //C만 바뀌게 된다.
                arr[R][C] = N++; //arr[0][0] = 1++(출력숫자)
            }
            K--; //K(반복횟수)가지고 진행하고 있으므로, 반복횟수를 줄인다. (5였으므로, 4번이 된다.)

            if (K == 0) { // K가 0이 되어 더이상 못 돌게 되므로 반복문을 빠져나가기 위해 break를 넣어줌.
                break;
            }

            //행 //내려가는게 값이 커짐
            for (int i = 0; i < K; i++) {
                R = R + SW; // R이 0이고 1부터 시작하므로, SW(1)을 더해주면 1부터 시작하게 된다.
                arr[R][C] = N++; //arr[1][4] //C는 고정.
            }
            SW *= -1; //SW는 1이고, 여기에서 끝나면 -1로 해준다. // 다음 턴은 -1해주면 1이 되면서 턴이 바뀜
            // 그러면, -1이 되어  C = C + SW;에서 3 2 1 0 으로 진행된다.
            //  R = R + SW;에서는 3 2 1 로 진행
        }


        //출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
