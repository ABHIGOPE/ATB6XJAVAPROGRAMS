package Practice.Sep;
import java.util.*;
public class AreaofCircle {
    static double calculateCirleArea(double r){
        double area=3.14*4*r;
        return area;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of radius");
        double r=sc.nextDouble();
        double result=calculateCirleArea(r);
        System.out.println("Area of circle is: "+ result);
    }

}
