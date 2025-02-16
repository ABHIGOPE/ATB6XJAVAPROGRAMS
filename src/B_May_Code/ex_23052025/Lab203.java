package B_May_Code.ex_23052025;

public class Lab203 {
    public static void main(String[] args) {

        A aRef=new A();
        A.m1();
//        System.out.println(A.age);
        A bRef=new A();
        A cRef=new A();
        System.out.println(aRef.common);
        System.out.println(bRef.common);
        System.out.println(cRef.common);
        System.out.println(A.common);
        aRef.m1();
        bRef.m1();
        cRef.m1();
        aRef.m2();
        bRef.m2();
        cRef.m2();
        A.m1();
//        A,m2();

//        A d=null;
//        d.m2();
//         not possible
}}
class A {
    int age = 10;
    static String common = "ABC";

    static {
        System.out.println("This is static");
    }

    {
        System.out.println("IIB");
    }

    static void m1() {
        System.out.println("m1 function");
    }


    void m2() {
        System.out.println("m2 function");
    }
}