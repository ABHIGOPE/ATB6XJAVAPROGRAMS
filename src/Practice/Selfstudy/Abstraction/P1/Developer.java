package Practice.Selfstudy.Abstraction.P1;

public class Developer extends Employ {

    Developer(String employName, int empID, double salary){
        super(employName, empID, salary);
    }
    @Override
    void CalculateBonus() {
        System.out.println("Bonus for develper is: "+0.05*salary);
    }
}
