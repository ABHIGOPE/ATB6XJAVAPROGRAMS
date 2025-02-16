package B_May_Code.ex_18052024.Encapsulation;

public class ICICIBankAccount {
    private String name;
    private long bal;
    public ICICIBankAccount(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }


}
