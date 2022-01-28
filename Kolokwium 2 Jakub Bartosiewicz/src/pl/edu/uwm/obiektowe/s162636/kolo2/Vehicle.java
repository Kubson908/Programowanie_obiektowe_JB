package pl.edu.uwm.obiektowe.s162636.kolo2;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Vehicle {
    public String name;
    public double mass;
    public enum Manufacturer {
        BMW, AUDI, FORD, MAN, TOYOTA
    };
    public Manufacturer manufacturer;
    public ArrayList<Property<String, Double>> properties;

    public Vehicle(String name, double mass, Manufacturer manufacturer) {
        this.name = name;
        this.mass = mass;
        this.manufacturer = manufacturer;
        this.properties = new ArrayList<>();
    }

    public abstract String getName();

    public abstract double getMass();

    public abstract Manufacturer getManufacturer();

    public String toString() {
        return "Model: " + this.name + ", manufacturer: "
                + this.manufacturer + ", mass: " + this.mass
                + ", properties: " + properties.toString();
    }

    public void addProperty(Property<String, Double> p) {
        boolean exists = false;
        for (Property<String, Double> i: properties){
            if (Objects.equals(i.getName(), p.getName())) {
                exists = true;
                i = p;
                break;
            }
        }
        if(!exists) properties.add(p);
    }

    public abstract Property<?, ?> getPropetyByName(String n);
}
