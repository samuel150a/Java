public class GunRunner {
    public static void main(String[] args) {
        System.out.println("Gun Specifications:");

        Gun.displayInfo("Glock 19", "Pistol", "9mm", "15 rounds", "Glock", "670g", "50m", "$500");
        Gun.displayInfo("AK-47", "Assault Rifle", "7.62mm", "30 rounds", "Kalashnikov Concern", "4.3kg", "400m", "$1000");
        Gun.displayInfo("M16", "Rifle", "5.56mm", "30 rounds", "Colt", "3.5kg", "550m", "$1200");
        Gun.displayInfo("Desert Eagle", "Handgun", ".50 AE", "7 rounds", "Magnum Research", "2kg", "200m", "$1500");
        Gun.displayInfo("Remington 870", "Shotgun", "12 gauge", "6 rounds", "Remington Arms", "3.2kg", "40m", "$600");
    }
}