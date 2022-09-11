class Aufgabe6 {
    public static void palindrom (int[] a) {

        if (a == null) {
            throw new IllegalArgumentException();
        }

        // Array von allen Nummern in 'a', aber alle sind in Form von String
        String[] numberString = new String[20];

        for (int i = 0; i < a.length; i++) {
            numberString[i] = Integer.toString(a[i]);
        }

        // ein char Array wo jede Nummer nochmal in jeden Ziffern zerteilt wird

        for (int i = 0; i < numberString.length; i++) {
            if (numberString[i] == null) {
                return;
            }

            int count = 0;
            char[] digits = numberString[i].toCharArray();

            // Schleife durch digits Array um zu checken ob die Nummer palindrom ist
            for (int j = 0; j < digits.length / 2; j++) {
                for (int k = digits.length - 1; k >= digits.length / 2; k--) {
                    if (digits[j] == digits[k]) {
                        ++count;
                    }
                }
            }

            if (count == digits.length / 2) {
                System.out.print(numberString[i] + " ");
            }

        }

        System.out.println();

    }

    public static void main (String[] args) {
        int[] a = {7, 23, -121, 4554, 0, 66, 31, 20};
        palindrom(a);
    }
}