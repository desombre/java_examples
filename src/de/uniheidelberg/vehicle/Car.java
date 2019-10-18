package de.uniheidelberg.vehicle;

import de.uniheidelberg.engine.Engine;

public class Car implements Vehicle {
    private Integer maxSpeed;
    private Integer currentSpeed;
    private Double weight;
    private Type type;
    private static Integer carCounter = 0;
    private Engine engine;

    public Car(Integer maxSpeed, Double weight, Engine engine) {
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.weight = weight;
        this.currentSpeed = 0;
        this.type = Type.Land;
        carCounter++;
    }

    @Override
    public Integer getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    public String honk() {
        return "huuuuuup";
    }

    public static Integer getCarCounter() {
        return carCounter;
    }

    public String getCurrentMileage(){
        return this.engine.getCurrentMileage(this.weight, this.currentSpeed) + this.engine.getMileageUnit();
    }

    public void setCurrentSpeed(Integer newSpeed){
        this.currentSpeed = Math.max(0, Math.min(newSpeed, this.maxSpeed));
    }

    public Integer getCurrentSpeed(){
        return this.currentSpeed;
    }

}
