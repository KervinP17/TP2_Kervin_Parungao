public class Zoo {
    private String nom;
    private Pile pileGardiens = new Pile();
    private File fileVisiteurs = new File();
    private int nombreEnclos;
    private Enclos[] lesEnclos;
    private int nombreTotalAnimaux;

    public Zoo(String nom) {
        this.nom = nom;
    }

    //JUNIT?
    public boolean ajouterEnclos(Enclos[] lesEnclos) {

//        int pointTotal = 0;
//
//        for (int i = 0; i < pileGardiens.getNbElements(); i++) {
//            pointTotal += pileGardiens.getGardiens()[i].getCompetence();
//        }
//        System.out.println("point total is " + pointTotal);
//        if (pointTotal < 20) {
//
//            return false;
//        }
//        for (int i = 0; i < Classe.values().length; i++) {
//            lesEnclos[i] = this.lesEnclos[i];
//        }
        return true;
    }

    public Visiteur retirerVisiteur() {
        if (fileVisiteurs.getPremier() != null) {
            fileVisiteurs = null;
        }
        else {
            fileVisiteurs.setPremier(fileVisiteurs.getPremier().suivant);
        }
        return new Visiteur(null, -1, null);
    }

    public void arriveeVisiteur(Visiteur visiteur) {
//        if ( visiteur.getAge() >= 65 ) {
//            for (int i = 0; i < fileVisiteurs.getNbElements(); i++) {
//                if ( visiteur.getAge() <= 65 ) {
//                    fileVisiteurs.insererAuMilieu(visiteur, i);
//                }
//            }
//        }
//        else {
            fileVisiteurs.insererALaFin(visiteur);
//        }
    }

    public void ajouterGardien(Gardien gardien) {
//        pileGardiens.insererALaFin(gardien);
    }

    public Gardien retirerGardien() {
//        int pointTotal = 0;
//
//        for (int i = 0; i < pileGardiens.getGardiens().length; i++) {
//            pointTotal += pileGardiens.getGardiens()[i].getCompetence();
//        }
//
//        for (int i = pileGardiens.getNbElements(); i > 0; i--) {
//            if (pointTotal - pileGardiens.getElement(pileGardiens.getNbElements()).getCompetence() > 20) {
//                pileGardiens.setNbElements(pileGardiens.getNbElements() - 1);
//
//            }
//        }
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
