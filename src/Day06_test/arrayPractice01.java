package Day06_test;

/*
길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
출력결과 예시)
1 2 3 4 5 6 7 8 9 10
 */
public class arrayPractice01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int plus = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = plus;
            plus++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
