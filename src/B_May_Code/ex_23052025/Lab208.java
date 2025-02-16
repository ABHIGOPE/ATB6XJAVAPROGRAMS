package B_May_Code.ex_23052025;

public class Lab208 {
    public static void main(String[] args) {
        A1 aRef = new A1() {
            @Override
            void m1() {
                System.out.println("overriden function");
            }
        };
        aRef.m1();
        A2 I1 = new A2(){
            @Override
            public void m2 () {
                System.out.println("Interface Method");
            }
        } ;
        I1.m2();

    }
}
abstract class A1{
    abstract void m1();
}

interface  A2{
     void m2();

}