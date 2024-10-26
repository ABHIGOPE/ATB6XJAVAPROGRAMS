package B_May_Code.ex_18052024;

public class Lab181 {
    public static void main(String[] args) {
        car c =new car();
        c.display();
        int Speed=c.maxSpeed;
        System.out.println(Speed);

    }
}

class car extends vehicle{
    int maxSpeed=45;
    void display(){
        System.out.println("Max speed of vehicle can be " +super.maxSpeed);
        System.out.println("Max speed of car can be " +this.maxSpeed);
    }
}

class vehicle{
    int maxSpeed=50;

    void message(){
        System.out.println("Yoyo Honey Singh");
    }
}