package pl.edu.uwm.obiektowe.s162636.kolo2;

public class Cargo implements Comparable<Cargo>{
    private final String name;
    private final double mass;

    public Cargo(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public int compareTo(Cargo o) {
        return Double.compare(this.mass, o.getMass());
    }

}
