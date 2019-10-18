package de.uniheidelberg;

import de.uniheidelberg.engine.DieselEngine;
import de.uniheidelberg.engine.ElectricEngine;
import de.uniheidelberg.vehicle.Car;
import de.uniheidelberg.vehicle.Vehicle;

public class Main {

    //Main -> Entrypoint des Java Programms
    public static void main(String[] args) {
        // Hier gehts los.
        System.out.println("Test");

        // Wir instanziieren einen DieselEngine (ein Object) mit dem new Keyword.
        DieselEngine dieselEngine = new DieselEngine(180, 0.0);

        // Deklaration und Instanziierung müssen nicht in derselben Codezeile erfolgen.
        // Deklaration -> was passiert wenn wir es jetzt nutzen wollen? Variable ist null: warnung!
        ElectricEngine electricEngine;
        //System.out.println(electricEngine.getMileageUnit());
        // Instanziierung
        electricEngine = new ElectricEngine(200, 0.0);

        // Interfaces/Vererbung sind versprechen bestimmte Dinge zu können/ haben.
        // wir erwarten einen Parameter vom Typ Engine bekommen aber einen DieselEngine
        // -> Das geht da der Diesel mindestens alle "Fähigkeiten" des abstrakent Engines besitzt.
        // geht es andersherum? -> Nein, da "Fähigkeiten" fehlen würden.
        Vehicle car = new Car(190, 3.2, dieselEngine);
        System.out.println(car.getMaxSpeed());
        // Unser car ist ein Vehicle -> kennt getCurrentMileage nicht
        // casten zum expliziten Typ ändern
        System.out.println(((Car) car).getCurrentMileage());

        // ACHTUNG! Die Variablen halten bei Objekten nur deren Referenzen!
        Car car2 = (Car) car;

        car2.setCurrentSpeed(30);

        System.out.println(car2.getCurrentSpeed());
        System.out.println(((Car) car).getCurrentSpeed());

        // Bisher haben wir uns implementierte Methoden angeschaut.
        // Diese sind zu unterscheiden von überschriebenen.
        // Hier existiert die Methode bereits in der Oberklasse.

    }

}
