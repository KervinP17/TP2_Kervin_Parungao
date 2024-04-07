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
        int pointTotal = 0;



        for (int i = 0; i < pileGardiens.getNbElements(); i++) {
            pointTotal += pileGardiens.getGardiens()[i].getCompetence();
        }
        if (pointTotal < 20) {
            return false;
        }
        for (int i = 0; i < Classe.values().length; i++) {
            lesEnclos[i] = this.lesEnclos[i];
        }
        return true;
    }

    public Visiteur retirerVisiteur() {
        if (fileVisiteurs.getPremier() != null) {
            fileVisiteurs = null;
        }
        else {
            fileVisiteurs.setPremier(fileVisiteurs.getPremier().suivant);
        }
        return null;
    }

    public void arriveeVisiteur(Visiteur visiteur) {

    }

    public void ajouterGardien(Gardien gardien) {
    }

    public Gardien retirerGardien() {
        int pointTotal = 0;

        for (int i = 0; i < pileGardiens.getGardiens().length; i++) {
            pointTotal += pileGardiens.getGardiens()[i].getCompetence();
        }

        for (int i = pileGardiens.getNbElements(); i > 0; i--) {
            if (pointTotal - pileGardiens.getElement(pileGardiens.getNbElements()).getCompetence() > 20) {
                pileGardiens.setNbElements(pileGardiens.getNbElements() - 1);

            }
        }
        return null;
    }

    public File getFileVisiteurs() {

        return fileVisiteurs;
    }

    public void setPileGardiens(Pile pileGardiens) {
        this.pileGardiens = pileGardiens;
    }

    //toString
}
