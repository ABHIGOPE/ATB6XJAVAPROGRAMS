package Practice.Selfstudy.Abstraction.P3;

public class SelfPratice {
    public static void main(String[] args) {
        LibraryItems book=new Book("Ye hai meri Kahani","Abhishek Gope");
        book.displayDetails();
        book.borrowItem();
        System.out.println();

        LibraryItems dvd=new DVD("Ye hai meri Kahani",60);
        dvd.displayDetails();
        dvd.borrowItem();

    }
}
    abstract class LibraryItems{

    abstract void  displayDetails();
    void borrowItem(){
        System.out.println("Items borrowed succesfully");
    }
}
  class Book extends LibraryItems{
    String title;
    String author;
     public Book(String title, String author) {
         this.title=title;
         this.author=author;
     }



     @Override
     void displayDetails() {
         System.out.println("Title is: "+title+" author is:" +author);
     }
 }


class DVD extends LibraryItems{
    String title;
    int duration;

    public DVD(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        System.out.println("Title is: "+title+" duration  is:" +duration);
    }
    }
