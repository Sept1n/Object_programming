package Object_programming;

public class Wyscig {

    static void wyscig (Moveable ... moveables) {
        for (Moveable m : moveables) {
            m.start();
            if (m instanceof Vehicle) System.out.println(m);
        }
    }

}
