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

    //unfinished toString
    @Override
    public String toString() {
        return "Noeud{" +
                "valeur='" + valeur + '\'' +
                ", suivant=" + suivant +
                '}';
    }


    public Visiteur getValeur() {
        return valeur;
    }
}
