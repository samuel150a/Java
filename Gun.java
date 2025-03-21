public class Gun {
    public static void displayInfo(String name, String type, String caliber, String magazineCapacity, 
                                   String manufacturer, String weight, String range, String price) {
        System.out.println("\nGun Details:");
        System.out.println("- Name: " + name);
        System.out.println("- Type: " + type);
        System.out.println("- Caliber: " + caliber);
        System.out.println("- Magazine Capacity: " + magazineCapacity);
        System.out.println("- Manufacturer: " + manufacturer);
        System.out.println("- Weight: " + weight);
        System.out.println("- Range: " + range);
        System.out.println("- Price: " + price);
    }
}