package pl.edu.uwm.obiektowe.s162636.kolo2;

import java.util.ArrayList;
import java.util.LinkedList;

public class VehicleTest {
    public static void main (String[] args) {
        Truck t1 = new Truck("Viking", 15000, Vehicle.Manufacturer.MAN, 14000, 5);
        Truck t2 = new Truck("F-Max", 13000, Vehicle.Manufacturer.FORD, 10500, 6);
        Property<String, Double> p1 = new Property<>("sleeping couch", 559.99);
        Property<String, Double> p2 = new Property<>("TV", 1000.00);
        Property<String, Double> p3 = new Property<>("Heater", 359.50);
        t1.addProperty(p1);
        t1.addProperty(p3);
        t2.addProperty(p1);
        t2.addProperty(p2);
        System.out.println("Before loading cargo:");
        System.out.println(t1 + "\n" + t2);
        ArrayList<Cargo> cargo = new ArrayList<>();
        cargo.add(new Cargo("AGD", 2500));
        cargo.add(new Cargo("computer parts", 3470.5));
        cargo.add(new Cargo("building materials", 7120));
        cargo.add(new Cargo("vegetables", 4000));
        cargo.add(new Cargo("flour", 5430));
        LinkedList<Truck> trucks = new LinkedList<>();
        trucks.add(t1);
        trucks.add(t2);
        loadCargoTest(trucks, cargo);
        System.out.println();
        System.out.println("After loading cargo:");
        System.out.println(t1 + "\n" + t2);

    }

    public static void loadCargoTest(LinkedList<Truck> trucks, ArrayList<Cargo> cargo) {
        sortCargo(cargo);
        Truck truck = trucks.poll();
        for (Cargo c: cargo) {
            assert truck != null;
            if (!truck.loadCargo(c)) {
                truck = trucks.poll();
            }
            if (truck == null) break;
        }
    }

    public static void sortCargo(ArrayList<Cargo> c) {
        for(int i = 0; i < c.size(); i++) {
            int min = i;
            for (int j = i+1; j < c.size(); j++) {
                if (c.get(j).getMass() > c.get(min).getMass()) min = j;
            }
            Cargo temp = c.get(i);
            c.set(i, c.get(min));
            c.set(min, temp);
        }
    }
}
