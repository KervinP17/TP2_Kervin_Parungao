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
        System.out.println("gardien responsible for " + nom + " is: " + gardien);
        return gardien;
    }

    public Veterinaire getVeterinaire() {
        return veterinaire;
    }

    public void ajouterAnimaux(Animal[] lesAnimaux) {
//        for (int i = 0; i < animaux.length; i++) {
//            if (lesAnimaux[i] == lesAnimaux[i]) {
//                break;
//            } else if (animaux[i] == null) {
//                lesEnclos[i] = zoo.getLesEnclos()[i];
//                prix += lesEnclos[i].getNombreAnimaux() + 10;
//                nombreEnclos++;
//                break;
//            }
//        }
        animaux = lesAnimaux;
        nombreAnimaux = animaux.length;
        System.out.println("number of animals in this enclos: " + animaux.length);
    }

    public int getNombreAnimaux() {
        return nombreAnimaux;
    }

    public Animal[] getAnimaux() {
        return animaux;
    }
    @Override
    public String toString() {
        return "/*****guardian inside enclos: " + gardien + ".*********\n" + "L'enclos '" + nom + "' est peuplé avec " + nombreAnimaux + " animaux. Sa capacité est de " + capaciteMax + ". Le veterinaire assigné est " + veterinaire + ". Le gardien actuel est " + gardien + ".\n" + "Les animaux dans cet enclos:\n" + Arrays.toString(animaux);
    }

    public String getNom() {
        return nom;
    }
}
