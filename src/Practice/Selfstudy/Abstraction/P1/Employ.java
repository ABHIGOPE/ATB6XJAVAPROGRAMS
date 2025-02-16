package Practice.Selfstudy.Abstraction.P1;

abstract public class Employ {
    String employName ;
    int empID;
    double salary;

    public Employ(String employName, int empID, double salary) {
        this.employName = employName;
        this.empID = empID;
        this.salary = salary;
    }

    void displayEmployDetails(){

        System.out.println("Employ Name: "+employName);
        System.out.println("Employ Id: "+empID);
        System.out.println("Salary: "+salary);

    }

    abstract void CalculateBonus();
}


