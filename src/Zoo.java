public class Zoo {
    private String nom;
    private Pile pileGardiens;
    private File fileVisiteurs;
    private int nombreEnclos;
    private Enclos[] lesEnclos;
    private int nombreTotalAnimaux;

    public Zoo(String nom, Pile pileGardiens, File fileVisiteurs, int nombreEnclos, Enclos[] lesEnclos, int nombreTotalAnimaux) {
        this.nom = nom;
        this.pileGardiens = pileGardiens;
        this.fileVisiteurs = fileVisiteurs;
        this.nombreEnclos = nombreEnclos;
        this.lesEnclos = lesEnclos;
        this.nombreTotalAnimaux = nombreTotalAnimaux;
    }

    public boolean ajouterEnclos(Enclos[] lesEnclos) {

    }

    public Visiteur retirerVisiteur() {

    }

    public void arriveeVisiteur(Visiteur visiteur) {

    }

    public void ajouterGardien(Gardien gardien) {

    }

    public Gardien retirerGardien() {

    }

    //toString
}
