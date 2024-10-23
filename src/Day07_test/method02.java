package Day07_test;

public class method02 {
    static void number(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    static int sum() {
        int[] arr = new int[10];
        number(arr); //배열 초기화
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum());

    }

}
