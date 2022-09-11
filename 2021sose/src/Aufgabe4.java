class Hobbit {
    private String name;
    private float[] armStrength = new float[2];

    public Hobbit (String name) {
        this.name = name;
        armStrength[0] = 20.3f;
        armStrength[1] = 7.5f;
    }

    public String getName() {
        return name;
    }

    public float getArmStrength(int arm) {
        return this.armStrength[arm];
    }

    public void trainArm (int arm) {
        this.armStrength[arm] += 15.5f;
    }
}

class Aufgabe4 {

    public static void printHobbit(Hobbit hobbit) {
        System.out.print("Hobbit " + hobbit.getName().toUpperCase() + ": ");

        if (hobbit.getArmStrength(0) > hobbit.getArmStrength(1)) {
            System.out.println("Left arm is stronger than right arm.");
        } else if (hobbit.getArmStrength(0) < hobbit.getArmStrength(1)) {
            System.out.println("Right arm is stronger than left arm.");
        } else {
            System.out.println("Both arms have the same strength.");
        }
    }

    public static void main (String[] args) {
        Hobbit bilbo = new Hobbit("Bilbo");
        bilbo.trainArm(1);
        printHobbit(bilbo);
    }
}