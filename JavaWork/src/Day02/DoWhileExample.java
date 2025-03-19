package Day02;

public class DoWhileExample {
    public static void main(String[] args) {
        //1~10까지 모두 더한 결과 값
        int num = 1;
        int sum = 0;

        do{
            sum+= num;
            num ++;
        }while(num<=10);

        System.out.println("1부터 10까지 합은 " +sum+"입니다.");
    }
}
