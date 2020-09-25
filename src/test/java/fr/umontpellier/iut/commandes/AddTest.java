package fr.umontpellier.iut.commandes;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class AddTest {

    @Test
    void test_getLien_eguale_bon_lien() {
        String resultatAttendue = "https://github.com/DevLab-umontp/Animagus.umontp/issues/new?labels=Ajout+image&title=Ajout+image+de+test&body=Glisser+votre+image+ici";
        assertTrue(Add.getLien("&add test").contains(resultatAttendue));
    }
}