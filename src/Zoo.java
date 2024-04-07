import java.util.Arrays;

public class Zoo {
    private String nom;
    private Pile pileGardiens;
    private File fileVisiteurs;
    private int nombreEnclos;
    private Enclos[] lesEnclos;
    private int nombreTotalAnimaux;

    public Zoo(String nom) {
        this.nom = nom;
        fileVisiteurs = new File();
        pileGardiens = Gardien.pileGardien;
//        pileGardiens.afficher();
        System.out.println(pileGardiens);

    }

    //JUNIT?
    public boolean ajouterEnclos(Enclos[] lesEnclos) {

//        int pointTotal = 0;

//        for (int i = 0; i < pileGardiens.getNbElements(); i++) {
//            pointTotal += pileGardiens.getGardiens()[i].getCompetence();
//        }
//        System.out.println("point total is " + pointTotal);
//        if ( pointTotal < 20 ) {
//
//            return false;
//        }

//        System.out.println("point total is " + Gardien.getPointageTotalGardiens());
        if ( Gardien.getPointageTotalGardiens() < 20 ) {
            return false;
        }

        this.lesEnclos = lesEnclos;
        for (int i = 0; i < Classe.values().length; i++) {
            lesEnclos[i] = this.lesEnclos[i];
        }
        return true;
    }

    public Visiteur retirerVisiteur() {
        String tempNom = fileVisiteurs.getPremier().getValeur().getNom();
        int tempAge = fileVisiteurs.getPremier().getValeur().getAge();
        String[] tempEspece = fileVisiteurs.getPremier().getValeur().getEspeces();

        fileVisiteurs.setPremier(fileVisiteurs.getPremier().suivant);
        return new Visiteur(tempNom, tempAge,tempEspece);
    }

    public void arriveeVisiteur(Visiteur visiteur) {
        if ( visiteur.getAge() >= 65 ) {
            for (int i = 0; i < fileVisiteurs.getNbElements(); i++) {
                if ( fileVisiteurs.getNoeud(i).getValeur().getAge() < 65 ) {
                    fileVisiteurs.insererAuMilieu(visiteur, i);
                    break;
                }
            }
        }
        else {
            fileVisiteurs.insererALaFin(visiteur);
        }
        System.out.println(fileVisiteurs); // printVisiteurs//////////////////////////////////////
    }

    public void ajouterGardien(Gardien gardien) {
        pileGardiens.insererALaFin(gardien);
    }

    public Gardien retirerGardien() {
        int pointTotal = 0;
        Gardien temp = null;

        for (int i = 0; i < pileGardiens.getNbElements(); i++) {
            pointTotal += pileGardiens.getGardiens()[i].getCompetence();
        }
        if ( pointTotal - pileGardiens.getElement(getPileGardiens().getNbElements() - 1).getCompetence() < 20 ) {
            return null;
        }
            System.out.println("On retire le dernier gardien arrivé au zoo: " + pileGardiens.getElement(getPileGardiens().getNbElements() - 1));
            temp = pileGardiens.getElement(getPileGardiens().getNbElements() - 1);
            pileGardiens.setNbElements(pileGardiens.getNbElements() - 1);
        return temp;
    }

    public File getFileVisiteurs() {
        return fileVisiteurs;
    }

    public void setPileGardiens(Pile pileGardiens) {
        this.pileGardiens = pileGardiens;
    }

    public Pile getPileGardiens() {
        return pileGardiens;
    }

    @Override
    public String toString() {
        return pileGardiens + "\nEt la file des visiteurs: \n" + fileVisiteurs + ", nombreEnclos=" + nombreEnclos + ", lesEnclos=" + Arrays.toString(lesEnclos) + '}';
    }

    //toString
}
