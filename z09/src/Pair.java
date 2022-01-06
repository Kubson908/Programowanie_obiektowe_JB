public class Pair<T, V> {

    T ob1;
    V ob2;

    public Pair(T t, V v){
        this.ob1 = t;
        this.ob2 = v;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public void swap() {
        T temp = ob1;
        this.ob1 = (T) this.ob2;
        this.ob2 = (V) temp;

    }

    @Override
    public String toString() {
        return "Pair{" +
                "ob1=" + ob1.getClass().getName() +
                ", ob2=" + ob2.getClass().getName() +
                '}';
    }
}