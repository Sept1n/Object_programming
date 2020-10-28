package Object_programming;

import static Object_programming.VehState.*;

public class Vehicle implements Moveable{

    private int width, height, lenght, weight;
    private Person owner;
    private VehState state;


    Vehicle (int w, int h, int l, int ww) {
        this(null,w,h,l,ww);
    }
    Vehicle (Person p, int w, int h, int l, int ww) {
        owner = p;
        width =w;
        height = h;
        lenght = l;
        weight = ww;
        state = STOPPED;
    }

    public Vehicle start() {
        setState(MOVING);
        return this;
    }
    public Vehicle stop() {
        setState(STOPPED);
        return this;
    }
    public Vehicle repair() {
        if (state != BROKEN) error("Nie można naprawić sprawnego auta");
        else state = STOPPED;
        return this;
    }
    public VehState getState() {
        return state;
    }
    public void sellTo (Person p) {
        owner = p;
    }

    public void crash (Vehicle v) {
        if (this.state != MOVING && v.state != MOVING) error("Nie mogę się zderzyć pojazdy, gdy żaden się nie porusza");
        else {
            this.state = BROKEN;
            v.state = BROKEN;
        }
    }

    public String toString() {
        String s = (owner == null ? "sklep" : owner.getName());
        return "Pojazd, którego właścicielem jest " + s + " jest w stanie " + state;
    }

    private void setState(VehState newState) {
        if (state == BROKEN)
            error("Nie jest możliwe przejście ze stanu " + state + " do stanu " + newState);
        else state = newState;
    }
    protected void error(String msg) {
        throw new IllegalArgumentException(msg);
    }
}
