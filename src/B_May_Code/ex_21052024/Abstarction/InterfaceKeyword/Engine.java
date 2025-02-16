package B_May_Code.ex_21052024.Abstarction.InterfaceKeyword;

public interface Engine {
    void startEngine();
    void stopEngine();

    default void HaltingEngine(){
        System.out.println("Hault the Engine");
    }
    default void HaltingEngineJust(){
        System.out.println("Hault the Engine Just for a second");
    }

    static void m1(){
        System.out.println("Be Static");
    }
}
