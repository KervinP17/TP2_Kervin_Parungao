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

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public void entrerDansZoo(Zoo zoo) {
        System.out.println(this.nom + " entre dans le zoo '" + zoo.getNom() + "'");
    }

    public void entrerDansEnclo(Enclos enclo) {
        System.out.println(this.nom + " entre dans l'enclos '" + enclo.getNom() + "'" );
    }

    public void quitterZoo() {
        System.out.println(this.nom + " quitte le zoo.");
    }

    public void quitterEnclo(Enclos enclo) {
        System.out.println(this.nom + " quitte l'enclos '" + enclo.getNom() + "'." );
    }

    @Override
    public String toString() {
        return "[" + nom + ", " + age + "]";
    }


}
