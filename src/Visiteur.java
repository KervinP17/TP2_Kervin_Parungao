public class Visiteur {
    private String nom;
    private int age;
    private int nombreAnimaux;
    private String[] especes;

    public Visiteur(String nom, int age, String[] especes) {
        this.nom = nom;
        this.age = age;
        this.nombreAnimaux = nombreAnimaux;
        this.especes = especes;
    }

    public String[] getEspeces() {
        return especes;
    }

    public void entrerDansZoo(Zoo zoo) {
        System.out.println(this.nom + " entre dans le zoo " + zoo);
    }

    public void entrerDansEnclo(Enclos enclo) {

    }

    public void quitterZoo() {

    }

    public void quitterEnclo(Enclos enclo) {

    }

    @Override
    public String toString() {
        return "[" + nom + ", " + age + "]";
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }
}
