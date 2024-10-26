package Practice.Aug;
import java.util.*;
public class functionMultiply {
    public static int calculateProduct(int a  , int b) {
        //int mul=a*b;
        //System.out.println("Your product is : " + mul);
        //return mul;
        return a*b;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = calculateProduct(a, b);
        System.out.println("Your product is : " + mul);
    }
    }