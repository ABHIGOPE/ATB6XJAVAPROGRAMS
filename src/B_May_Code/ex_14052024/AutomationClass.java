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
        System.out.println("TCS->1");
    }
    void testCase2() {
        System.out.println("TCS->2");
    }

    public static void main(String[] args) {
        AutomationClass TC1= new AutomationClass("Test Case 1");
        System.out.println(TC1.name);
        TC1.databaseConnection();
        TC1.testCase1();
        TC1.testCase2();

        AutomationClass TC2= new AutomationClass("Test Case 2");
        System.out.println(TC2.name);
        TC2.excelOpen();
        TC2.testCase1();
        TC2.testCase2();

    }

}
