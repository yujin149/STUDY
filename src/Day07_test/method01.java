package Day07_test;

/*
    1~10까지 출력하는 메소드
 */
public class method01 {
    //1~10
    static void numList(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

    static void print() {
        int[] arr = new int[10];
        numList(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        print();

    }

}

