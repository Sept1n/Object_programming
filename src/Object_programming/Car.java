package Object_programming;

public class Car extends Vehicle {

    private String nrRej;
    private int tankCapacity;
    private int fuel;

    public Car (String nr, Person owner, int w, int h, int l, int ww, int tankCapacity) {
        super(owner, w, h, l, ww);
        this.nrRej = nr;
        this.tankCapacity = tankCapacity;
    }

    public Car fill (int amount) {
        fuel += amount;
        if (fuel > tankCapacity) fuel = tankCapacity;
        return this;
    }
    @Override
    public Car start() {
        if (fuel > 0) super.start();
        else error("Brak paliwa");
        return this;
    }
    public Car stop() {
        super.stop();
        return this;
    }
    public Car repair() {
        super.repair();
        return this;
    }
    @Override
    public String toString() {
        return "Samochód o numerze " + nrRej + " - " + getState();
    }
}
