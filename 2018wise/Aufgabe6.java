class Aufgabe6 {

    public static void findLargest(int[] numbers) {
        int largest = 0;
        int count = 0;
        int[] repeatedNumbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    repeatedNumbers[count] = numbers[i];
                    ++count;
                    break;
                }
            }
        }

        for (int i = 0; i < repeatedNumbers.length; i++) {
            if (repeatedNumbers[i] > largest) {
                largest = repeatedNumbers[i];
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException();
        }

        System.out.println(largest);
    }

    public static void main (String[] args) {

        int[] numbers1 = { 1, 9, 1, 7, 9, 12, 21, 49, 21 };
        int[] numbers2 = { 1, 49, 21 };
        int[] numbers3 = { 49, 7, 21, 14, 49, 21 };

        if (args.length == 0) {
            System.out.println("No Argument was given!");
            return;
        }

        int userInput = Integer.parseInt(args[0]);

        try {
            switch(userInput) {
                case 1:
                    findLargest(numbers1);
                    break;
                case 2:
                    findLargest(numbers2);
                    break;
                case 3:
                    findLargest(numbers3);
                    break;
                default: 
                    System.out.println("Invalid input");
            }
        } catch (IllegalArgumentException iAE) {
            System.out.println("No number was repeated.");
        }
    }
}