
class Cricket2 {
    
    static void matchdetails(String day, String... playerNames) {
        System.out.println("Match day: " + day);
        System.out.println("Players:");
        for (String player : playerNames) {
            System.out.println(player);
        }
    }
}
