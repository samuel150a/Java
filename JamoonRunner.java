class JamoonRunner {
    public static void main(String[] args) {
        Jamoon jamoon = new Jamoon();
        
        System.out.println("The default value for color is \t" + jamoon.color);
        System.out.println("The default value for weight is \t" + jamoon.weight);
        System.out.println("The default value for taste is \t" + jamoon.taste);
        System.out.println("The default value for isSweet is \t" + jamoon.isSweet);
        
        jamoon.color = "Purple";
        jamoon.weight = 20.5;
        jamoon.taste = "Sweet and Juicy";
        jamoon.isSweet = true;
        
        System.out.println("The values after initialization");
        System.out.println("The jamoon color: " + jamoon.color);
        System.out.println("The jamoon weight is: " + jamoon.weight);
        System.out.println("The jamoon taste is: " + jamoon.taste);
        System.out.println("Is it sweet? " + jamoon.isSweet);
    }
}
