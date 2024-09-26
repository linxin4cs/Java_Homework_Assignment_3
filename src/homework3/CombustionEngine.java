package homework3;

public class CombustionEngine extends Engine {
    public CombustionEngine() {
        super("Combustion Engine");
    }

    @Override
    public void displayEngineInfo() {
        System.out.println("This is a combustion engine.");
    }
}