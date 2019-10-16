package de.uniheidelberg;

public class Car implements Vehicle {
    private Integer maxSpeed;
    private Type type;
    private Integer carCounter = 0;

    public Car(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    public Integer getCarCounter() {
        return carCounter;
    }
}
