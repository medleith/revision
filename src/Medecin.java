import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Medecin implements Comparable<Medecin>{
    private int cin;
    private String nom;
    private String prenom;
    private int numOrdre;

    public Medecin(int cin, String nom, String prenom, int numOrdre) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numOrdre = numOrdre;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumOrdre() {
        return numOrdre;
    }

    public String toString() {
        return "Medecin [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", numOrdre=" + numOrdre + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Medecin medecin = (Medecin) obj;
        return cin == medecin.cin && numOrdre == medecin.numOrdre;
    }

    @Override
    public int compareTo(Medecin o) {
        return 0;
    }
}

class SetMedecins {
    private Set<Medecin> setM;

    public SetMedecins(){
        setM = new HashSet<>();
    }

    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }

    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(medecin -> medecin.getCin() == cin);
    }

    public void afficherMedecins() {
        setM.forEach(System.out::println);
    }

    public long nombreMedecins() {
        return setM.size();
    }

    public TreeSet<Medecin> trierMedecins() {
        return new TreeSet<>(this.setM);
    }
}

