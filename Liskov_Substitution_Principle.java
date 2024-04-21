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
        throw new UnsupportedOperationException(name + " cannot fly.");
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

        // Adding a flightless bird would break LSP
        // FlightlessBird penguin = new FlightlessBird("Penguin");
        // zoo.letBirdsFly(penguin); // This would throw an exception
    }
}

/**
 * This code violates the Liskov Substitution Principle (LSP) because:
 * - The `Zoo` class expects all birds to be able to fly, but adding a `FlightlessBird` breaks this assumption.
 * - To adhere to LSP, the `Zoo` class should work with subclasses without breaking. Using a hierarchy that respects capabilities avoids breaking LSP.
 * 
 * Fixing this code to align with LSP would involve redefining the contract so that subclasses are consistent with the base class's expectations.
 */
