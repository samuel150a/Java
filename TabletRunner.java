public class TabletRunner {
    public static void main(String[] args) {
        System.out.println("Tablet Details:");

        Tablet.details("Paracetamol", "Dissolves in the body.", "Helps in curing illness.", "Does not relieve pain.", "Does not react.");
        Tablet.details("Ibuprofen", "Dissolves in the body.", "Does not cure illness.", "Provides pain relief.", "Does not react.");
        Tablet.details("Aspirin", "Dissolves in the body.", "Helps in curing illness.", "Provides pain relief.", "Reacts with body fluids.");
        Tablet.details("Amoxicillin", "Does not dissolve.", "Helps in curing illness.", "Does not relieve pain.", "Does not react.");
        Tablet.details("Vitamin C", "Dissolves in the body.", "Does not cure illness.", "Does not relieve pain.", "Reacts with body fluids.");
    }
}