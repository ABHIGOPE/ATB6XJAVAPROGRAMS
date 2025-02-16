package B_May_Code.ex_30052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab239 {
    public static void main(String[] args) {
        List myCourses=new ArrayList();

        myCourses.add("MTB");
        myCourses.add("ATB");
        myCourses.add("pyATB");
        myCourses.add("API");
        myCourses.add("Self");

        System.out.println(myCourses);

        Iterator itr=myCourses.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for (Object obj:myCourses){
            System.out.println(obj);
        }

        for (int i=0;i<myCourses.size();i++){
            System.out.println(myCourses.get(i));
        }


    }
}
