package B_May_Code.ex_21052024.Abstarction.InterfaceKeyword;

public class Car implements Engine,Brake{
    @Override
    public void startEngine() {
        System.out.println("Starting Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Engine");

    }

    @Override
    public void applyBrake() {
        System.out.println("Applying the brakes");
    }
}
