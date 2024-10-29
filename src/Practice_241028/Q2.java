package Practice_241028;

/*
 **원숭이 - 바나나 / 개 - 뼈다귀 / 닭 - 모이 / 돼지 - 여물**
 */
class Animals {
    String type;
    String food;

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

    Animals(String type, String food) {
        this.type = type;
        this.food = food;
    }


}


public class Q2 {
    public static void main(String[] args) {
        String[] animal = {"원숭이", "개", "닭", "돼지"};
        String[] feed = {"바나나", "뼈다귀", "모이", "여물"};

        Animals[] animals = new Animals[4];
    }
}
