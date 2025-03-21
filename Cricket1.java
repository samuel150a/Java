import java.util.Arrays;

public class Cricket1 {
    
    // Method 1: Display match details (accepts player names and match day)
    public void matchDetails(String day, String... playerNames) {
        System.out.println("Match Day: " + day);
        System.out.println("Players in the match:");
        for (String player : playerNames) {
            System.out.println("- " + player);
        }
    }

    // Method 2: Calculate average score of a player (accepts player name, number of matches, and total runs)
    public void matchDetails(String playerName, int numberOfMatches, int totalRuns) {
        double average = (double) totalRuns / numberOfMatches;
        System.out.println("Player: " + playerName + " | Matches: " + numberOfMatches + " | Average Score: " + average);
    }

    // Method 3: Calculate average score for multiple players (accepts player names, scores, and number of matches)
    public void matchDetails(String[] playerNames, int[] scores, int matches) {
        System.out.println("Player Average Scores:");
        for (int i = 0; i < playerNames.length; i++) {
            double average = (double) scores[i] / matches;
            System.out.println(playerNames[i] + " | Avg Score: " + average);
        }
    }

    // Explore Arrays class methods
    public void exploreArrays() {
        int[] scores = {45, 78, 12, 89, 56, 23};

        // Sorting the array
        Arrays.sort(scores);
        System.out.println("Sorted Scores: " + Arrays.toString(scores));

        // Searching for an element
        int searchIndex = Arrays.binarySearch(scores, 56);
        System.out.println("Index of 56: " + searchIndex);

        // Copying an array
        int[] copiedScores = Arrays.copyOf(scores, scores.length);
        System.out.println("Copied Scores: " + Arrays.toString(copiedScores));

        // Filling an array
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 100);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));
    }

    public static void main(String[] args) {
        Cricket cricket = new Cricket();

        // Match details with player names
        cricket.matchDetails("Sunday", "Virat", "Rohit", "Dhoni");

        // Average score of a single player
        cricket.matchDetails("Virat Kohli", 200, 10000);

        // Average scores of multiple players
        String[] players = {"Sachin", "Dravid", "Sehwag"};
        int[] scores = {18426, 13288, 8586};
        cricket.matchDetails(players, scores, 463);

        // Exploring Arrays class
        cricket.exploreArrays();
    }
}