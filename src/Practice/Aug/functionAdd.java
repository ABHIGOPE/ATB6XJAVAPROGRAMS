package Practice.Aug;

import java.util.Scanner;

public class functionAdd {
    public static int calculateSum(int a, int b){
        int sum=a+b;
        System.out.println("Sum of 2 numbers is : "+sum);
        return sum;

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a,b);
       // String name=sc.next();
        //printMyName(name);
    }
}

