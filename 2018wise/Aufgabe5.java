class Aufgabe5 {

    static int f(int n) {
        if (n < 2) {
            return -n;
        } else {
            return n * (f(n-2) - f(n-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(f(4));
    }
}