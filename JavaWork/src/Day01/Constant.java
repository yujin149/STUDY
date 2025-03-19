package Day01;

public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100;
        final int MIN_NUM; //에러가 안남 -> java가 최신화 되면서 바뀌었다.
        MIN_NUM = 0;
        //MIN_NUM = 20; 다시 넣으면 에러가 난다.

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

    }
}
