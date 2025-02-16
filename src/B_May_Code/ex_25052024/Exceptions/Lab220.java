package B_May_Code.ex_25052024.Exceptions;

import java.io.FileInputStream;

public class Lab220 {
    //Exceptions:


    public static void main(String[] args) {

        //Checked-->JVM knows
        // Compile Time -/JVM? If Knows about it, - Checked Exception
        try{
            FileInputStream ref=new FileInputStream("c");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        // File io - open
        //Unchecked-->JVM don't knows
//        int a=10;
//        int c=10/0;
//        System.out.println(a);
//        System.out.println(c);
    }
}
