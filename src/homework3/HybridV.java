package homework3;

public class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("HybridV Characteristics:");
        System.out.println("Manufacture: " + manufacture.getName());
        engine.displayEngineInfo();
    }
}