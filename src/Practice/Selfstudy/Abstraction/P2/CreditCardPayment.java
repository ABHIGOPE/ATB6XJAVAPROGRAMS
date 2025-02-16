package Practice.Selfstudy.Abstraction.P2;

public class CreditCardPayment extends Payment {
    CreditCardPayment(double amount){
        super(amount);
    }
    @Override
    void makePayment() {
        System.out.println("Credit card payment of "+amount+" is completed");
        printReceipt();
    }
}
