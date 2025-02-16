package Practice.Aug;
import java.util.*;
public class greaterNumber {
    static int greaterNumber(int a, int b){
        if (a>b) {
            return a;
        }
        else if(a==b){
            System.out.println ("Please give different numbers");
            return 0;

        }
        else{
                return b;
            }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        int result=greaterNumber(a, b);
        System.out.println("Your greater number is: "+ result);
    }
    }


