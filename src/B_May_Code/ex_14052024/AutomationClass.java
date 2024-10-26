package B_May_Code.ex_14052024;

public class AutomationClass {
    String name;

    AutomationClass(){
        databaseConnection();
        excelOpen();
        String name;
    }

    public AutomationClass(String name) {
        this.name = name;
    }

    void databaseConnection(){
        System.out.println("Your database is created");
    }

    void excelOpen(){
        System.out.println("Your excel is created");
    }

    void testCase1(){
        System.out.println("TCS1");
    }
    void testCase2() {
        System.out.println("TCS2");
    }

    public static void main(String[] args) {
        AutomationClass TC1= new AutomationClass("TC1");
        AutomationClass TC2= new AutomationClass("TC2");
        TC1.testCase1();
        TC2.testCase2();

    }

}
