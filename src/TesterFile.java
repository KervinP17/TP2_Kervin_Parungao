import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesterFile {

    @Test
    void visiteurAge65() {

        Zoo testZoo = new Zoo("Test Zoo");

        Visiteur visiteur1 = new Visiteur("visiteur1", 64, new String[]{"python", "zèbre"});
        Visiteur visiteur2 = new Visiteur("visiteur2", 65, new String[]{"saumon", "marsouin"});
        Visiteur visiteur3 = new Visiteur("visiteur3", 66, new String[]{"thon", "perroquet"});
        Visiteur visiteur4 = new Visiteur("visiteur4", 63, new String[]{"alligator", "lion"});

        // Add visitors to the zoo
        testZoo.arriveeVisiteur(visiteur1);
        testZoo.arriveeVisiteur(visiteur2);
        testZoo.arriveeVisiteur(visiteur3);
        testZoo.arriveeVisiteur(visiteur4);

        // Check the order of visitors in the queue
        assertEquals("visiteur2", testZoo.retirerVisiteur().getNom());
        assertEquals("visiteur3", testZoo.retirerVisiteur().getNom());
        assertEquals("visiteur1", testZoo.retirerVisiteur().getNom());
        assertEquals("visiteur4", testZoo.retirerVisiteur().getNom());
    }
}