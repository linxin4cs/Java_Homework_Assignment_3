package homework3;

public class Main {
    public static void main(String[] args) {
        Manufacture audi = new Manufacture("Audi", "Germany");
        Manufacture tesla = new Manufacture("Tesla", "USA");
        Manufacture toyota = new Manufacture("Toyota", "Japan");

        Vehicle icev = new ICEV(audi, new CombustionEngine());
        Vehicle bev = new BEV(tesla, new ElectricEngine());
        Vehicle hybrid = new HybridV(toyota, new HybridEngine());

        Vehicle[] vehicles = { icev, bev, hybrid };

        for (Vehicle v : vehicles) {
            v.ShowCharacteristics();
            System.out.println();
        }
    }
}
