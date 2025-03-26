class TerraceRunner {
    public static void main(String[] args) {
        Terrace terrace = new Terrace();
        
        System.out.println("The default value for total beds is \t" + terrace.totalBeds);
        System.out.println("The default value for type is \t" + terrace.type);
        System.out.println("The default value for area is \t" + terrace.area);
        System.out.println("The default value for hasGrass is \t" + terrace.hasGrass);
        
        terrace.totalBeds = 5;
        terrace.type = "Outdoor Garden Bed";
        terrace.area = 350.75;
        terrace.hasGrass = true;
        
        System.out.println("The values after initialization");
        System.out.println("The total beds: " + terrace.totalBeds);
        System.out.println("The bed type is: " + terrace.type);
        System.out.println("The area is: \t" + terrace.area);
        System.out.println("Does it have grass? " + terrace.hasGrass);
    }
}
