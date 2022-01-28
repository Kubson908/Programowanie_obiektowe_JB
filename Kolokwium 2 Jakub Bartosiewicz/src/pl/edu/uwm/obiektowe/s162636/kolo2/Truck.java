package pl.edu.uwm.obiektowe.s162636.kolo2;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Truck extends Vehicle{
    private final double maxLoad;
    private final int numberOfAxis;
    private double loadLeft;
    private LinkedList<Cargo> cargo;

    public Truck(String name, double mass, Manufacturer manufacturer, double maxLoad, int numberOfAxis) {
        super(name, mass, manufacturer);
        this.maxLoad = maxLoad;
        this.numberOfAxis = numberOfAxis;
        this.loadLeft = maxLoad;
        this.cargo = new LinkedList<>();
    }

    @Override
    public double getMass() {
        return super.mass;
    }

    @Override
    public Manufacturer getManufacturer() {
        return super.manufacturer;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public int getNumberOfAxis() {
        return numberOfAxis;
    }

    public double getLoadLeft() {
        return loadLeft;
    }

    public Property<?, ?> getPropetyByName(String n) {
        for (Property<?, ?> i: super.properties) {
            if (i.getName() == n) return i;
        }
        return null;
    }

    public boolean loadCargo(Cargo c) {
        if (this.loadLeft - c.getMass() > 0) {
            cargo.add(c);
            this.loadLeft -= c.getMass();
            return true;
        }
        return false;
    }

    public Cargo unloadCargo() throws NoSuchElementException {
        Cargo c;
        if (!cargo.isEmpty()) {
            c = cargo.getLast();
            cargo.remove(cargo.lastIndexOf(cargo.getLast()));
            return c;
        }
        else {
            throw new NoSuchElementException("There is no Cargo to unload");
        }
    }

    public double getTotalMass() {
        double mass = super.mass;
        for (Cargo c: cargo) {
            mass += c.getMass();
        }
        return mass;
    }

    @Override
    public String toString() {
        return super.toString() + ", max load: " + this.maxLoad
                + ", number of axis: " + this.numberOfAxis
                + ", load left: " + this.loadLeft;
    }
}
