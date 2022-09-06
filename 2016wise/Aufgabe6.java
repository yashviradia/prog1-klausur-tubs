public class Aufgabe6 {
    public static void querSumme(String userInput) {
        char[] userInputArray = userInput.toCharArray();
        int zahl = 0;

        for (int i = 0; i < userInputArray.length; i++) {
            zahl += Character.getNumericValue(userInputArray[i]);
        }

        /**
         * Wenn userInput teilerbar von zahl ist, dann 
         * wird noch zweiteZahl gefunden und Output ausgegeben, sonst
         * wird keine Nivenzahl gefunden.
         */
        if (Integer.valueOf(userInput) % zahl == 0) {
            int zweiteZahl = Integer.valueOf(userInput) / zahl;
            System.out.println("Quersumme(" + userInput + ")" + " = " + zahl + "  und  " + userInput + " = " + zahl + " * " + zweiteZahl);
        } else {
            System.out.println("keine Nivenzahl wurde gefunden.");
        }
    }

    public static void main (String[] args) {
        if (args.length == 0) {
            System.out.println("Kein Input wurde eingegeben!");
            return;
        }

        String userInput = args[0];
        if (args[0].toCharArray().length == 3) {
            querSumme(userInput);
        } else {
            System.out.println("Das war keine zulaessige Input!");
        }
    }
}