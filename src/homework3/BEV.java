package homework3;

public class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("BEV Characteristics:");
        System.out.println("Manufacture: " + manufacture.getName());
        engine.displayEngineInfo();
    }
}
