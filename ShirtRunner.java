class ShirtRunner {
    public static void main(String[] args) {
        Shirts shirt = new Shirts();
        
        System.out.println("The default value for color is \t" + shirt.color);
        System.out.println("The default value for size is \t" + shirt.size);
        System.out.println("The default value for material is \t" + shirt.material);
        System.out.println("The default value for isIroned is \t" + shirt.isIroned);
        
        shirt.color = "Blue";
        shirt.size = "Medium";
        shirt.material = "Cotton";
        shirt.isIroned = true;
        
        System.out.println("The values after initialization");
        System.out.println("The shirt color: " + shirt.color);
        System.out.println("The shirt size is: " + shirt.size);
        System.out.println("The material is: \t" + shirt.material);
        System.out.println("Is it ironed? " + shirt.isIroned);
    }
}
