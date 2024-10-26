package B_May_Code.ex_18052024;

public class Lab183 {
    public static void main(String[] args) {
        Student1 SC1=new Student1();
        //Person1 pc1 = new Person1();
        // If child has DC -> PC DC will be called by
        // super() automatically in Java


        // super.variable
        // super.method()
        // super() -> DC
        // super("parameter") -> PC




}}


class Person1{
    Person1(){
        System.out.println("Person1-DC");
    }
    Person1(String a){
        System.out.println("Person1-1PC");
    }
    Person1(String a, int b){
        System.out.println("Person1-2PC");
}}

class Student1 extends Person1 {
    Student1(String s) {
        System.out.println("PC-Student1");
    }

    Student1() {
        this("Abhi");
        System.out.println("Student1-DC");
    }
}

