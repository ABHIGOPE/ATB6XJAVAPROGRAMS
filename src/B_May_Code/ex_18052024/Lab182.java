package B_May_Code.ex_18052024;

public class Lab182 {
    public static void main(String[] args) {
        Student p = new Student();
        p.display();

    }
    }

    class Person{
        void message(){
            System.out.println("This is Person's message");
        }
        void display(){
            this.message();
        }
    }
    class Student extends Person{
        void message(){
            System.out.println("This is Student message");
        }
        void display(){
            this.message();
//            super.message();
    }

}
