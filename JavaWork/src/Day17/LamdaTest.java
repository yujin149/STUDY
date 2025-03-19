package Day17;

interface Mynumber {
    int getMax(int num1, int num2); //오버라이딩이 되서 정의가 되었으므로 사용이 가능
}


public class LamdaTest {
    public static void main(String[] args) {
        Mynumber max = (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMax(10, 20));
        /*
        JavaScript에서 많이 사용하는 패턴
        Java는 최소 interface를 통해 메소드 선언이 되어 있어야 합니다.
        int max = (a)->{
            return a;
        }
         */
    }
}
