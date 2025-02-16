package B_May_Code.ex_18052024;

public class Lab185 {
    public static void main(String[] args){
        Dog D1=new Dog();
        Dog D2=new Dog("Lab");
//        D2.display();
        Dog D3=new Dog("Golden Retriever","Dog TT");
        D3.display();
    }
}
    class Animal{
    String type;
    Animal(String type){
        this.type=type;
        System.out.println("Animal PC1");
    }
        public Animal() {
            System.out.println("Animal DC");
        }
    }
    class Dog extends Animal{
    String breed;
        Dog(){
        System.out.println("DOG DC");
    }

        public Dog(String breed) {
          super("Dog type");
            this.breed = breed;
        }
        public Dog(String breed, String type) {
            super(type);
            this.breed=breed;
            System.out.println("DOG PC with 2 arg with no return");

        }
        void display(){
            System.out.println("Type: "+type+" Breed: "+breed);
        }

    }


