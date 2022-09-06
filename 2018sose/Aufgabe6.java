class Aufgabe6 {

    public static void hilfsFunktion (String decompressed) {
        char[] decompressedArray = decompressed.toCharArray();
        int count = 0;
        String compressed = "";

        for (int i = 0; i < decompressed.length(); ++i) {
            for (int j = i; j < decompressed.length(); j++) {
                System.out.println(i);
                if (decompressedArray[i] == (decompressedArray[j])) {
                    ++count;
                } else {
                    compressed += decompressedArray[i];
                    compressed += count;
                    count = 0;
                    i = j;
                    break;
                }
            }
        }

        if (decompressed.length() < compressed.length()) {
            throw new IllegalArgumentException();
        }

        System.out.println(compressed);
    }

    public static void main (String[] args) {
        try {
            String userInput = args[0];
            hilfsFunktion(userInput);
        } catch (IllegalArgumentException iAE) {
            System.out.println("The length of decompressed string is less than that of compressed String!");
        }
    }
}