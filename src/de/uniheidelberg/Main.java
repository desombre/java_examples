package de.uniheidelberg;

import de.uniheidelberg.engine.DieselEngine;
import de.uniheidelberg.engine.ElectricEngine;
import de.uniheidelberg.vehicle.Car;
import de.uniheidelberg.vehicle.Vehicle;

import java.util.List;
import java.util.Scanner;

public class Main {

    //Main -> Entrypoint des Java Programms
    public static void main(String[] args) {
        // Hier gehts los.
        System.out.println("Test");

        // ----- VORHANDENE KLASSEN -----
        // Java Klassen sind Baupläne für Objekte
        // Der Konstruktor eine "besondere" Methode die beim erstellend es Objektes aufgerufen wird.
        String greeting = new String("Hello ");
        // Klassen müssen importiert werden. Das macht die IDE in der Regel von selbst.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.println(greeting + name);

        // Wichtige Programmsteuerungs-Elemente:
        // Verzweigungen: If-else, Switch-case

        if ("Philipp".equals(name)) {
            System.out.println("\uD83D\uDC4D");
        } else {
            System.out.println("\uD83D\uDC4E");
        }
        // Schleifen: while, do, for, for-each
        String[] names = {name, "Paul", "Mannfred", "Hermine"};

        for (String currentName : names) {
            System.out.println(greeting + currentName);
        }

        // ----- EIGENE KLASSEN -----
        System.out.println("--------------");
        // Wir instanziieren einen DieselEngine (ein Object) mit dem new Keyword.
        DieselEngine dieselEngine = new DieselEngine(180, 0.0);

        // Deklaration und Inititalisierung müssen nicht in derselben Codezeile erfolgen.
        // Deklaration -> was passiert wenn wir es jetzt nutzen wollen? Variable ist null: warnung!
        ElectricEngine electricEngine;
        //System.out.println(electricEngine.getMileageUnit());
        // Inititalisierung
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
