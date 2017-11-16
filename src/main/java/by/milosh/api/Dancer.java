package by.milosh.api;

public class Dancer implements TaskDancer {

    private int serialNumber;

    private String name;

    public Dancer() {
    }

    public Dancer(int serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

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
