class Product {
    String name;
    int price;
    float weight;
    boolean isAvailable;

    // Constructor to initialize values
    public Product(String name, int price, float weight, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.isAvailable = isAvailable;
    }

    // Display method
    public void display() {
        System.out.println(name + " - Price: $" + price + ", Weight: " + weight + "kg, Available: " + isAvailable);
    }

    // Re-initialize values
    public void update(int price, float weight, boolean isAvailable) {
        this.price = price;
        this.weight = weight;
        this.isAvailable = isAvailable;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        // Creating objects
        Product soap = new Product("Soap", 50, 0.25f, true);
        Product watch = new Product("Watch", 2000, 0.5f, true);
        Product napkin = new Product("Napkin", 30, 0.1f, true);

        // Display initial values
        soap.display();
        watch.display();
        napkin.display();

        // Re-initialize and display updated values
        soap.update(55, 0.3f, false);
        watch.update(1800, 0.45f, true);
        napkin.update(35, 0.15f, true);

        System.out.println("\nAfter Update:");
        soap.display();
        watch.display();
        napkin.display();
    }
}
