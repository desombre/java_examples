package de.uniheidelberg.vehicle;

public class Boat implements Vehicle {
    private Integer maxSpeed;
    private Type type;

    public Boat(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.type = Type.Water;
    }

    @Override
    public Integer getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    
}
