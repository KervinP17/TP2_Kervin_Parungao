public class File {
    private Noeud premier;
    private int nbElements;

    public boolean estVide() {
        if (premier.suivant == null) {
            return true;
        }
        else return false;
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

    //toString
}
