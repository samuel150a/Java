class BedRunner {
    public static void main(String[] args) {
        Bed bed = new Bed();
        
        System.out.println("The default value for total beds is \t" + bed.totalBeds);
        System.out.println("The default value for type is \t" + bed.type);
        System.out.println("The default value for area is \t" + bed.area);
        System.out.println("The default value for hasGrass is \t" + bed.hasGrass);
        
        bed.totalBeds = 5;
        bed.type = "Outdoor Garden Bed";
        bed.area = 350.75;
        bed.hasGrass = true;
        
        System.out.println("The values after initialization");
        System.out.println("The total beds: " + bed.totalBeds);
        System.out.println("The bed type is: " + bed.type);
        System.out.println("The area is: \t" + bed.area);
        System.out.println("Does it have grass? " + bed.hasGrass);
    }
}
