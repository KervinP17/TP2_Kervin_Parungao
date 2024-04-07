public class Pile {
    private final int TAILLE_INITIALE = 4;
    private final int RATIO_AGRANDISSEMENT = 2;
    private Gardien[] gardiens;
    private int nbElements;
    private int capacite;

    public Gardien[] getGardiens() {
        return gardiens;
    }

    public int getNbElements() {
        return nbElements;
    }

    public Gardien getElement(int index) {
        return gardiens[index];
    }

    public void setNbElements(int nbElements) {
        this.nbElements = nbElements;
    }

    public int insererFin(Gardien gardien) {
        if (nbElements == capacite) {
            agrandir();
        }
        gardiens[nbElements] = gardien;
        return nbElements++;
    }

    public void agrandir() {
        capacite *= RATIO_AGRANDISSEMENT;
        Gardien[] temp = new Gardien[capacite];
        for (int i = 0; i < nbElements; i++) {
            temp[i] = gardiens[i];
        }
        gardiens = temp;
    }

    // toSring

//    @Override
//    public String toString() {
//        return ;
//    }
}
