public class Veterinaire {
    private String nom;
    private Classe specialite;

    public Veterinaire(String nom, Classe specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public void soignerAnimal(Animal animal) {

        animal.getRegimeAlimentaire();
        System.out.println("Le Vétérinaire " + nom + " a récalculé les besoins alimentaires de l'animal " + animal.getNom());
    }

    @Override
    public String toString() {
        return "[" + nom + ", " + specialite + "]";
    }
}
