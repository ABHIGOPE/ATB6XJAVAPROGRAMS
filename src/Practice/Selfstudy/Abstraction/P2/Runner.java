package Practice.Selfstudy.Abstraction.P2;

public class Runner {
    public static void main(String[] args) {
        Payment u1=new UPIPayment(2000);
        u1.makePayment();
        System.out.println();


        Payment c1=new CreditCardPayment(7000);
        c1.makePayment();
    }
}
