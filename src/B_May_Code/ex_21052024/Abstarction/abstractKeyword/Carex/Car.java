package B_May_Code.ex_21052024.Abstarction.abstractKeyword.Carex;

abstract class Car extends Engine{
    @Override
    void start() {
        System.out.println("Starting the car");

    }

    @Override
    void stop() {
        System.out.println("Stopping the car");
    }

    @Override
    void partGear() {
        System.out.println("Assemble the gear box");
    }

    @Override
    void accessKeys() {
        System.out.println("I am able to access the Keys");
    }
    abstract void brakeMechanism();
}
