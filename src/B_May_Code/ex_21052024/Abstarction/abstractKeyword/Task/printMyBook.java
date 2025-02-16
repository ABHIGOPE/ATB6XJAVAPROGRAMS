package B_May_Code.ex_21052024.Abstarction.abstractKeyword.Task;



public class printMyBook extends Book {
    @Override
    void getDetails() {
        System.out.println(name+","+author+","+price);

    }
    printMyBook(String name,String author,int price){
        super(name,author,price);
    }




}
