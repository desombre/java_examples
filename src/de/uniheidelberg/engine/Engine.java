package de.uniheidelberg.engine;

public abstract class Engine {
    private Integer horsepower;
    private Double kilometersRun;
    private String mileageUnit;


    public Engine(Integer horsepower, Double kilometersRun, String mileageUnit) {
        this.horsepower = horsepower;
        this.kilometersRun = kilometersRun;
        this.mileageUnit = mileageUnit;
    }

    public abstract Double getCurrentMileage(Double vehicleWeight, Integer speed);

    public String getMileageUnit(){
        return this.mileageUnit;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public Double getKilometersRun() {
        return kilometersRun;
    }
}
