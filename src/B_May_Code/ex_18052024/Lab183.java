package B_May_Code.ex_18052024;

import B_May_Code.ex_16052024.singleInheritance.abhishekHome.Abhishek;

public class Lab183 {
    public static void main(String[] args) {
        Student1 s1=new Student1();

        }
    }
    class Person1{
        Person1(){
            System.out.println("This is Person1-->DC");
        }
        Person1(String name ){
            System.out.println("This is Person1 1st PC");
        }
        Person1(String name ,int age){
            System.out.println("This is Person1 2nd PC");
        }

    }
    class Student1 extends Person1{
        Student1(){
            //super("Abhishek");
            super("name",12);
            System.out.println("This is Student1-->DC");
        }
    }

