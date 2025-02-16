package B_May_Code.ex_25052024;

public class Lab216 {
    public static void main(String[] args) {
        APIEndpoints e=APIEndpoints.DASHBOARD;
        switch(e){
            case LOGIN -> System.out.println("Login Page code should be executed");
            case HOME -> System.out.println("Home Page should be executed");
            case DASHBOARD -> System.out.println("Dashboard page should be executed");
        }
    }
}
