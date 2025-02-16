package B_May_Code.ex_30052024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student3_runner {
    public static void main(String[] args) {

        Student3 student1=new Student3(23,"Avinash");
        Student3 student2=new Student3(45,"Ashley");
        Student3 student3=new Student3(27,"Tyren");

        List practiceStudents= new ArrayList<>();
        practiceStudents.add(student1);
        practiceStudents.add(student2);
        practiceStudents.add(student3);


        System.out.println(practiceStudents);

        System.out.println("Sort by age Ascending");

        Collections.sort(practiceStudents, new SortByAgeAsc());

        System.out.println(practiceStudents);
        System.out.println();

        System.out.println("Sort by age descending");

        Collections.sort(practiceStudents, new SortByAgeDsc());

        System.out.println(practiceStudents);

    }
}
