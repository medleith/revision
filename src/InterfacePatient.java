public interface InterfacePatient {
    void ajouterPatient(Patient p);
    void supprimerPatient(Patient p);
    boolean rechercherPatient(Patient p);
    boolean rechercherPatient(int cin);
    void afficherPatients();
    void trierPatientsParNom();
}
