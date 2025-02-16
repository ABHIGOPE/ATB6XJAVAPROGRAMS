package B_May_Code.ex_23052025;

public class Lab201 {
    public static void main(String[] args) {
//        ATB amit=new ATB("919471366865");
//        ATB Pramod=new ATB("12345678");
//        System.out.println(ATB.courseName);

        ATB ashok= new ATB("12345678");
        ATB ashok1= new ATB("12345678");

    }
}
class ATB{
    static String courseName="Batch";
    String phoneNumber;
    static{
        System.out.println("static IIB-loAD ONE TIME WHEN CLASS IS LOADED");
    }
    {
        System.out.println("Instance Initialization Block");
    }

    public ATB(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void printDetails(){
        System.out.println("your details" + this.phoneNumber);
    }
}