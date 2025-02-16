package B_May_Code.ex_18052024.accessModifiers.police;

public class jrCop {
    public static void main(String[] args) {
        Cop c1=new Cop(10);
        System.out.println(c1.gun);
        c1.canIShoot();
    }
}
