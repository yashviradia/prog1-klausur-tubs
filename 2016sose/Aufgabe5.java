public class Aufgabe5 {

    static void wasPassiert(int[][] a) {
        for (int k = 0; k < a.length; k++) {
            if (a[k].length != a.length) {
                return;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                a[i][j] = a[j][i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                System.out.print(";" + a[i][j]);
            }
        }
    }

    public static void main (String[] args) {
        int[][] a = new int[][] {{1,2,3,4},{5,6,7,8},{9,9,9,9},{9,9,9,9}};

        wasPassiert(a);
    }
}