public class Zoo {
    private String nom;
    private Pile pileGardiens;
    private File fileVisiteurs;
    private int nombreEnclos;
    private Enclos[] lesEnclos;
    private int nombreTotalAnimaux;

    public Zoo(String nom) {
        this.nom = nom;
    }

    //JUNIT?
    public boolean ajouterEnclos(Enclos[] lesEnclos) {
        for (int i = 0; i < Classe.values().length; i++) {
            lesEnclos[i] = this.lesEnclos[i];
        }
    }

    public Visiteur retirerVisiteur() {

    }

    public void arriveeVisiteur(Visiteur visiteur) {

    }

    public void ajouterGardien(Gardien gardien) {
    }

    public Gardien retirerGardien() {

    }

    public File getFileVisiteurs() {

        return fileVisiteurs;
    }

    //toString
}
