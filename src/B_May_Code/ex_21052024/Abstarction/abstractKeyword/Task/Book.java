package B_May_Code.ex_21052024.Abstarction.abstractKeyword.Task;

abstract class Book {
    String name;
    String author;
    int price;
     Book(String name,String author,int price){
         this.name=name;
         this.author=author;
         this.price=price;
         getDetails();
     }
     abstract void getDetails();
}
