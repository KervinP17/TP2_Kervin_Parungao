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
    }

    public int getNombreAnimaux() {
        return nombreAnimaux;
    }

    public Animal[] getAnimaux() {
        return animaux;
    }

//    @Override
//    public String toString() {
//        return "Enclos{" +
//                "nom='" + nom + '\'' +
//                ", nombreAnimaux=" + nombreAnimaux +
//                ", capaciteMax=" + capaciteMax +
//                ", animaux=" + Arrays.toString(animaux) +
//                ", veterinaire=" + veterinaire +
//                ", gardien=" + gardien +
//                '}';
//    }
    @Override
    public String toString() {
        return "Enclos{" + "nom='" + nom + '\'' + ", nombreAnimaux=" + nombreAnimaux + ", capaciteMax=" + capaciteMax + ", animaux=" + Arrays.toString(animaux) + ", veterinaire=" + veterinaire + ", gardien=" + gardien + '}';
    }



    //toString

}
