package Practice.Aug;
import java.util.*;
public class functionAverage {
    static float calculateAverage(float a,float b,float c){
        float average= (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        float a=sc.nextFloat();
        System.out.println("Enter value of b");
        float b=sc.nextFloat();
        System.out.println("Enter value of c");
        float c=sc.nextFloat();
        System.out.println("Your average is: "+calculateAverage(a,b,c));


    }
}
