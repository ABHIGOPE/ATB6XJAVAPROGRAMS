package Practice.Selfstudy.Abstraction.P2;

public class UPIPayment extends Payment {
    public UPIPayment(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("UPI payment of "+amount+" is completed");
        printReceipt();
    }
}
