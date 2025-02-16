package B_May_Code.ex_23052025;

public class Lab207 {
    public static void main(String[] args) {
//        OOC oc=new OOC();
        OOC.SNIC inner=new OOC.SNIC();
        inner.show();

    }
}

class OOC{
    static int a=10;
    int oa=4;

    static class SNIC{
        void show(){
            System.out.println(a);
//            System.out.println(oa); not static variable we cannot access it inside static class
        }

    }

}
