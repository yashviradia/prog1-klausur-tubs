public class Aufgabe7 {
    static int f(int[] a, int k, int x) {
        if (k >= a.length) {
            return 0; 
        }

        int n = 0;
        for (int i = k; i < a.length; i++) {
          if (a[i] == x) {
            n++;
          } 
        }
        return n; 
    }
    
    static int[] wasPassiert(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (f(a, i+1, a[i]) == 1) {
                count++;
            } 
        }  

        int[] x = new int[count];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (f(a, i+1, a[i]) == 1) {
                x[j] = a[i];
                j++;
            } 
        }
        return x; 
    }

    public static void main (String[] args) {
        int[] x = {7,2,4,3,2,7,0,2,3};

        for (int i : wasPassiert(x)) {
            System.out.printf("%d ", i);
        }
    }
}