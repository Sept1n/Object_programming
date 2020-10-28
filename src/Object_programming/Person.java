package Object_programming;

final public class Person {

    private final String name;
    private final String pesel;

    Person (String name, String pesel) {
        this.name = name;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getPesel() {
        return pesel;
    }

}
