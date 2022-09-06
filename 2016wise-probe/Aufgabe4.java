public class Aufgabe4 {

    static int f(int x, int y) {
        if (x == 0) {
            return 2;
        } else if (y == 0) {
            return 1;
        } else {
            return f(x-2, y) - 3 * f(y-2, x%4);
        }
    }

    public static void main (String[] args) {

        System.out.println(f(6,4));
    }
}