class IronBoxRunner {
    public static void main(String[] args) {
        IronBox ironBox = new IronBox();
        
        System.out.println("The default value for brand is \t" + ironBox.brand);
        System.out.println("The default value for power is \t" + ironBox.power);
        System.out.println("The default value for type is \t" + ironBox.type);
        System.out.println("The default value for isAutomatic is \t" + ironBox.isAutomatic);
        
        ironBox.brand = "Philips";
        ironBox.power = 1500.0;
        ironBox.type = "Steam Iron";
        ironBox.isAutomatic = true;
        
        System.out.println("The values after initialization");
        System.out.println("The iron box brand: " + ironBox.brand);
        System.out.println("The power consumption is: " + ironBox.power + "W");
        System.out.println("The iron box type is: " + ironBox.type);
        System.out.println("Is it automatic? " + ironBox.isAutomatic);
    }
}
