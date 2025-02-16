package B_May_Code.ex_25052024.Exceptions;

public class Lab211 {
    public static void main(String[] args){
       try {
           String sh = args[0];
           int x = Integer.parseInt(sh);// integer x=
           int a = 10 / x;
           System.out.println(a);
           System.out.println(x);
       } catch(Exception e){
           System.out.println(e.getMessage());
           System.out.println("Give proper Input");
       }

        // Test case for the program
        // -=> 5 - Happy
        // No Input - java.lang.ArrayIndexOutOfBoundsException
        // 0 - java.lang.ArithmeticException
        // -5
        // pramod - java.lang.NumberFormatException
        // 3.45 - java.lang.NumberFormatException
        // @@#$%^&^%$#% - java.lang.NumberFormatException


        //JVM will be Initialized
        //Creates and Starts the main Thread.
        //main Thread will do the following tasks
        //1)Collects the Command Line Arguments
        //2)Creates the String array with CLA
        //3)Calls main method by passing String array as Parameter:
        // Lab211.main(5)
        //Now Control will be transfered from main Thread to main method
        //Control will come back to main thread in two ways.
        //A)When problem comes in main -> JVM
        // Creates the Object of Identified Exception class.
        //Exception a=new Exception()
    }
}
