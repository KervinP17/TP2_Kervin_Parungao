public class Entree {
    private int nombreEnclos = 0;
    private Enclos[] lesEnclos;
    private double prix;

    public Entree(Visiteur visiteur, Zoo zoo) {
        lesEnclos = new Enclos[zoo.getNombreEnclos()];
        System.out.println(visiteur + " achète son billet.");
        prix = 10;

        for (int i = 0; i < zoo.getNombreEnclos(); i++) {
            for (int j = 0; j < zoo.getLesEnclos()[i].getAnimaux().length; j++) {
//                System.out.println(zoo.getLesEnclos()[i].getAnimaux()[j].toString());
                for (int k = 0; k < visiteur.getEspeces().length; k++) {
                    if (visiteur.getEspeces()[k].equals(zoo.getLesEnclos()[i].getAnimaux()[j].getEspece())) {
                        System.out.println( visiteur.getEspeces()[k] + " == " + zoo.getLesEnclos()[i].getAnimaux()[j].getEspece() + " that is inside " + zoo.getLesEnclos()[i] );
                        nombreEnclos++;
                        for (int l = 0; l < zoo.getNombreEnclos(); l++) {
                            if (lesEnclos[l] == null) {
                                lesEnclos[l] = zoo.getLesEnclos()[i];
                                prix += lesEnclos[l].getNombreAnimaux();
                                break;
                            }

                            System.out.println("visiteur peut visiter " + zoo.getLesEnclos()[i].getNom());

                        }
                    }
                }
            }
            System.out.println("visiteur peut visiter " + nombreEnclos);



//            for (int j = 0; j < lesEnclos.length; j++) {
//                if ( visiteur.getEspeces()[0] )
//            }
        }

        if (visiteur.getAge() < 12) {
            prix = 0.0;
        }
        else if (visiteur.getAge() <= 17) {
            prix /= 2;
        }
        else if (visiteur.getAge() >= 65) {
            prix /= 2;
        }

//        if ( == null) {
//
//        }

    }

    public int getNombreEnclos() {
        return nombreEnclos;
    }

    public Enclos[] getEnclos() {
        return lesEnclos;
    }

    public double getPrix() {
        return prix;
    }

    public void afficherEnclos() {

    }

    public void ajouterEnclos(Enclos enclos) {

    }
}
