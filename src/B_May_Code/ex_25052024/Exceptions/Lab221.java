package B_May_Code.ex_25052024.Exceptions;

public class Lab221 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int i = Integer.parseInt(args[0]);
            int b = 10 / i;
            System.out.println(i);
            System.out.println(b);
        } catch (ArithmeticException| NumberFormatException|ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Problem with the code");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}