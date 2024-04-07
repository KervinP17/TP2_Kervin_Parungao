public class Visiteur {
    private String nom;
    private int age;
    private int nombreAnimaux;
    private String[] especes;

    public Visiteur(String nom, int age, int nombreAnimaux, String[] especes) {
        this.nom = nom;
        this.age = age;
        this.nombreAnimaux = nombreAnimaux;
        this.especes = especes;
    }

    public String[] getEspeces() {
        return especes;
    }

    public void entrerDansZoo(Zoo zoo) {

    }

    public void entrerDansEnclos(Enclos enclo) {

    }

    public void quitterZoo() {

    }

    public void quitterEnclo(Enclos enclo) {

    }

    @Override
    public String toString() {
        return "Visiteur{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
