public class Entree {
    private int nombreEnclos;
    private Enclos[] lesEnclos;
    private double prix;

    public Entree(Visiteur visiteur, Zoo zoo) {
        System.out.println(visiteur + " achète son billet.");

        for (int i = 0; i < 5; i++) { // temp 5 ////////////////////////////
//            for (int j = 0; j < lesEnclos.length; j++) {


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
}
