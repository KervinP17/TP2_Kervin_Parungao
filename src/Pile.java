public class Pile {
    private final int TAILLE_INITIALE = 4;
    private final int RATIO_AGRANDISSEMENT = 2;
    private Gardien[] gardiens;
    private int nbElements;
    private int capacite;

    public Pile() {
        gardiens = new Gardien[TAILLE_INITIALE];
        nbElements = 0;
        capacite = TAILLE_INITIALE;

        System.out.println("size of guardisands is " + gardiens.length);
        System.out.println("gardien 1 is " + gardiens[0]);
        System.out.println("actual gardien size rn is " + Gardien.getCompteurGardiens());
    }

    public void afficher() {
        for (int i = 0; i < getNbElements(); i++)
            System.out.println("I" + i + ": " + getElement(i));
        System.out.println("--------------------");
    }

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

    public int insererALaFin(Gardien gardien) {
        if ( nbElements == capacite ) {
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

    public void setGardiens(Gardien[] gardiens) {
        this.gardiens = gardiens;
    }

    // toSring

//    @Override
//    public String toString() {
//        return ;
//    }
}
