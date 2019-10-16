package de.uniheidelberg;

public class Main {

    //Main -> Entrypoint of Java Program
    public static void main(String[] args) {
        // write your code here
        System.out.println("Test");
        Vehicle car = new Car(160);
        System.out.println(car.getMaxSpeed());

        // Interfaces/Vererbung sind versprechen bestimmte Dinge zu können/ haben.
        //System.out.println(car.honk());
        //ElectricCar tesla = new Car(200);
    }

}
