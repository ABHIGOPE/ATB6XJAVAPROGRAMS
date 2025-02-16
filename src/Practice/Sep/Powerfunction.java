package Practice.Sep;
import java.util.*;
public class Powerfunction {
    static double powerNumber(int x ,int n){
        double result=1;
        for(int i=1;i<=n;i++){
            result=result*x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value on n");
        int n=sc.nextInt();
        System.out.println("Enter value on x");
        int x=sc.nextInt();
        double power=powerNumber(x,n);
        System.out.println(+x+" to the power "+n+" is "+power);

    }

}
