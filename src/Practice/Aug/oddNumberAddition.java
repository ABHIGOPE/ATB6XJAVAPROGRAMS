package Practice.Aug;

import java.util.*;

public class oddNumberAddition {
    static int oddNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Your sum is : "+ oddNumber(n));
        
    }
        
    }

