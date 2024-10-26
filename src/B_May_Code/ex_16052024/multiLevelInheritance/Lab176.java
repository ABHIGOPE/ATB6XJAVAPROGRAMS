package B_May_Code.ex_16052024.multiLevelInheritance;

public class Lab176 {
    public static void main(String[] args) {
//        GrandFather dadu=new GrandFather();
//        dadu.home();
//
//        Father papa=new Father();
//        papa.home();
//
//        Child boy=new Child();
//        boy.home();

//        Dynamic dispatch

        GrandFather dadu1=new GrandFather();
        dadu1.home();

        GrandFather dadu2=new Child();
        dadu2.home();

        GrandFather dadu3=new Father();
        dadu3.home();
    }
}
