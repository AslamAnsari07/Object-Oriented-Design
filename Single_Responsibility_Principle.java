/**
 * This code demonstrates the Single Responsibility Principle (SRP).
 * 
 * The SRP states that a class should have only one reason to change, meaning it should have a single responsibility.
 * In this example, we create two classes - `MessageSender` and `Logger`.
 * 
 * - `MessageSender` handles sending a message to a recipient.
 * - `Logger` handles logging messages to a console.
 * 
 * Each class has its specific responsibility, following the SRP.
 */

 class MessageSender {
    private String message;

    public MessageSender(String message) {
        this.message = message;
    }

    public void sendMessage(String recipient) {
        System.out.println("Sending message to " + recipient + ": " + message);
    }
}

class Logger {
    public void log(String logMessage) {
        System.out.println("Log: " + logMessage);
    }
}

public class Single_Responsibility_Principle {
    public static void main(String[] args) {
        MessageSender sender = new MessageSender("Hello, this is a test message.");
        sender.sendMessage("Alice");

        Logger logger = new Logger();
        logger.log("Message sent to Alice successfully.");
    }
}

/*
Explanation:
This code maintains the Single Responsibility Principle (SRP) by separating the responsibility of sending messages
from logging. The `MessageSender` class is solely responsible for sending messages, while the `Logger` class is
responsible for logging information. This separation ensures that each class has a single responsibility, 
making the code easier to maintain and change if needed.
*/
