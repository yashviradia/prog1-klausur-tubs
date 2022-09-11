public class Aufgabe6 {

    public static void intersection (int[] a, int[] b) {
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == a[j]) {
                    c[i] = a[i];
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

    public static void main (String[] args) {

        int[] a = {2,4,3,2,7,0,2,7};
        int[] b = {7,7,8,4,2,4,3,5};

        intersection(a, b);

    }
}