class Aufgabe5 {
    public static boolean f(int i) {
        if (i <= 1) {
            return false;
        }

        int s = 1;
        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) {
                s += j;
            }
        }
        return s == i;
    }

    public static void main (String[] args) {
        for (int i = 2; i <= 8; i++) {
            if (f(i)) {
                String t = ""+ i + "_=_" + "1";
                for (int j = 2; j <= i/2; j++) {
                    if (i%j == 0) { 
                        t = t+"_+_"+j;
                    }
                    System.out.println(t);
                }
            }
        }
    }
}
