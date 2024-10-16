package Day02;

public class ForExample {
    public static void main(String[] args) {
        int i;
        int sum;
        //초기화문에 보시면 하나가 아니라 2개를 초기화
        //증가감문도 2개를 쓸수 있다. 하지만 조건은 여러개는 안된다. && ||는 가능

        for(i = 1, sum = 0; i<=10;i++){
            sum+=i;
        }
        //for문 초기화문에서 선언된 변수는 for문 안에서만 사용이 가능합니다.
        for(int j = 0;j<=10;j++){

        }
        System.out.println(sum);
        System.out.println(i);
    }
}
