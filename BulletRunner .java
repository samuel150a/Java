public class BulletRunner {
    public static void main(String[] args) {
        System.out.println("Bullet Specifications:");

        Bullet.displayInfo("9mm", "Full Metal Jacket", "115 grains", "1200 m/s", "Winchester");
        Bullet.displayInfo("5.56mm", "Hollow Point", "62 grains", "940 m/s", "Federal Premium");
        Bullet.displayInfo("7.62mm", "Armor Piercing", "147 grains", "850 m/s", "Hornady");
        Bullet.displayInfo(".45 ACP", "Soft Point", "230 grains", "850 m/s", "Remington");
        Bullet.displayInfo(".50 BMG", "Tracer", "660 grains", "880 m/s", "Lapua");
    }
}