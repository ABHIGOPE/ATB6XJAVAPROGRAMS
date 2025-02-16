package B_May_Code.ex_28052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab234 {
    public static void main(String[] args) {
        List<String> testList1 = new ArrayList();
        testList1.add("Pramod");
        testList1.add("Abhi");
        testList1.add("Prabhas");


        System.out.println("Ptrint 1-----------");

        for (int i=0; i<testList1.size(); i++){
            System.out.println(testList1.get(i));
        }
        System.out.println("Ptrint 2------------");
        for (String ob:testList1){
            System.out.println(ob);
        }

        System.out.println("Print 3--------------");

        Iterator<String> itr =testList1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        }
    }

