package Day16;

class Box<T> { //<T> 제네릭 , 주로 T나 F를 쓴다.
    T vol;

    void setVolume(T v) {
        vol = v;
    }

    T getVolume() {
        return vol;
    }

}

public class GenericTest {
    public static void main(String[] args) {
        Box<Integer> ibox = new Box<>(); //T가 integer로 바뀐다.
        ibox.setVolume(200);
        System.out.println("<Integer> 박스의 부피는 : " + ibox.getVolume());

        Box<String> sbox = new Box<>();
        sbox.setVolume("hello");
        System.out.println(sbox.getVolume());

        Box<Double> dbox = new Box<>();
        dbox.setVolume(50.7);
        System.out.println("<Double> 박스의 부피는 : " + dbox.getVolume());
    }
}
