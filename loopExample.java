public class loopExample {
    public static void main(String[] args) {
        
        
        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        
		
        int number = 5;
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

       
	   
        int p= 1;
        System.out.println("While Loop Output:");
        while (p <= 5) {
            System.out.print(p + " ");
            p++;
        }
        System.out.println();

        
		
        System.out.println("For Loop Output:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 

       
       

	   int day = 3;
        System.out.println("Switch Statement Output:");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}
