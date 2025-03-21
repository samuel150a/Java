public class Glass {
    public static void seller(String name, String shopName, String location, String contact, String rating) {
        System.out.println("\nSeller Details:");
        System.out.println("- Name: " + name);
        System.out.println("- Shop Name: " + shopName);
        System.out.println("- Location: " + location);
        System.out.println("- Contact: " + contact);
        System.out.println("- Rating: " + rating);
    }

    public static void buyer(String name, String address, String email, String phone, String preferredType) {
        System.out.println("\nBuyer Details:");
        System.out.println("- Name: " + name);
        System.out.println("- Address: " + address);
        System.out.println("- Email: " + email);
        System.out.println("- Phone: " + phone);
        System.out.println("- Preferred Glass Type: " + preferredType);
    }
}