package Day01;

public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9F; //float는 F를 넣어야한다.

        int iNum3 = (int)dNum1 + (int)fNum2; //1
        int iNum4 = (int)(dNum1 + fNum2); //2

        System.out.println(iNum3);
        System.out.println(iNum4);

    }
}
