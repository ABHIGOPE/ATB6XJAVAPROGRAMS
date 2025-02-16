package B_May_Code.ex_16052024.multiLevelInheritance.apiAutomation;

public class Lab177 {
    public static void main(String[] args){
        Test t1=new Test();
        t1.openExcel();
        t1.openSQL();
        int a =t1.API_VERSION;

        CommomToAll q1=new Test2();
        q1.openExcel();
        q1.openJSON();
    }
}
