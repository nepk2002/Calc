
public class Reading {

    private int a, b;

    public Reading() {

    }

    public int setA(int a) {
        this.a = a;
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Reading{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
