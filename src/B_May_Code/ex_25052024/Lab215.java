package B_May_Code.ex_25052024;

public class Lab215 {
    public static void main(String[] args) {
        Day d=Day.FRIDAY;
        System.out.println(d);
    }


}

enum Day{
    SUNDAY, MOMDAY , TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRALARGE("X");
    private String size;
    Size (String s){
        this.size=s;
    }
}
