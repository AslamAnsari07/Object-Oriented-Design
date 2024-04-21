/**
 * Represents a simple Product with a name and price.
 */
class Product {
    private String name;
    private double price;

    /**
     * Constructs a Product with a name and a price.
     *
     * @param name  the product name
     * @param price the product price
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Gets the name of the product.
     *
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of the product.
     *
     * @return the price of the product
     */
    public double getPrice() {
        return price;
    }
}

/**
 * Handles the display of product details.
 */
class ProductDisplay {
    /**
     * Displays product information.
     *
     * @param product the product to be displayed
     */
    public void displayProductInfo(Product product) {
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
    }
}

/**
 * Demonstrates the use of Product and ProductDisplay classes.
 */
public class Single_Responsibility_Principle {
    public static void main(String[] args) {
        // Create a product
        Product product = new Product("Laptop", 999.99);

        // Create a ProductDisplay to show product details
        ProductDisplay productDisplay = new ProductDisplay();

        // Display product information
        productDisplay.displayProductInfo(product);
    }
}

/**
 * This example demonstrates the Single Responsibility Principle (SRP):
 * - The Product class is solely responsible for maintaining product details like name and price.
 * - The ProductDisplay class is solely responsible for displaying product information.
 * By separating these responsibilities, we ensure that changes in product data don't impact product display logic and vice versa. This makes the code easier to maintain and extend.
 */
