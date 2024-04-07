public class Gardien {
    private String nom;
    private int competence;
    private int id;


    public Gardien(String nom, int competence) {
        this.nom = nom;
        this.competence = competence;

        compteurGardiens++;
    }


    public void entrainerAnimal(Animal animal, double temps) {

    }

    public int getCompetence() {
        return competence;
    }

    public static int compteurGardiens = 0;

    //toString

}