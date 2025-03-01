package B_May_Code.ex_28052024;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab235 {
    public static void main(String[] args) {
        List myList2= new ArrayList();// CR - CO
        ArrayList myList3=new ArrayList(); //FR -> CO
        Collection myList4=new ArrayList(); // GF -> CO
         Collection myList5=new ArrayList(); //GGF -> CO

        // ArrayList - Behind the scen it users, Dynamic Array
        // Size filled around 90, it double the size automatically

        // Size is Dynamic
        // Duplicate is allowed
        // Insertion Order is preserved
        // Heterogeneous Objects are allowed
        // Null insertion is possible

        myList2.add("Abhi");
        myList2.add("Sahil");
        myList2.add("Haneet");
        System.out.println(myList2);

        System.out.println(myList2.size());

        System.out.println(myList2.lastIndexOf(myList2));
    }
}
