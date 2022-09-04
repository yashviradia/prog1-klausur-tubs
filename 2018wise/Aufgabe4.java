interface Formattable {
    String format();
}

abstract class FormattableDefault implements Formattable {
    public String format() {
        return this.toString();
    }
}

class Person implements Formattable {
    private String name;
    public Person (String name) {
        this.name = name;
    }
    public String format() {
        return "Person: " + name;
    }
}

class Document extends FormattableDefault {
    private int number;
    public Document (int number) {
        this.number = number;
    }
    public String toString() {
        return "Document: Nr. " + number;
    }
}

class Aufgabe4 {
    public static void main(String[] args) {
        Formattable[] items = {
            new Person("Max Mustermann"),
            new Document(1),
            new Document(12)
        };

        for (Formattable i: items) {
            System.out.println(i.format());
        }
    }
}