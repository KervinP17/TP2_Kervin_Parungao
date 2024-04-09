public class Zoo {
    private String nom;
    private Pile pileGardiens;
    private File fileVisiteurs;
    private int nombreEnclos;
    private Enclos[] lesEnclos;
    private int nombreTotalAnimaux = Animal.getNbAnimalTotal();

    public Zoo(String nom) {
        this.nom = nom;
        fileVisiteurs = new File();
        pileGardiens = Gardien.pileGardien;
//        pileGardiens.afficher();
//        System.out.println(pileGardiens);
//        System.out.println(fileVisiteurs);
        System.out.println(this); //temp=======================================================================
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
            nombreEnclos++;
        }
        return true;
    }

    public Visiteur retirerVisiteur() {
        String tempNom = fileVisiteurs.getPremier().getValeur().getNom();
        int tempAge = fileVisiteurs.getPremier().getValeur().getAge();
        String[] tempEspece = fileVisiteurs.getPremier().getValeur().getEspeces();

        fileVisiteurs.setPremier(fileVisiteurs.getPremier().suivant);
        fileVisiteurs.setNbElements(fileVisiteurs.getNbElements() - 1);
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
//        System.out.println(fileVisiteurs); // printVisiteurs//////////////////////////////////////
    }

    public void ajouterGardien(Gardien gardien) {
    }

    public void retirerGardien() {
        System.out.println("xp total avant: " + Gardien.getPointageTotalGardiens() + " points" );
        Gardien temp = null;

        if ( Gardien.getPointageTotalGardiens() - pileGardiens.getElement(getPileGardiens().getNbElements() - 1).getCompetence() < 20 ) {
            System.out.println("On ne peut enlever le gardien " + pileGardiens.getElement(getPileGardiens().getNbElements() - 1) + " parce que les points\n" +
                    "d'expérience < 20");
            return;
        }
        System.out.println("On retire le dernier gardien arrivé au zoo: " + pileGardiens.getElement(getPileGardiens().getNbElements() - 1));
        Gardien.setPointageTotalGardiens(Gardien.getPointageTotalGardiens() - pileGardiens.getElement(getPileGardiens().getNbElements() - 1).getCompetence());
        temp = pileGardiens.getElement(getPileGardiens().getNbElements() - 1);
        pileGardiens.setElement(getPileGardiens().getNbElements() - 1, null);
        pileGardiens.setNbElements(pileGardiens.getNbElements() - 1);

        System.out.println("xp total apres: " + Gardien.getPointageTotalGardiens() + " points" );/// 23423423423
        System.out.println("testestestestes:     " + pileGardiens); ///234234234
    }

    public File getFileVisiteurs() {
        return fileVisiteurs;
    }

//    public void setPileGardiens(Pile pileGardiens) {
//        this.pileGardiens = pileGardiens;
//    }

    public Pile getPileGardiens() {
        return pileGardiens;
    }

    @Override
    public String toString() {
        String str = "";
        str += "" + pileGardiens + fileVisiteurs + "\n" + "Le zoo est peuplé avec " + nombreTotalAnimaux + " animaux. Il y a " + nombreEnclos + " enclos.\n";
        for (int i = 0; i < nombreEnclos; i++) {
            str += lesEnclos[i];
        }
        return str;
    }

    public int getNombreEnclos() {
        return nombreEnclos;
    }

    public Enclos[] getLesEnclos() {
        return lesEnclos;
    }

    public String getNom() {
        return nom;
    }

    //toString
}
