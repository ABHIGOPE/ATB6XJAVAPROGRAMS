package Practice.Sep;
import java.util.*;
public class ageElligibilitycheck {
    static String eligibiltyCheck(int a){
        if (a>=18){
           return "You are allowed to vote";
        }
        else {
           int yearToWait=18-a;
           return "Come after " +yearToWait+" years ";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int a=sc.nextInt();
        String result=eligibiltyCheck(a);
        System.out.println(result);
    }
}
