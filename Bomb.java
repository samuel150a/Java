public class Bomb {
    public static void details(String type, String explosiveMaterial, String weight, String detonationMechanism, 
                               String blastRadius, String fuseType, String manufacturingCountry, String activationMethod, 
                               String impactForce, String safetyMeasures) {
        System.out.println("\nBomb Details:");
        System.out.println("- Type: " + type);
        System.out.println("- Explosive Material: " + explosiveMaterial);
        System.out.println("- Weight: " + weight);
        System.out.println("- Detonation Mechanism: " + detonationMechanism);
        System.out.println("- Blast Radius: " + blastRadius);
        System.out.println("- Fuse Type: " + fuseType);
        System.out.println("- Manufacturing Country: " + manufacturingCountry);
        System.out.println("- Activation Method: " + activationMethod);
        System.out.println("- Impact Force: " + impactForce);
        System.out.println("- Safety Measures: " + safetyMeasures);
    }
}