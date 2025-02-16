package B_May_Code.ex_25052024;

import org.w3c.dom.ls.LSOutput;

public class Lab211 {
    public static void main(String[] args) {
        int x = 10;
        //String s1=(String)x;//not possible
        String s1 = String.valueOf(x);
        System.out.println(s1);


        Character ch = 'A';
        char a3 = ch;//unbpxing it happens automatically  wrapper assigned to primitive
        Boolean b = true;
        Long l = 140l;
        Float f1 = 5.6f;
        Double d = 95.67;

        Integer intObject = Integer.valueOf(5);
        System.out.println(intObject);

        Integer a2=89;//Autoboxing primitive assigned to wrapper
        System.out.println(a2.MAX_VALUE);
        System.out.println(a2.MIN_VALUE);
        System.out.println(Integer.max(23,45));

    }
}