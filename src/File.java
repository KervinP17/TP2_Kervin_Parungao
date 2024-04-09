public class File {
    private Noeud premier;
    private int nbElements;

    public boolean estVide() {
        if ( premier == null ) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getNbElements() {
        return nbElements;
    }

    public Noeud getPremier() {
        return premier;
    }

    public Noeud getNoeud(int index) {
        if ( index < 0 || index >= nbElements ) {
            return null;
        }
        Noeud courant = premier;
        while (index-- != 0) {
            courant = courant.suivant;
        }
        return courant;
    }

    public void setPremier(Noeud premier) {
        this.premier = premier;
    }
    public void setNbElements(int nbElements) {
        this.nbElements = nbElements;
    }

    public int insererAuDebut(Visiteur valeur) {
        Noeud nouveau = new Noeud(valeur);
        nouveau.setSuivant(premier);
        premier = nouveau;
        return ++nbElements;
    }

    public int insererALaFin(Visiteur valeur) {
        if ( premier == null ) {
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
    public void insererAuMilieu(Visiteur valeur, int index) {
        if ( index == 0 ) {
            insererAuDebut(valeur);
            return;
        }
        else if ( index == nbElements ) {
            insererALaFin(valeur);
            return;
        }
        Noeud avant = getNoeud(index - 1);
        if ( avant == null ) {
            return;
        }

        Noeud apres = avant.suivant;
        Noeud nouveau = new Noeud(valeur);
        avant.setSuivant(nouveau);
        nouveau.setSuivant(apres);
        ++nbElements;
    }

    public String toString() {
        String str = "\nEt la file des visiteurs:\n" + nbElements + " visiteurs: ";
        for (Noeud courant = premier; courant != null; courant = courant.suivant)
            str += courant.getValeur() + " -> ";
        str += "[null]";
        return str;
    }
}
