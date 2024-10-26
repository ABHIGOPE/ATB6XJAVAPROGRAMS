package B_May_Code.ex_18052024;

public class Lab182 {
    public static void main(String[] args) {
        Student S= new Student();
        //S.message();
        S.display();
    }

}
class Person{
    void message(){
        System.out.println("I am a person");
    }

    }


class Student extends Person{
    void message(){
        System.out.println("I am a student");
    }
    void display(){
        super.message();
        this.message();
}}