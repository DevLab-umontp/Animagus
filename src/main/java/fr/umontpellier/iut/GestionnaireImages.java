package fr.umontpellier.iut;

import java.io.File;
import java.util.HashMap;

public class GestionnaireImages {

    private static HashMap<String, FichiersRandom> repertoireAnimeaux = new HashMap<>();

    static {
        for (File typeAnimal : new File("./images/animeaux/").listFiles())
            if (typeAnimal.isDirectory())
                repertoireAnimeaux.put(typeAnimal.getName(), new FichiersRandom(typeAnimal));
    }

    public static File getImage(String messageRecue) {
        return repertoireAnimeaux.get(messageRecue.substring(1).toLowerCase()).getFichier();
    }

    private GestionnaireImages() {
        throw new IllegalStateException("Utility class");
    }
}