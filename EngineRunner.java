public class EngineRunner {
    public static void main(String[] args) {
        System.out.println("Engine Specifications:");

        Engine.displayInfo("Internal Combustion", "Petrol", "2.0L", "200 HP", "300 Nm",
                           "4", "Inline", "10.5:1", "Naturally Aspirated", "Liquid Cooling",
                           "Spark Ignition", "Direct Injection", "7000 RPM", "Euro 6", "150 kg",
                           "800x600x500 mm", "25 km/l", "70 dB", "15,000 km", "Aluminum Alloy",
                           "Wet Sump", "No", "200 kW", "Fast", "High");

        Engine.displayInfo("Electric", "Battery", "N/A", "250 HP", "400 Nm",
                           "N/A", "N/A", "N/A", "Electric Motor", "Air Cooling",
                           "Electronic", "N/A", "15,000 RPM", "Zero Emissions", "180 kg",
                           "750x500x400 mm", "90%", "50 dB", "50,000 km", "Carbon Fiber",
                           "Sealed Bearing", "Yes", "250 kW", "Instant", "Very High");

        Engine.displayInfo("Diesel", "Diesel", "3.0L", "250 HP", "500 Nm",
                           "6", "V6", "16.0:1", "Turbocharged", "Liquid Cooling",
                           "Compression Ignition", "Common Rail", "6000 RPM", "Euro 5", "220 kg",
                           "900x700x600 mm", "15 km/l", "75 dB", "20,000 km", "Cast Iron",
                           "Dry Sump", "Yes", "300 kW", "Moderate", "Very High");

        Engine.displayInfo("Hybrid", "Hybrid", "1.8L + Electric", "180 HP", "350 Nm",
                           "4", "Inline", "12.0:1", "Turbo Hybrid", "Liquid Cooling",
                           "Electronic Ignition", "Hybrid System", "8000 RPM", "Euro 6", "200 kg",
                           "850x650x550 mm", "50 km/l", "65 dB", "30,000 km", "Aluminum + Copper",
                           "Wet Sump", "Yes", "350 kW", "Quick", "High");

        Engine.displayInfo("Motorcycle Engine", "Petrol", "1.2L", "150 HP", "200 Nm",
                           "2", "Parallel Twin", "11.5:1", "Supercharged", "Liquid Cooling",
                           "Spark Ignition", "EFI", "12,000 RPM", "BS6", "80 kg",
                           "500x400x300 mm", "40 km/l", "60 dB", "10,000 km", "Titanium Alloy",
                           "Wet Sump", "Yes", "120 kW", "Very Quick", "High");
    }
}