class Aufgabe3 {
    public static void main (String[] args) {

        // 3.4
        int[] a = new int[6];
        int k = 0;

        for (int i = 20; i > 0; i -= 1) {
            if (i > 10) {
                a[k] -= i / 2;
                i -= 2;
            } else {
                a[k] += i * 2;
            }

            k++;
            if (k == a.length) {
                k = 0;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println();

        // 3.5
        int[] b = {23, 17, 11, -11, -17, -23};
        for (int i = 0; i < b.length; i++) {
            for (int j = i; j < b.length - i; j++) {
                if (i % 2 == 0) {
                    b[i] += b[j];
                } else {
                    b[i] -= b[j];
                }
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        
    }
}