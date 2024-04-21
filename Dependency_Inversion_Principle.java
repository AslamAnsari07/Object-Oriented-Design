/**
 * This interface represents a payment method.
 */
interface PaymentMethod {
    void processPayment(double amount);
}

/**
 * This class represents a credit card payment.
 */
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " using card: " + cardNumber);
    }
}

/**
 * This class represents a PayPal payment.
 */
class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " using email: " + email);
    }
}

/**
 * This class represents a shopping cart that depends on a payment method (abstraction).
 */
class ShoppingCart {
    private PaymentMethod paymentMethod;

    public ShoppingCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        paymentMethod.processPayment(amount);
    }
}

public class Dependency_Inversion_Principle {
    public static void main(String[] args) {
        // Create payment methods
        PaymentMethod creditCard = new CreditCardPayment("1234-5678-9101-1121");
        PaymentMethod paypal = new PayPalPayment("user@example.com");

        // Create shopping cart with a credit card payment method
        ShoppingCart cart = new ShoppingCart(creditCard);
        cart.checkout(100); // Checkout using credit card

        // Change payment method to PayPal
        ShoppingCart cartWithPayPal = new ShoppingCart(paypal);
        cartWithPayPal.checkout(200); // Checkout using PayPal
    }
}

/**
 * This code adheres to the Dependency Inversion Principle (DIP) because:
 * - The `ShoppingCart` class depends on the `PaymentMethod` abstraction rather than concrete implementations (like `CreditCardPayment` or `PayPalPayment`).
 * - This allows the `ShoppingCart` to change its behavior without modifying the class, promoting flexibility and maintainability.
 * - This design supports future extension with new payment methods without altering the existing classes.
 */
