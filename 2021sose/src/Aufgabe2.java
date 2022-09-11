class Aufgabe2 {
    public static void main (String[] args) {
        int x = -4;
        int y = 3;
        for (int i = 0; i < 4; i++) {
            if (x < 0) {
                x = x + y;
            } else {
                y = y + x;
            }
        }

        System.out.println(x);
        System.out.println(y);
        System.out.println();

        x = 3;
        y = 4;
        while (x > 0) {
            if (y / 4 >= 1) {
                y -= 4;
            } else {
                x -= y;
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}