package technology;

public class Computer {
    private String brand;
    private String operatingSystem;
    private String storage;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Computer(String brand, String operatingSystem, String storage) {
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.storage = storage;

    }
}
