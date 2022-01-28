package pl.edu.uwm.obiektowe.s162636.kolo2;

public class Property<String, T> {
    private final String name;
    private T value;

    public Property(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof java.lang.String) {
            return this.name.equals(o);
        }
        return false;
    }

    public java.lang.String toString() {
        return name + " -> " + value;
    }
}
