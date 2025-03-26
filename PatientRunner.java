

class PatientRunner {
    public static void main(String[] args) {
        Patient patient = new Patient();
        
        System.out.println("The default value for name is \t" + patient.name);
        System.out.println("The default value for age is \t" + patient.age);
        System.out.println("The default value for disease is \t" + patient.disease);
        System.out.println("The default value for isAdmitted is \t" + patient.isAdmitted);
        
        patient.name = "John Doe";
        patient.age = 45;
        patient.disease = "Flu";
        patient.isAdmitted = true;
        
        System.out.println("The values after initialization");
        System.out.println("The patient name: " + patient.name);
        System.out.println("The patient age: " + patient.age);
        System.out.println("The diagnosed disease: " + patient.disease);
        System.out.println("Is the patient admitted? " + patient.isAdmitted);
    }
}
