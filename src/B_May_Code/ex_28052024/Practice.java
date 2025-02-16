package B_May_Code.ex_28052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Practice {
    public static void main(String[] args){
        List myPracticeList=new ArrayList();
        myPracticeList.add("Raja");
        myPracticeList.add("mohit");
        myPracticeList.add("Salem");
        myPracticeList.add("Ashish");
        myPracticeList.add("Bibhuti");

        System.out.println(myPracticeList.size());
        System.out.println(myPracticeList.get(4));

        myPracticeList.remove("Raja");

        System.out.println(myPracticeList.size());
        System.out.println(myPracticeList.get(3));

        System.out.println(myPracticeList);

        System.out.println("Print--------1");

        for (int i=0; i<myPracticeList.size(); i++){
            System.out.println(myPracticeList.get(i));
        }


        System.out.println("Print--------2");
        for(Object obj:myPracticeList){
            System.out.println(obj);
        }

        System.out.println("PRint--------3");
        Iterator itr=myPracticeList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        System.out.println(lastIndexOf(myPracticeList));

    }
}
