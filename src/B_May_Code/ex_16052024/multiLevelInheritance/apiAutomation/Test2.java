package B_May_Code.ex_16052024.multiLevelInheritance.apiAutomation;

public class Test2 extends BaseTest{
    void acc(){
        openExcel();
        openSQL();
        System.out.println(API_VERSION);
        System.out.println(Version);
    }
    void openJSON(){
        System.out.println("JSONTest2 is opened");
    }
}
