package de.uniheidelberg.quiz;

class Engine {
    private Integer horsepower;

    public Engine(Integer horsepower){
        this.horsepower = horsepower;
    }

    public Integer calculateMileage(Integer rpm){
        return (this.horsepower/100) * (rpm/1000);
    }

}

class DieselEngine extends Engine {
    public DieselEngine(Integer horsepower){
        super(horsepower);
    }
}


public class Quiz {
    public static void main(String[] args) {
        Engine e = new Engine();
        Engine e1 = new Engine(60);
        e1 = new Engine(75);
        Engine e1 = new Engine(90);
        DieselEngine de = new DieselEngine();
        e1 = new DieselEngine(80);
        DieselEngine de1 = new Engine(55);
    }

}
