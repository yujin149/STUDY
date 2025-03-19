package Day06;

import java.util.Scanner;

public class Q3 {
    //1. 입력 (주고 받고)
    static int[] input() {
        Scanner sc = new Scanner(System.in);
        String[] subject = {"국어", "영어", "수학"};
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.print(subject[i] + " : ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    //2. 평균학점 연산(주고 받고)
    static double avg(int[] array) {
        double avg = (array[0] + array[1] + array[2]) / 3.0;
        return avg;
    }

    //3. 평균학점 연산(주고 받고)
    static String hakjum(double avg) {
        if (avg >= 95) { // A+
            return "A+";
        } else if (avg >= 90) { // A
            return "A";
        } else if (avg >= 85) { //B+
            return "B+";
        } else if (avg >= 80) { //B
            return "B";
        } else if (avg >= 75) { //C+
            return "C+";
        } else if (avg >= 70) { //C
            return "C";
        } else if (avg >= 60) { //D
            return "D";
        } else { //F
            return "F";
        }
        /*
        String h = "";
        if(avg>=95){ // A+
            h = "A+";
        }
        else if (avg >= 90) { // A
            h = "A";
        }
        else if(avg >=85){ //B+
            h = "B+";
        }
        else if(avg >=80){ //B
            h = "B";
        }
        else if(avg >=75){ //C+
            h = "C+";
        }
        else if(avg >=70){ //C
            h = "C";
        }
        else if(avg >=60){ //D
            h = "D";
        }
        else{ //F
            h = "F";
        }
        return h;
        */
    }

    //4. 잘못된 입력값 확인(안주고 받고)
    static void wrongCheck(int[] arr) {
        if (arr[0] >= 0 && arr[0] <= 100 &&
                arr[1] >= 0 && arr[1] <= 100 && arr[2] >= 0 && arr[2] <= 100) {
            double avg = avg(arr);
            String hakjum = hakjum(avg);
            avgPrint(avg, hakjum);
        } else {
            wrongPrint();
        }
    }

    //5. 잘못된 입력(안주고 안받고)
    static void wrongPrint() {
        System.out.println("점수가 잘 못 입력 됐습니다.");
    }

    //6. 평균학점 출력(안주고 받고)
    static void avgPrint(double avg, String hakjum) {
        System.out.printf("평균 %.1f이고 학점은 %s입니다.", avg, hakjum);
    }


    public static void main(String[] args) {
        //1. 입력
        wrongCheck(input());
    }
}
