package B_May_Code.ex_23052025;

public class Lab206 {
    public static void main(String[] args) {
        Car c=new Car("Lambo");
        c.drive();

        Car.Engine engine=c.new Engine("400 cc");
        engine.startEngine();
        c.drive();


    }
}

class Car {
    String make;

    public Car(String make) {
        this.make = make;
    }

    void drive() {
        System.out.println("You can drive");
    }


    class Engine {
        String horsePower;
        public Engine(String horsePower) {
            this.horsePower = horsePower;
        }
        void startEngine(){
            System.out.println("Start the engine "+ make);

}

    }
}