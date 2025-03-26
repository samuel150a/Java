class AnchorRunner {
    public static void main(String[] args) {
        Anchor anchor = new Anchor();
        
        System.out.println("The default value for material is \t" + anchor.material);
        System.out.println("The default value for weight is \t" + anchor.weight);
        System.out.println("The default value for type is \t" + anchor.type);
        System.out.println("The default value for isRustProof is \t" + anchor.isRustProof);
        
        anchor.material = "Iron";
        anchor.weight = 15.5;
        anchor.type = "Boat Anchor";
        anchor.isRustProof = false;
        
        System.out.println("The values after initialization");
        System.out.println("The anchor material: " + anchor.material);
        System.out.println("The anchor weight is: " + anchor.weight);
        System.out.println("The anchor type is: " + anchor.type);
        System.out.println("Is it rust-proof? " + anchor.isRustProof);
    }
}
