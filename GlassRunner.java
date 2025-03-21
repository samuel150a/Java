public class GlassRunner {
    public static void main(String[] args) {
        System.out.println("Glass Seller and Buyer Information:");

        // Seller Details
        Glass.seller("John Doe", "Crystal Glass Store", "New York", "123-456-7890", "4.5 Stars");
        Glass.seller("Emma Smith", "Elite Glass Works", "Los Angeles", "987-654-3210", "4.7 Stars");

        // Buyer Details
        Glass.buyer("Alice Johnson", "123 Main St, NY", "alice@example.com", "555-1234", "Tempered Glass");
        Glass.buyer("Michael Brown", "456 Elm St, CA", "michael@example.com", "555-5678", "Frosted Glass");
        Glass.buyer("Sophia Wilson", "789 Oak St, TX", "sophia@example.com", "555-9876", "Laminated Glass");
    }
}