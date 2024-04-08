public class Gardien {
    private String nom;
    private int competence;
    private int id;
    public static Pile pileGardien = new Pile();

    public Gardien(String nom, int competence) {
        this.nom = nom;
        this.competence = competence;

        compteurGardiens++;
        pointageTotalGardiens += competence;
        pileGardien.insererALaFin(this);

//        System.out.println("apile " + pileGardien);
    }

    public static int getCompteurGardiens() {
        return compteurGardiens;
    }

    public static int getPointageTotalGardiens() {
        return pointageTotalGardiens;
    }

    public static Pile getPileGardien() {
        return pileGardien;
    }

    public void entrainerAnimal(Animal animal, double temps) {
        double poids = animal.getPoids();
        if ( temps < 10 ) {
            animal.setPoids(poids * 1.01);
        }
        else if ( temps > 10 && temps < 30) {
            animal.setPoids(poids * 0.98);
        }
        else {
            animal.setPoids(poids * 0.95);
        }
    }

    public int getCompetence() {
        return competence;
    }

    private static int compteurGardiens = 0;
    private static int pointageTotalGardiens = 0;

    @Override
    public String toString() {
        return "[" + nom + ", " + competence + "] ";
    }

    //toString

}