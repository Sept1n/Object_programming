package Object_programming;

abstract class Zwierz implements Moveable{

    String name = "bez imienia";

    Zwierz () { }
    Zwierz (String s) {name = s;}

    public abstract String getType();
    String getName () { return name;}

    public void speak(int ... v) {
        int vol = Speakable.QUIET;
        if (v.length == 1) vol = v[0];
        String voice;
        if (this instanceof Speakable) voice = ((Speakable)this).getVoice(vol);
        else voice = " ... (cisza) ...";
        System.out.println(getType() + " " + getName() + " mówi " + voice);
    }

    static void info (Zwierz z) {
        System.out.println(z.getType() + " " + z.getName());
        if (z instanceof Speakable) {
            Speakable zs = (Speakable) z;
            if(zs instanceof Pies) {
                System.out.println(zs.getVoice(Speakable.LOUD));
            }
            else System.out.println(zs.getVoice(Speakable.QUIET));
        }
        if (z instanceof Pies) {
            ((Pies) z).merda();
        }
        if (z instanceof Moveable) {
            z.start().stop();
        }
    }

    static void animalDialog (Zwierz z1, Zwierz z2) {
        z1.speak();
        z2.speak();
        System.out.println("-------------------------");
    }

}
