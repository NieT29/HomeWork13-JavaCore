package entities;

public class Customer {
    private String name;
    private int apartmentNumber;
    private double meterCode;

    public Customer(String name, int apartmentNumber, double meterCode) {
        this.name = name;
        this.apartmentNumber = apartmentNumber;
        this.meterCode = meterCode;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getMeterCode() {
        return meterCode;
    }

    public void setMeterCode(double meterCode) {
        this.meterCode = meterCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", apartmentNumber=" + apartmentNumber +
                ", meterCode=" + meterCode +
                '}';
    }
}
