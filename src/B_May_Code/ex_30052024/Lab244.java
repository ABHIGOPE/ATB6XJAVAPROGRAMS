package B_May_Code.ex_30052024;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Lab244 {
    public static void main(String[] args){
//        List myMarks=new ArrayList();
//        myMarks.add(78);
//        myMarks.add(76);
//        myMarks.add(71);
//        myMarks.add(79);
//        myMarks.add(82);
//     Collections.sort(myMarks); // Natural Order Will work
//        Collections.sort(myMarks);
//

        Student student1=new Student(23,"Abhsihek");
        Student student2=new Student(45,"Rohit");
        Student student3=new Student(49,"Rakel");


        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Collections.sort(students,new SortByIDAsc());

        System.out.println(students);

    }
}
