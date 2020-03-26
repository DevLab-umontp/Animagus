package fr.umontpellier.iut;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UploadImageTest {

    @Test
    void test_getLien_eguale_bon_lien() {
        String resultatAttendue = "https://github.com/MathieuSoysal/Animagus.umontp/upload/master/images/animaux/test";
        assertEquals(resultatAttendue, UploadImage.getLien("&add test"));
    }
}