package Day17;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    static class InStaticClass {
        int inNum = 10;
        static int sInNum = 200;

        void inTest() { // 객체가 있어죠
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum); //static 이라서 됨
        }

        static void sTest() {
            System.out.println(sInNum);
            System.out.println(sNum);
            //System.out.println(num);
        }
    }

    class InClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println("OutClass num = " + num);
            System.out.println("Outclass sNum = " + sNum);
        }

        static void sTest() {
        }
    }

    public void usingClass() {
        inClass.inTest();
    }

}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        OutClass.InStaticClass a;
        //System.out.println(a.inNum);
        System.out.println(sInClass.inNum);
        sInClass.inTest(); //정적 class -> 인스턴스 메소드 객체생성 후 사용
        OutClass.InStaticClass.sTest(); //정적 class -> 정적 메소드 객체 여부 상관 없다
    }
}
