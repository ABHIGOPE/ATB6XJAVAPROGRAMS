package B_May_Code.ex_30052024;

import java.util.Enumeration;
import java.util.Vector;

public class Lab240 {

    public static void main(String[] args) {
        Vector<String> v2=new Vector();
        v2.add("Science");
        v2.add("Maths");
        v2.add("Hindi");
        v2.add("Sanskrit");
        v2.add("SST");

        System.out.println(v2);
        Enumeration e=v2.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
