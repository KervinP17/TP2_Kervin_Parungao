import javax.swing.plaf.basic.BasicDesktopPaneUI;

public class File {
    private Noeud premier;
    private int nbElements;

    public boolean estVide() {
        if (premier.suivant == null) {
            System.out.println("vide");
            return true;

        }

        else {
            System.out.println("pas vide");
            return false;
        }
    }

    public int getNbElements() {
        return nbElements;
    }

    public Noeud getPremier() {
        return premier;
    }

    public void setPremier(Noeud premier) {
        this.premier = premier;
    }

    private Noeud getNoeud(int index) {
        if (index < 0 || index >= nbElements) {
            return null;
        }
        Noeud courant = premier;
        while (index-- != 0) {
            courant = courant.suivant;
        }
        return courant;
    }

    public int insererAuDebut(Visiteur valeur) {
        Noeud nouveau = new Noeud(valeur);
        nouveau.setSuivant(premier);
        premier = nouveau;
        return ++nbElements;
    }

    public int insererALaFin(Visiteur valeur) {
        if (premier == null) {
            return insererAuDebut(valeur);
        }

        Noeud courant = premier;
        while (courant.getSuivant() != null) {
            courant = courant.getSuivant();
        }

        Noeud nouveau = new Noeud(valeur);
        courant.setSuivant(nouveau);
        return ++nbElements;
    }
//    public int insererAuMilieu(Visiteur valeur, int index) {
//        if (index == 0) {
//            return insererAuDebut(valeur);
//        }
//        else if (index == nbElements) {
//            return insererALaFin(valeur);
//        }
//        Noeud avant = getNoeud(index - 1);
//        if (avant == null) {
//            return -1;
//        }
//
//        Noeud apres = avant.suivant;
//        Noeud nouveau = new Noeud(valeur);
//        avant.setSuivant(nouveau);
//        nouveau.setSuivant(apres);
//        return ++nbElements;
//    }

    //toString

    public String toString() {
        String str = "";
        str += nbElements;
        str += " noeuds: ";
        for (Noeud courant = premier; courant != null; courant = courant.suivant)
            str += courant.getValeur() + " -> ";
        str += "[null]";
        return str;
    }
}
