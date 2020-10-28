package Object_programming;

import static Object_programming.Zwierz.animalDialog;
import static Object_programming.Zwierz.info;

public class Main {

    public static void main(String[] args) {
        Pies reksio = new Pies("Reksio");
        Kot mruczek = new Kot("Mruczek");
        Car c = new Car("NOL 4215A", new Person("Jakub", "950101"), 100, 100, 100, 1000, 70);
        c.fill(10);
        Bicycle b = new Bicycle(new Person("Daniel", "951018"),50,50,50,25);
        Pies azor = new Pies("Azor");

        //Wyscig.wyscig(reksio, mruczek, c, b);

        //info(reksio);
        //info(mruczek);

        //animalDialog(reksio,azor);
        //animalDialog(reksio,mruczek);
        //animalDialog(mruczek,azor);

        System.out.println(Speakable.getAvailableVoiceForce());
        System.out.println(reksio.getVoice());
    }

}
