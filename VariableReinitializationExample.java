public class VariableReinitializationExample 
{
    public static void main(String[] args) {
       
        int cost = 100;
        int price = 200;
        cost = price; 
        System.out.println("Cost after reassignment: " + cost); 
		
		

        
		
        double weight = 75.5;
        double newWeight = 80.2;
        weight = newWeight; 
        System.out.println("Weight after reassignment: " + weight); 

        
		
        boolean good = true;
        boolean bad = false;
        good = bad; 
        System.out.println("boolean values after reassignment: " + good); 

        
		
		
        String product = "Laptop";
        String newProduct = "Tablet";
        product = newProduct; 
        System.out.println("Product after reassignment: " + product); 
    }
}
