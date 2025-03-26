 class CraneRunner {
    public static void main(String[] args) {
        Crane crane = new Crane();
        
        System.out.println("The default value for model is \t" + crane.model);
        System.out.println("The default value for capacity is \t" + crane.capacity);
        System.out.println("The default value for type is \t" + crane.type);
        System.out.println("The default value for isOperational is \t" + crane.isOperational);
        
        crane.model = "Liebherr LTM 11200-9.1";
        crane.capacity = 1200;
        crane.type = "Mobile Crane";
        crane.isOperational = true;
        
        System.out.println("The values after initialization");
        System.out.println("The crane model: " + crane.model);
        System.out.println("The crane capacity: " + crane.capacity + " tons");
        System.out.println("The crane type: " + crane.type);
        System.out.println("Is the crane operational? " + crane.isOperational);
    }
}
