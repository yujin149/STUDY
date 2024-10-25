package Day09;

class BD {
    int year;

    void setYear(int year) {
        this.year = year;
    }

    void printThis() {
        System.out.println(this);
    }
}

public class ThisTest2 {
    public static void main(String[] args) {
        BD bDay = new BD();
        bDay.setYear(2000);
        System.out.println(bDay.year);
        System.out.println(bDay); // Day09.BD@b4c966a 메모리 주소
        bDay.printThis();
    }
}
