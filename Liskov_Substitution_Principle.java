/**
 * This interface represents a basic bird.
 */
interface Bird {
    void fly();
}

/**
 * This class represents a bird that can fly.
 */
class FlyingBird implements Bird {
    private String name;

    public FlyingBird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

/**
 * This class represents a bird that cannot fly.
 */
class FlightlessBird implements Bird {
    private String name;

    public FlightlessBird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        // Do nothing for flightless birds
        System.out.println(name + " cannot fly.");
    }
}

/**
 * This class represents a zoo that contains birds.
 */
class Zoo {
    public void letBirdsFly(Bird... birds) {
        for (Bird bird : birds) {
            bird.fly();
        }
    }
}

public class Liskov_Substitution_Principle {
    public static void main(String[] args) {
        // Create birds
        FlyingBird eagle = new FlyingBird("Eagle");
        FlyingBird sparrow = new FlyingBird("Sparrow");

        // Create a zoo and let birds fly
        Zoo zoo = new Zoo();
        zoo.letBirdsFly(eagle, sparrow);

        // Adding a flightless bird would not break LSP
        FlightlessBird penguin = new FlightlessBird("Penguin");
        zoo.letBirdsFly(penguin); // This would print "Penguin cannot fly."
    }
}

/**
 * This code adheres to the Liskov Substitution Principle (LSP) because:
 * - The `Zoo` class works with all types of birds, including both flying and flightless birds.
 * - The behavior of each bird subclass respects the contract specified by the `Bird` interface, ensuring that substitution does not alter the correctness of the program.
 * - The `letBirdsFly()` method of the `Zoo` class handles birds without making assumptions about their flying capability, thus supporting extensibility and maintainability.
 */
