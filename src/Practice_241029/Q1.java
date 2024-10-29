package Practice_241029;

class Animals {
    String type;
    String food;

    Animals(String type, String food) {
        this.type = type;
        this.food = food;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    void print() {
        System.out.println(type + "은(는) " + food + "를 들고 있습니다.");
    }
}


public class Q1 {
    public static void main(String[] args) {

        String[] type = {"원숭이", "개", "닭", "돼지"};
        String[] food = {"바나나", "뼈다귀", "모이", "여물"};

        Animals[] animals = new Animals[4];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Animals(type[i], food[i]);
            animals[i].print();
        }

        System.out.println("============ 먹이 교환 후 ============");

        for (int i = animals.length - 1; i > 0; i--) {
            animals[i].food = animals[i - 1].food;
        }

        String temp = food[3];
        animals[0].food = temp;
        for (int i = 0; i < animals.length; i++) {
            animals[i].print();
        }
    }
}
