package de.uniheidelberg.engine;

public class ElectricEngine extends Engine {

    public ElectricEngine(Integer horsepower, Double kilometersRun) {
        super(horsepower, kilometersRun, "kW/h");
    }

    @Override
    public Double getCurrentMileage(Double vehicleWeight, Integer speed) {
        return vehicleWeight * speed / 15;
    }
}
