package Day18;

class Account {
    synchronized void donation(int m, int customerIndex) {
        System.out.println(customerIndex + "번째 성금자 : " + m + "원");
    }
}

class Customer extends Thread {
    int m;
    Account a;
    int customerIndex;

    Customer(Account a, int customerIndex) {
        this.a = a;
        this.customerIndex = customerIndex;
    }

    @Override
    public void run() {
        int count = 1;
        while (m < 50000) {

            System.out.print((count++) + "번째  성금,");
            a.donation(m, customerIndex);
            m += 1000;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q1 {
    public static void main(String[] args) throws InterruptedException {
        Account a = new Account();
        Customer[] customers = new Customer[5];

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "번째 성금자 시작");
            customers[i] = new Customer(a, i + 1);
            customers[i].start();
            customers[i].join();
        }


    }
}
