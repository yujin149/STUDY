package Day05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(array.length); // 10 최대 인덱스 array.lenght -1

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
