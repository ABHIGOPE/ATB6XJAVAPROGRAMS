package Aug;
import java.util.*;
public class P_001 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int num=sc.nextInt();
        switch(num){
            case 1:System.out.println(a+b);
                 break;
            case 2:System.out.println(a-b);
                 break;
            case 3:System.out.println(a*b);
                 break;
            case 4:System.out.println(a/b);
                break;
            case 5:System.out.println(a%b);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }


    }
}
