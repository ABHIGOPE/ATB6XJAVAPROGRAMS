package B_May_Code.ex_28052024;
import java.util.List;
import java.util.ArrayList;

public class Lab232 {
    public static void main(String[] args) {
        // List mylist1 = new List();
        // List is an interface , can you create object of List interface?
        // List mylist2 = new ArrayList();
        // List is an interface , can you create object of ArrayList class?
        List myList=new ArrayList();
        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll

        myList.add("Pramod");
        myList.add("Pratik");
        myList.add("Rajesh");
        myList.add("Roshan");
        myList.add("Pramod");
        System.out.println(myList);
        System.out.println(myList.get(3));
        System.out.println(myList.size());

        myList.remove("Pramod");
        System.out.println(myList);

        myList.clear();
        System.out.println(myList);
        System.out.println(myList.isEmpty());

        myList.add("Pramod");
        myList.add("Pratik");
        myList.add("Rajesh");
        myList.add("Roshan");
        myList.add("Pramod");
        System.out.println(myList);

        myList.add("Dutta");
        System.out.println(myList);

        myList.set(1,"Abhishek Gope");
        System.out.println(myList);

        myList.add(123);
        myList.add(true);
        System.out.println(myList);
        System.out.println(myList.size());

        System.out.println("-------------------------------");

        for (int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
        System.out.println("--------------------");

        for (Object obj:myList){
            System.out.println(obj);
        }
    }
}
