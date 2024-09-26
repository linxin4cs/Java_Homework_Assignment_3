package homework3;

public class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("ICEV Characteristics:");
        System.out.println("Manufacture: " + manufacture.getName());
        engine.displayEngineInfo();
    }
}
