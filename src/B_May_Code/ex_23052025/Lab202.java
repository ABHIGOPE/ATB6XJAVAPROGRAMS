package B_May_Code.ex_23052025;

public class Lab202 {
    public static void main(String[] args) {
        Person p1=new Person("Amit");
        p1.m2();
        p1.m1();

        Person.footbalClub="Barca";
        System.out.println(p1.footbalClub);
        Person p2=new Person("Pramod");
        p2.m2();
        System.out.println(Person.footbalClub);
        p2.m1();
//        Person.m2();


    }
}

class Person{

    {
        System.out.println("IIB");
    }
//    static String;
    String name;
    static String footbalClub="Arsenal";

    public Person(String name) {
        this.name = name;
    }

    static{
        System.out.println("when class in loaded only 1 time");
    }

    static void m1(){
        System.out.println("This is static function");
    }
    void m2(){
        System.out.println("Your name is->"+ this.name);
    }
}