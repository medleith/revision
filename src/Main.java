public class Main {
    public static void main(String[] args) {
        // Test Patient class
        Patient patient1 = new Patient(1, "Doe", "John", 12345);
        Patient patient2 = new Patient(2, "Smith", "Jane", 67890);

        System.out.println("Patient 1: " + patient1);
        System.out.println("Patient 2: " + patient2);
        System.out.println("Are patients equal? " + patient1.equals(patient2));

        // Test ListPatients class
        ListPatients listPatients = new ListPatients();
        listPatients.ajouterPatient(patient1);
        listPatients.ajouterPatient(patient2);

        System.out.println("\nList of Patients:");
        listPatients.afficherPatients();
        System.out.println("Search for Patient 1: " + listPatients.rechercherPatient(patient1));
        System.out.println("Search for Patient with Cin 1: " + listPatients.rechercherPatient(1));
        System.out.println("After removing Patient 1:");
        listPatients.supprimerPatient(patient1);
        listPatients.afficherPatients();
        System.out.println("Sorting patients by name:");
        listPatients.trierPatientsParNom();
        listPatients.afficherPatients();

        // Test Medecin class
        Medecin medecin1 = new Medecin(101, "Dr. Smith", "Alice", 1234);
        Medecin medecin2 = new Medecin(102, "Dr. Johnson", "Bob", 5678);

        System.out.println("\nMedecin 1: " + medecin1);
        System.out.println("Medecin 2: " + medecin2);
        System.out.println("Are medecins equal? " + medecin1.equals(medecin2));

        // Test SetMedecins class
        SetMedecins setMedecins = new SetMedecins();
        setMedecins.ajouterMedecin(medecin1);
        setMedecins.ajouterMedecin(medecin2);

        System.out.println("\nSet of Medecins:");
        setMedecins.afficherMedecins();
        System.out.println("Search for Medecin with Cin 101: " + setMedecins.rechercherMedecin(101));
        System.out.println("Number of Medecins: " + setMedecins.nombreMedecins());
        System.out.println("Sorted Medecins:");
        setMedecins.trierMedecins().forEach(System.out::println);

        // Test Hopital class
        Hopital hopital = new Hopital();
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);

        System.out.println("\nHospital Map:");
        hopital.afficherMap();
        System.out.println("Adding patients to Medecin 1:");
        hopital.ajouterPatient(medecin1, patient1);
        hopital.ajouterPatient(medecin1, patient2);
        hopital.afficherMap();

        System.out.println("\nPatients of Medecin 1:");
        hopital.afficherMedcinPatients(medecin1);


    }
}

