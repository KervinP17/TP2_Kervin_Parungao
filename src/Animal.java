public class Animal {
    private String nom;
    private String regimeAlimentaire;
    private double poids;
    private Classe classe;
    private String espece;
    private int besoinAlimentaire;


    public Animal(String nom, String regimeAlimentaire, double poids, Classe classe, String espece) {
        this.nom = nom;
        this.regimeAlimentaire = regimeAlimentaire;
        this.poids = poids;
        this.classe = classe;
        this.espece = espece;
    }

    public String getEspece() {
        return espece;
    }

    public double getPoids() {
        return poids;
    }

    public int getBesoinAlimentaire() {
        return besoinAlimentaire;
    }

    //toString
}
