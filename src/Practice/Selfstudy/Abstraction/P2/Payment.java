package Practice.Selfstudy.Abstraction.P2;

abstract public class Payment {
    double amount;


    public Payment(double amount) {
       this.amount=amount;
    }
    abstract void makePayment();
    void printReceipt(){
        System.out.println("your payment is successful");
    }


}
