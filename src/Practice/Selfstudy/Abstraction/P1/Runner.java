package Practice.Selfstudy.Abstraction.P1;

public class Runner {
    public static void main(String[] args) {


        Employ D1 = new Developer("Abhishek Gope",2314981,30000);
        Employ M1=new Manager("Mohit Kumar",2314781,50000);
        D1.displayEmployDetails();
        D1.CalculateBonus();

        M1.displayEmployDetails();
        M1.CalculateBonus();

    }
}