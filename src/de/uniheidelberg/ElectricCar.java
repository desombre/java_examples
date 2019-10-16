package de.uniheidelberg;

public class ElectricCar extends Car {
    private Integer batterCapacity;

    public ElectricCar(Integer maxSpeed, Integer batteryCapacity) {
        super(maxSpeed);
        this.batterCapacity = batteryCapacity;
    }

    public String honk() {
        return "tüüüüüt";
    }
}
