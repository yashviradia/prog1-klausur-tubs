class Aufgabe5 {

    static int f(int x) {
        if (x < 3) {
            return x + 2;
        }
        else {
            return 2 * f(x-1) + f(x-3);
        }
    }

    public static void main (String[] args) {
        System.out.println(f(1272));
    }
}