package Day09;

class Kor {
    int a;

    Kor(int a) {
        this.a = a;
    }
}

public class ThisTest1 {
    public static void main(String[] args) {
        Kor k = new Kor(5);
        System.out.println(k.a);
    }
}
