package B_May_Code.ex_30052024;
import java.util.List;
import java.util.ArrayList;
public class Lab238 {
    // List - ArrayList, LinkedList, Vector,Stack
    // Set - HashSet, LinkedHashSet, TreeSet
    // Map - HashMap, LinkedHashMap, TreeMap
    // Queue - PriorityQueue, LinkedList
    // Hashtable, Properties
    public static void main(String[] args) {
        List<String> myCourseList= new ArrayList();
        myCourseList.add("ATB");
        myCourseList.add("MTB");
        myCourseList.add("pyATB");
        myCourseList.add("API");
        myCourseList.add("Self");

        List marks=new ArrayList();
       marks.add(123);
       marks.add(234);
       marks.add(69);
       marks.add(52);

       myCourseList.addAll(marks);
        System.out.println(myCourseList);


    }
}
