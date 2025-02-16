package B_May_Code.ex_25052024.Exceptions;

public class Lab222 {
    public static void main(String[] args) {
        try{
            String s1="Pramod";
            String a1=args[0];
            s1.trim();
            System.out.println(s1);
    }catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("End of program");
}}
