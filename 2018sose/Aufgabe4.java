class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Mitarbeiter extends Person {
    protected int nummer; 

    // ?
    protected static int zaehler; 
    public Mitarbeiter(String name) {
        super(name); 
        nummer = ++zaehler;
    }
    
    public String toString() {
            return name + " (Mitarbeiter " + nummer + ")";
    }
}

class Aufgabe4 {
    public static void main(String[] args) {
    Person heinz = new Person("Heinz Kunz");
    Mitarbeiter peter = new Mitarbeiter("Peter Gibbons");
    Person roy = new Mitarbeiter("Roy Trenneman");
    System.out.println(heinz);
    System.out.println(peter);
    System.out.println(roy);
    } 
}