public class Entree {
    private int nombreEnclos = 0;
    private Enclos[] lesEnclos;
    private double prix;

    public Entree(Visiteur visiteur, Zoo zoo) {
        lesEnclos = new Enclos[zoo.getNombreEnclos()];
        System.out.println(visiteur + " achète son billet.");
        prix = 0;

        for (int i = 0; i < zoo.getNombreEnclos(); i++) {
            for (int j = 0; j < zoo.getLesEnclos()[i].getAnimaux().length; j++) {

                for (int k = 0; k < visiteur.getEspeces().length; k++) {
                    if (visiteur.getEspeces()[k].equals(zoo.getLesEnclos()[i].getAnimaux()[j].getEspece())) {
                        for (int l = 0; l < zoo.getNombreEnclos(); l++) {
                            if (lesEnclos[l] == zoo.getLesEnclos()[i]) {
                                break;
                            }
                            else if (lesEnclos[l] == null) {
                                lesEnclos[l] = zoo.getLesEnclos()[i];
                                prix += lesEnclos[l].getNombreAnimaux() + 10;
                                nombreEnclos++;
                                break;
                            }
                        }
                    }
                }
            }
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
        String str = "";
        str += "Ce billet permettra de visiter " + nombreEnclos + " enclos: ";
        for (int i = 0; i < nombreEnclos; i++) {
            if (i == nombreEnclos - 1) {
                str += lesEnclos[i].getNom();
            }
            else {
                str += lesEnclos[i].getNom() + ", ";
            }
        }
        System.out.println(str);
    }

    public void ajouterEnclos(Enclos enclos) {

    }
}
