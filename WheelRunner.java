public class WheelRunner {
    public static void main(String[] args) {
        System.out.println("Wheel Specifications:");

        Wheel.info("Michelin", "Radial", "18 inches", "Rubber", "Asymmetric", 
                   "500kg", "W (270 km/h)", "Car", "5 years", "$200");

        Wheel.info("Bridgestone", "Tubeless", "16 inches", "Rubber", "Directional", 
                   "600kg", "V (240 km/h)", "SUV", "4 years", "$180");

        Wheel.info("Goodyear", "Bias-Ply", "15 inches", "Synthetic Rubber", "Symmetric", 
                   "450kg", "H (210 km/h)", "Truck", "6 years", "$150");

        Wheel.info("Pirelli", "Performance", "19 inches", "Silica Blend", "Directional", 
                   "550kg", "Y (300 km/h)", "Sports Car", "3 years", "$250");

        Wheel.info("Dunlop", "All-Terrain", "17 inches", "Rubber Compound", "Aggressive", 
                   "700kg", "S (180 km/h)", "Off-Road", "5 years", "$220");
    }
}