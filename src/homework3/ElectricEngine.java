package homework3;

public class ElectricEngine extends Engine {
    public ElectricEngine() {
        super("Electric Engine");
    }

    @Override
    public void displayEngineInfo() {
        System.out.println("This is an electric engine.");
    }
}
