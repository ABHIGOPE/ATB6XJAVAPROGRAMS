package B_May_Code.ex_18052024.Encapsulation;

public class Lab192 {
    public static void main(String[] args){
        vwoLogin1 v1=new vwoLogin1("admin","admin123");
        //v1.password="admin123"; not possible
        //String password=v1.getPassword(false);

        v1.setPassword("Zoro123",true);
        //System.out.println(v1.getPassword());



    }

}

class vwoLogin1{
    private String username;
    private String password;
    public vwoLogin1(String username, String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAuth) {
        if (isAuth) {
            return password;
        }
        else{
            return "not allowed";
        }
    }
    public void setPassword(String password, boolean isAuth) {
        if (isAuth) {
             this.password=password;
        }
        else{
            System.out.println("Not Allowed");
        }

    }
}

