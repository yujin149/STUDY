package Day10;

class Animals {
    String name;
    String feed;

    Animals(String n) {
        name = n;
    }

    public String setA() {
        return this.feed;
    }

    public void getA(String feed) {
        this.feed = feed;
    }

}

public class Q1_test {
    public static void main(String[] args) {
        Animals monkey = new Animals("원숭이");
        Animals dog = new Animals("개");
        Animals chicken = new Animals("닭");
        Animals pig = new Animals("돼지");


        monkey.getA("바나나");
        dog.getA("뼈다귀");
        chicken.getA("모이");
        pig.getA("여물");

        System.out.println(monkey.name + "은(는) " + monkey.setA() + " 먹이를 들고 있습니다.");
        System.out.println(dog.name + "은(는) " + dog.setA() + " 먹이를 들고 있습니다.");
        System.out.println(chicken.name + "은(는) " + chicken.setA() + " 먹이를 들고 있습니다.");
        System.out.println(pig.name + "은(는) " + pig.setA() + " 먹이를 들고 있습니다.");


        System.out.println("============ 먹이 변경 후 ============");

        monkey.getA("여물");
        dog.getA("바나나");
        chicken.getA("뼈다귀");
        pig.getA("모이");


        System.out.println(monkey.name + "은(는) " + monkey.setA() + " 먹이를 들고 있습니다.");
        System.out.println(dog.name + "은(는) " + dog.setA() + " 먹이를 들고 있습니다.");
        System.out.println(chicken.name + "은(는) " + chicken.setA() + " 먹이를 들고 있습니다.");
        System.out.println(pig.name + "은(는) " + pig.setA() + " 먹이를 들고 있습니다.");


    }
}
