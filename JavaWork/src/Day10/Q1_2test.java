package Day10;

class Animals2 {
    String name;
    String feed;

//    Animals2(String n, String f) {
//        name = n;
//        feed = f;
//    }

    public void getA() {
        Animals2[] info = new Animals2[2];
        for (int i = 0; i < info.length; i++) {
            info[i] = new Animals2();
        }
    }

    public void setA(String name, String feed) {
        this.name = name;
        this.feed = feed;

        System.out.println(name + "은(는) " + feed + " 먹이를 들고 있습니다.");
    }

}

public class Q1_2test {
    public static void main(String[] args) {
        Animals2 monkey = new Animals2();
        Animals2 dog = new Animals2();
        Animals2 chicken = new Animals2();
        Animals2 pig = new Animals2();

        monkey.setA("원숭이", "바나나");
        dog.setA("개", "뼈다귀");
        chicken.setA("닭", "모이");
        pig.setA("돼지", "여물");

        monkey.getA();
        dog.getA();
        chicken.getA();
        pig.getA();

        System.out.println("============ 먹이 변경 후 ============");

        monkey.setA("원숭이", "여물");
        dog.setA("개", "바나나");
        chicken.setA("닭", "뼈다귀");
        pig.setA("돼지", "모이");

        monkey.getA();
        dog.getA();
        chicken.getA();
        pig.getA();


    }
}
