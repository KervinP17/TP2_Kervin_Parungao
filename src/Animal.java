public class Animal {
    private String nom;
    private String regimeAlimentaire;
    private double poids;
    private Classe classe;
    private String espece;
    private double besoinAlimentaire;

    private static int nbAnimalTotal = 0;

    public Animal(String nom, String regimeAlimentaire, double poids, Classe classe, String espece) {
        this.nom = nom;
        this.regimeAlimentaire = regimeAlimentaire;
        this.poids = poids;
        this.classe = classe;
        this.espece = espece;

        switch (regimeAlimentaire) {
            case "carnivore":
                besoinAlimentaire = poids * 0.05;
                break;
            case "herbivore":
                besoinAlimentaire = poids * 0.03;
                break;
            case "omnivore":
                besoinAlimentaire = poids * 0.02;
                break;
            case "piscivore":
                besoinAlimentaire = poids * 0.01;
                break;
        }
        nbAnimalTotal++;
    }

    public static int getNbAnimalTotal() {
        return nbAnimalTotal;
    }

    public String getEspece() {
        return espece;
    }

    public double getPoids() {
        return poids;
    }

    public double getBesoinAlimentaire() {
        return besoinAlimentaire;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                ", poids=" + poids +
                ", espece='" + espece + '\'' +
                ", besoinAlimentaire=" + besoinAlimentaire +
                '}';
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getRegimeAlimentaire() {
        return regimeAlimentaire;
    }

    public void setRegimeAlimentaire(String regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }

    //toString
}
