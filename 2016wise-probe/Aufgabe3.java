public class Aufgabe3 {
    public static void main (String[] args) {
        int[] a = new int[6];

        for (int i = 0; i < a.length; i++) {
            a[i] = (4 * (i + 1)) % 5;
            System.out.println(a[i]);
        }
        System.out.println();

        for (int i = a.length-1; i >= 0; i--) {
            a[i] = a[1 + a[i]];
            System.out.println(a[i]);
        }
     
    }
}