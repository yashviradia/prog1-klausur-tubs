public class Aufgabe6 {

    // need to work on this!
    public static void intersection (int[] a, int[] b) {
        int[] c = new int[10];
        int count = 1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[i] = b[i];    
                    ++count;
                }
            }
        }

        int[] intersectedArray = new int[count];
        for (int i = 0; i < count; i++) {
            intersectedArray[i] = c[i];
        }

        for (int i = 0; i < intersectedArray.length; i++) {
            System.out.println(intersectedArray[i]);
        }
    }

    public static void main (String[] args) {

        int[] a = {2,4,3,2,7,0,2,7};
        int[] b = {7,7,8,4,2,4,3,5};

        intersection(a, b);

    }
}