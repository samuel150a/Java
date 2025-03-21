// CricketRunner.java (Runner Class to Call Cricket.matchdetails)
class CricketRunner1 {
    public static void main(String[] args) {
        String day = "Monday";
        // Calling matchdetails method with varargs
        Cricket2.matchdetails(day, "Kohli", "Rohit", "Dhoni");
        Cricket2.matchdetails(day, "Sachin", "Dravid"); // Another call with different names
        Cricket2.matchdetails(day); // Call without players
    }
}
