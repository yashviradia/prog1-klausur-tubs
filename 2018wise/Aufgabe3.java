class Aufgabe3 {
    public static void main(String[] args) {

        int[] a = new int[6];

        for (int i = 11; i >= 0; i = i - 1) {
            if (i % 2 != 0 || i == 8 || i == 3) {
                a[i/2] = i;
            } else {
                a[i/2] = i * -i;
            }
            System.out.println(a[i/2]);
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            a[i] = a[a.length - 1 - i];
            System.out.println(a[i]);
        }
    }
}