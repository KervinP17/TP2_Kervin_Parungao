public class Noeud {
    private Visiteur valeur;
    public Noeud suivant;

    public Noeud(Visiteur pValeur) {
        valeur = pValeur;
        suivant = null;
    }

    public Noeud getSuivant() {
        return suivant;
    }

    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    public Visiteur getValeur() {
        return valeur;
    }
}