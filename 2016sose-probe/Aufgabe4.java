public class Aufgabe4 {
    public static void main (String[] args) {

        // a
        int x = 6;
        int y = 3;

        for (int i = 2; i <= x + y; i++) {
            x--;
            y++;
            switch (y % 4) {
                case 0 :y=x+i;
                case 1 :y=x*i;   break; 
                case 2 :y=x-i;   break; 
                case 3 :y=x/i; 
                default : y = x % i;
            } 
        }

        System.out.println(x + " " + y);
        System.out.println();


        // b
        x = 3;
        y = 2;

        do {
            x = x + y;
            y = x - y;

        } while ((x % 4 != 1 || (y % 4) != 1));

        System.out.println(x);
        System.out.println(y);
        System.out.println();


        // c
        System.out.println((15 ^ 5) ^ 5);
        System.out.println(15 - (10 >> 1));
        System.out.println(15 & 5 & 12);

        System.out.println();

        // f
        int[] a = new int[5];

        for(int i = 0; i < a.length; i++) { 
            a[i] = (9 - 2 * i) % 5;
        }


        for (int i = a.length-1; i >= 0; i--) {
          a[i] = a[4  - a[i]] + 2;
          System.out.println(a[i]);
        }

    }
}