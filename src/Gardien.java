public class Gardien {
    private String nom;
    private int competence;
    private int id;

    public Gardien(String nom, int competence) {
        this.nom = nom;
        this.competence = competence;

        compteurGardiens++;
        pointageTotalGardiens += competence;
    }

    public static int getCompteurGardiens() {
        return compteurGardiens;
    }

    public static int getPointageTotalGardiens() {
        return pointageTotalGardiens;
    }

    public void entrainerAnimal(Animal animal, double temps) {

    }

    public int getCompetence() {
        return competence;
    }

    private static int compteurGardiens = 0;
    private static int pointageTotalGardiens = 0;

    //toString

}