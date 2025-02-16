package Practice.Selfstudy.Abstraction.P1;

public class Manager extends Employ {

    Manager(String employName, int empID, double salary){
        super(employName, empID, salary);
    }

    @Override
    void CalculateBonus() {
        System.out.println("Bonus for Manager is: "+ 0.1*salary);
    }
}


