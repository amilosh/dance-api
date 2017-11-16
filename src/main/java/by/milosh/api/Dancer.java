package by.milosh.api;

public class Dancer implements TaskDancer {

    // ~ Instance fields
    // ================================================================================================
    private int serialNumber;
    private String name;

    // ~ Constructors
    // ===================================================================================================
    public Dancer() {
    }

    public Dancer(int serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    // ~ Methods
    // ========================================================================================================
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
