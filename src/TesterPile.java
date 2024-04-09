import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesterPile {
    private Zoo testZoo;
    private Gardien gardien;
    @Test
    public void testAjouterGardien() {

        testZoo = new Zoo("Test Zoo");
        gardien = new Gardien("gardien1", 10);

        int compteGardien = testZoo.getPileGardiens().getNbElements();
        testZoo.ajouterGardien(gardien);
        int compteGardienApresAjout = testZoo.getPileGardiens().getNbElements();

        System.out.println(testZoo.getPileGardiens());

        assertEquals(compteGardien, compteGardienApresAjout);

        assertEquals(gardien, testZoo.getPileGardiens().getElement(compteGardienApresAjout - 1));
    }
}