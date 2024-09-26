package homework3;

public class Manufacture {
    private String name;
    private String country;

    public Manufacture(String name, String country) {
        this.name = name;
        this.country = country;
    }

    // Getter和Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
