/**
 * This interface represents a basic worker.
 */
interface Worker {
    void work();
}

/**
 * This interface represents a worker that can eat during breaks.
 */
interface Eater {
    void eat();
}

/**
 * This class represents a Robot worker that can work.
 */
class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}

/**
 * This class represents a Human worker that can work and eat during breaks.
 */
class Human implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Human is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating during the break.");
    }
}

/**
 * This class represents a cafeteria that serves food to workers.
 */
class Cafeteria {
    public void serveFood(Eater eater) {
        eater.eat();
    }
}

public class Interface_Segregation_Principle {
    public static void main(String[] args) {
        // Create workers
        Worker robotWorker = new Robot();
        Worker humanWorker = new Human();

        // Create a cafeteria and serve food to workers
        Cafeteria cafeteria = new Cafeteria();
        cafeteria.serveFood((Eater) humanWorker);

        // robotWorker does not need to eat, so it's not affected by changes related to eating behavior.
        // This adheres to the Interface Segregation Principle (ISP).
    }
}

/**
 * This code adheres to the Interface Segregation Principle (ISP) because:
 * - The Robot class, which does not eat, implements only the Worker interface.
 * - The Human class, which can eat during breaks, implements both Worker and Eater interfaces.
 * - This design ensures that classes implement only the interfaces they need, preventing them from depending on methods they don't use.
 */

