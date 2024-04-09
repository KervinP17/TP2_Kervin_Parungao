import java.util.Arrays;

public class Enclos {
    private String nom;
    private int nombreAnimaux;
    private int capaciteMax;
    private Animal[] animaux;
    private Veterinaire veterinaire;
    private Gardien gardien;

    public Enclos(String nom, int capaciteMax, Veterinaire veterinaire, Gardien gardien) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.veterinaire = veterinaire;
        this.gardien = gardien;
    }

    public Gardien getGardien() {
        if ( gardien == null ) {
            return null;
        }
        return gardien;
    }

    public Veterinaire getVeterinaire() {
        return veterinaire;
    }

    public void ajouterAnimaux(Animal[] lesAnimaux) {
        animaux = lesAnimaux;
        nombreAnimaux = animaux.length;
    }

    public int getNombreAnimaux() {
        return nombreAnimaux;
    }

    public Animal[] getAnimaux() {
        return animaux;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        String str = "";
        str += "L'enclos '" + nom + "' est peuplé avec " + nombreAnimaux + " animaux. Sa capacité est de " + capaciteMax + ". Le veterinaire assigné est " + veterinaire + ". Le gardien actuel est " + gardien + ".\n" + "Les animaux dans cet enclos:\n";

        for (int i = 0; i < nombreAnimaux; i++) {
            str += animaux[i];
        }

        return str;
    }
}
