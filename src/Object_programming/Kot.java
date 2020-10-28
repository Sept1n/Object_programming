package Object_programming;

public class Kot extends Zwierz implements Speakable, Moveable{

    Kot () { }
    Kot (String s) {super(s);}

    public String getType() {return "Kot";}


    @Override
    public String getVoice(int voice) {
        if (voice == QUIET) return "miauuu";
        else if (voice == LOUD)return "MIAUUU";
        else return "?";
    }

    @Override
    public Moveable start() {
        System.out.println(getType() + " "  + getName() + " biegnie");
        return this;
    }

    @Override
    public Moveable stop() {
        System.out.println(getType() + " " + getName() + " stoi");
        return this;
    }
}
