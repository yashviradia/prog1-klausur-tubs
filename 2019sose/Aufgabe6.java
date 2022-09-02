class Aufgabe6 {

    public static void compressString(String compressed) {
        char[] compressedArray = compressed.toCharArray();
        String decompressed = "";

        for (int i = 0; i < compressed.length(); i = i + 2) {
            if (Character.getNumericValue(compressedArray[i]) == 0) {
                throw new IllegalArgumentException();
            } else {
                for (int j = 0; j < Character.getNumericValue(compressedArray[i]); j++) {
                    decompressed += compressedArray[i+1];
                }
            }
        }
        System.out.println(decompressed);
    }

    public static void main(String[] args) {
        String first = "4a5v2c1s9i";
        String second = "6y7v3k9m";
        String third = "0s4b";
        String fourth = "1a1b1c1d";

        if (args.length == 0) {
            System.out.println("No Argument given!");
            return;
        }

        int userInput = Integer.parseInt(args[0]);

        try {
            switch (userInput) {
                case 0:
                    compressString(first);
                    break;
                case 1:
                    compressString(second);
                    break;
                case 2:
                    compressString(third);
                    break;
                case 3:
                    compressString(fourth);
                    break;
                default:
                    System.out.println("Invalid input. Argument must be between 0 and 3.");

            }
        } catch (IllegalArgumentException iAE) {
            System.out.println("Alphabet cannot be repeated 0 times.");
        }
    }
}