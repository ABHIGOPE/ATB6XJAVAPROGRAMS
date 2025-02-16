package B_May_Code.ex_16052024.singleInheritance;

public class Programming {
    int version;
    String author;

    public Programming() {
        System.out.println("Programming DC");
    }
    public Programming(int version, String author) {
        this.version = version;
        this.author = author;
    }

    void printInf(){
        System.out.println("Version->"+this.version+"Author->"+this.author);
    }


}
