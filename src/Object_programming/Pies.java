package Object_programming;

public class Pies extends Zwierz implements Speakable, Moveable {

    Pies () { }
    Pies (String s) {super(s);}

    public String getType() {
        return "Pies";
    }

    public Pies merda() {
        System.out.println(getName() + " merda ogonem");
        return this;
    }

    @Override
    public String getVoice(int voice) {
        if (voice == QUIET) return "hau hau";
        else if (voice == LOUD)return "HAU HAU";
        else return "?";
    }

    @Override
    public Moveable start() {
        System.out.println(getType() + " " + getName() + " biegnie");
        return this;
    }

    @Override
    public Moveable stop() {
        System.out.println(getType() + " " + getName() + " stoi");
        return this;
    }
}
