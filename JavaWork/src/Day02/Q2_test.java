package Day02;
/*
* 사용자 월 / 온도 입력
*

* */
import java.util.Scanner;

public class Q2_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("월 입력 : ");
        int userMonth = sc.nextInt();

        System.out.print("온도 입력 : ");
        int userTemp = sc.nextInt();

        if(userMonth >= 3 && userMonth <= 5) {
            if (userTemp >= 3 && userTemp <= 15) {
                System.out.println("계절은 봄입니다. 온도는 " + userTemp + "입니다.");
            } else if(userTemp >=-15 && userTemp <= 37) {
                System.out.println("계절과 온도가 맞지 않습니다.");
            }else{
                System.out.println("잘못된 입력입니다.");
            }
        }else if(userMonth >= 6 && userMonth <= 8){
            if (userTemp >= 18 && userTemp <= 37) {
                System.out.println("계절은 여름입니다. 온도는 " + userTemp + "입니다.");
            } else if(userTemp >=-15 && userTemp <= 37) {
                System.out.println("계절과 온도가 맞지 않습니다.");
            }else{
                System.out.println("잘못된 입력입니다.");
            }
        }else if(userMonth >= 9 && userMonth <= 11) {
            if (userTemp >= 3 && userTemp <= 15) {
                System.out.println("계절은 가을입니다. 온도는 " + userTemp + "입니다.");
            } else if(userTemp >=-15 && userTemp <= 37) {
                System.out.println("계절과 온도가 맞지 않습니다.");
            }else{
                System.out.println("잘못된 입력입니다.");
            }
        }else if(userMonth == 12 || userMonth <= 2) {
            if (userTemp >= -15 && userTemp <= 2) {
                System.out.println("계절은 겨울입니다. 온도는 " + userTemp + "입니다.");
            } else if(userTemp >=-15 && userTemp <= 37) {
                System.out.println("계절과 온도가 맞지 않습니다.");
            }else{
                System.out.println("잘못된 입력입니다.");
            }
        }else{
            System.out.println("잘못된 입력입니다.");
        }
    }
}
