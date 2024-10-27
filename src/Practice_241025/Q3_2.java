package Practice_241025;

import java.util.Scanner;

public class Q3_2 {

    static void input(Scanner sc, int[] weather) {
        System.out.print("월 입력 : ");
        weather[0] = sc.nextInt();
        System.out.print("온도 입력 : ");
        weather[1] = sc.nextInt();
    }

    static void print(int[] weather) {
        if (weather[1] > -16 && weather[1] < 38) {
            if (weather[0] >= 3 && weather[0] <= 5 && weather[1] >= 3 && weather[1] <= 15) {
                System.out.println("계절은 봄입니다. 온도는 " + weather[1] + "도 입니다.");
            } else if (weather[0] >= 6 && weather[0] <= 8 && weather[1] >= 18 && weather[1] <= 37) {
                System.out.println("계절은 여름입니다. 온도는 " + weather[1] + "도 입니다.");
            } else if (weather[0] >= 9 && weather[0] <= 11 && weather[1] >= 3 && weather[1] <= 15) {
                System.out.println("계절은 가을입니다. 온도는 " + weather[1] + "도 입니다.");
            } else if ((weather[0] == 12 || weather[0] == 1 || weather[0] == 2) && weather[1] >= -15 && weather[1] <= 2) {
                System.out.println("계절은 겨울입니다. 온도는 " + weather[1] + "도 입니다.");
            } else {
                System.out.println("계절과 온도가 맞지 않습니다.");
            }
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputWeather = new int[2];
        input(sc, inputWeather);
        print(inputWeather);

    }
}
