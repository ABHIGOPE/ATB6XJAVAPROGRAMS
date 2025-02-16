package Practice.Selfstudy.Abstraction.P4;

public class P4 {
    public static void main (String[] args) {
        FoodItem pizza = new Pizza ("Pizza",200);
        pizza.prepare();
        System.out.println();
        FoodItem burger= new Burger ("Burger",250);
        burger.prepare();

    }

}
abstract class FoodItem {
    String name;
    double price;
    public FoodItem (String name, double price) {
        this.name = name;
        this.price = price;
        displayInfo();

    }
    void displayInfo(){
        System.out.println ("Food Item is: "+name+" price is:"+price);
    }
    abstract void prepare();



}

class Burger extends FoodItem{
    Burger(String name, double price){
        super(name,price);
    }
    @Override
    void prepare() {
        System.out.println ("Preparing burger with sauces");
    }
}

class Pizza extends FoodItem {
    Pizza (String name, double price){
        super(name,price);
    }
    @Override
    void prepare() {
        System.out.println ("Preparing Pizza with Toppings");
    }
}
