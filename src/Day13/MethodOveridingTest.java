package Day13;

class Customer {
    private int customerID; // 고객 아이디
    private String customerName; //고객 이름
    protected String customerGrade; // 고객 등급
    int bonusPoint; //보너스 포인트
    double bonusRatio; // 적립 비율

    Customer() {
        customerGrade = "SILVER"; //기본 등급
        bonusRatio = 0.01;
    }

    int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade +
                "이며, 보너스 포인트는 " + bonusPoint + " 입니다.";
    }
}

class VIPCo extends Customer {
    double saleRatio; // 할인율

    VIPCo() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    void abc() {

    }
}

public class MethodOveridingTest {
    public static void main(String[] args) {
        Customer c1 = new VIPCo();
        Customer c2 = new Customer();

        c1.calcPrice(5000);
        c2.calcPrice(5000);

        System.out.println(c1.showCustomerInfo());
        System.out.println(c2.showCustomerInfo());
    }


}
