import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Hopital {
    public Map<Medecin,ListPatients> medecinPatiens;

    public Hopital(){
        medecinPatiens = new TreeMap<>(Comparator.comparingInt(Medecin::getCin));
    }

    public void ajouterMedecin(Medecin m){
        medecinPatiens.putIfAbsent(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p){
        if(medecinPatiens.containsKey(m)){
            medecinPatiens.get(m).ajouterPatient(p);
        } else {
            ListPatients patients = new ListPatients();
            patients.ajouterPatient(p);
            medecinPatiens.put(m, patients);
        }
    }

    public void afficherMap() {
        medecinPatiens.forEach((medecin, patients) -> {
            System.out.println("Medecin: " + medecin);
            patients.afficherPatients();
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        if (medecinPatiens.containsKey(m)) {
            System.out.println("Patients du Medecin " + m.getNom() + ":");
            medecinPatiens.get(m).afficherPatients();
        } else {
            System.out.println("Le médecin " + m.getNom() + " n'a pas de patients.");
        }
    }
}
