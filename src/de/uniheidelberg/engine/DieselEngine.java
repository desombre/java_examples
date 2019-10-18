package de.uniheidelberg.engine;

public class DieselEngine extends Engine {

    public DieselEngine(Integer horsepower, Double kilometersRun) {
        super(horsepower, kilometersRun, "l/100km");
    }

    @Override
    public Double getCurrentMileage(Double vehicleWeight, Integer speed) {
        return vehicleWeight + speed / 20;
    }
}
