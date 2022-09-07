public class Aufgabe7 {

    static boolean quasifriends (int m, int n) {
        int[] echteTeiler1 = new int[m/2];
        int[] echteTeiler2 = new int[n/2];

        int counter1 = 0;
        int counter2 = 0;

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 2; i <= m/2; i++) {
            if (m % i == 0) {
                echteTeiler1[counter1] = i;
                counter1++;
            }
        }

        for (int j = 2; j <= n/2; j++) {
            if (n % j == 0) {
                echteTeiler2[counter2] = j;
                counter2++;
            }
        }

        for (int i = 0; i < echteTeiler1.length; i++) {
            sum1 += echteTeiler1[i];
        }

        for (int j = 0; j < echteTeiler2.length; j++) {
            sum2 += echteTeiler2[j];
        }

        if (sum1 == n && sum2 == m) {
            return true;
        }

        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException();
        }

        return false;
    }

    public static void main (String[] args) {
        System.out.println(quasifriends(48, 75));
    }
}