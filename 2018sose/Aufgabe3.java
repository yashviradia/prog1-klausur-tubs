class Aufgabe3 {
    public static void main (String[] args) {
        int[] a = new int[6];

        for (int i = 0; i <= 10; i = i+2)   a[i/2] = i < 5 ? 5 - i : 0;
        for (int i = a.length; i > 0; i--)  a[i-1] = a[a[i-1]] + i;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}