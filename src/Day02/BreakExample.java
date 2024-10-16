package Day02;

public class BreakExample {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        while (true) {
            sum += num;
            if (sum >= 100) {
                break;
            }
            num++;
        }
        //좋은 for문 X
        /*
        for(num = 0; ;num++){
        sum += num;
        if (sum >= 100) {
                break;
            }
        }
        */
        System.out.println("num : " + num);
        System.out.println("num : " + sum);
    }
}
