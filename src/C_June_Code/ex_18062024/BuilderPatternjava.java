package C_June_Code.ex_18062024;

public class BuilderPatternjava {

    public BuilderPatternjava groundFloor(){
        System.out.println("Ground ");
        return this;
    }

    public BuilderPatternjava fisrtFloor(String name){
        System.out.println("Do some work for first floor "+ name );
        return this;
    }

    public BuilderPatternjava secondFloor(String name,String color){
        System.out.println("Do some work for first floor "+ name + color);
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternjava bp= new BuilderPatternjava();
        bp.groundFloor().fisrtFloor("Kisaan").secondFloor("Abhi","Red");

        // Rest Assured
        //  get().header().auth().make().response().verify()

    }
}
