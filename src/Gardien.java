public class Gardien {
    private String nom;
    private int competence;
    private int id;
    private static int idDisponible = 999;
    public static Pile pileGardien = new Pile(); // Pas capable de la mettre private. Ne sait pas comment la modifier et l'accéder sans la mettre publique (mutateur ne marche pas).

    public Gardien(String nom, int competence) {
        this.nom = nom;
        this.competence = competence;
        idDisponible++;
        id = idDisponible;

        compteurGardiens++;

        pointageTotalGardiens += competence;
        pileGardien.insererALaFin(this);
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

    public int getCompetence() {
        return competence;
    }

    private static int compteurGardiens = 0;
    private static int pointageTotalGardiens = 0;

    public static void setPointageTotalGardiens(int pointageTotalGardiens) {
        Gardien.pointageTotalGardiens = pointageTotalGardiens;
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
        temps = (double) Math.round(temps * 10) / 10;
        competence++;
        System.out.println("Le Gardien " + nom + " entraine l'animal " + animal.getNom() + " " + temps + " minutes et augmente sa propre compétence.");
    }

    @Override
    public String toString() {
        return "[" + nom + ", " + id + ", " + competence + "] ";
    }
}