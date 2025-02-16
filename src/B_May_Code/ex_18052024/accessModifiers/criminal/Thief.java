package B_May_Code.ex_18052024.accessModifiers.criminal;

import B_May_Code.ex_18052024.accessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop cop=new Cop(10);
        System.out.println(cop.gun);
       // cop.canIShoot();

    }
}