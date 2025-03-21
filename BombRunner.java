public class BombRunner {
    public static void main(String[] args) {
        System.out.println("Bomb Specifications:");

        Bomb.details("Fragmentation", "TNT", "10 kg", "Timer", "50m", "Impact Fuse", "USA", "Remote Control", "5000N", "Blast Shielding");
        Bomb.details("Thermobaric", "Liquid Explosive", "20 kg", "Barometric Sensor", "200m", "Delay Fuse", "Russia", "Air Pressure Trigger", "10000N", "Thermal Resistant Coating");
        Bomb.details("Nuclear", "Uranium-235", "500 kg", "Nuclear Chain Reaction", "5 km", "Electronic", "Unknown", "High-Energy Compression", "1000000N", "Lead Containment");
        Bomb.details("Cluster", "C4", "15 kg", "Proximity Sensor", "100m", "Proximity Fuse", "Germany", "Laser Guidance", "7500N", "Electronic Deactivation");
        Bomb.details("Incendiary", "Napalm", "8 kg", "Chemical Ignition", "30m", "Contact Fuse", "UK", "Manual Ignition", "3000N", "Fire Suppression System");
    }
}