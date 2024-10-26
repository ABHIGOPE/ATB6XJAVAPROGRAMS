package Practice.Aug;
import java.util.*;
public class functionFact {
        public static int printFactorial(int n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("Your factorial value is : "+fact);
            return fact;
        }
        public static void main(String args[]){
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            int fact=printFactorial(n);

        }
    }


