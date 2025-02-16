package B_May_Code.ex_18052024;

public class Lab181 {

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        }
}

class Car extends Vehicle {
    int maxSpeed = 180;

    void display() {
        System.out.println("This is the max spreed" + super.maxSpeed);
        System.out.println("This is the max spreed" + this.maxSpeed);

    }

}

    class Vehicle {
        int maxSpeed = 100;

        void message() {
            System.out.println("This is a vehicle class");
        }
    }





