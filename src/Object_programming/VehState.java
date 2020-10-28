package Object_programming;

public enum VehState {
        BROKEN("ZEPSUTY"), STOPPED("STOI"), MOVING("JEDZIE");

        private String opis;

        VehState (String s) {opis = s;}

        public String toString() {
                return opis;
        }
}
