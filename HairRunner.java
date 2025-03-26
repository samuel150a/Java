

class HairRunner {
    public static void main(String[] args) {
        Hair hair = new Hair();
        
        System.out.println("The default value for color is \t" + hair.color);
        System.out.println("The default value for length is \t" + hair.length);
        System.out.println("The default value for type is \t" + hair.type);
        System.out.println("The default value for isCurly is \t" + hair.isCurly);
        
        hair.color = "Black";
        hair.length = 25.5;
        hair.type = "Straight";
        hair.isCurly = false;
        
        System.out.println("The values after initialization");
        System.out.println("The hair color: " + hair.color);
        System.out.println("The hair length is: " + hair.length);
        System.out.println("The hair type is: " + hair.type);
        System.out.println("Is it curly? " + hair.isCurly);
    }
}
