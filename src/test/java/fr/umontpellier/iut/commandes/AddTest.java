package fr.umontpellier.iut.commandes;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    void test_getLien_eguale_bon_lien() {
        String resultatAttendue = "https://github.com/MathieuSoysal/Animagus.umontp/upload/master/images/animaux/test";
        assertTrue(Add.getLien("&add test").contains(resultatAttendue));
    }
}