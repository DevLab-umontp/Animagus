package fr.umontpellier.iut.commandes;

import java.io.File;
import java.util.HashMap;

public class GestionnaireAnimaux {

    private static HashMap<String, Commande> COMMANDES_ANIMAUX = new HashMap<>();

    static {
        for (File especeAnimal : new File("./images/animaux/").listFiles())
            if (especeAnimal.isDirectory())
                COMMANDES_ANIMAUX.put(especeAnimal.getName(), new Animale(especeAnimal));
    }

    public static HashMap<String, Commande> getCommandes() {
        return COMMANDES_ANIMAUX;
    }
}