package fr.umontpellier.iut;

import java.io.File;
import java.util.HashMap;

public class GestionnaireImages {

    private static HashMap<String, FichiersRandom> repertoireAnimaux = new HashMap<>();

    static {
        for (File especeAnimal : new File("./images/animaux/").listFiles())
            if (especeAnimal.isDirectory())
                repertoireAnimaux.put(especeAnimal.getName(), new FichiersRandom(especeAnimal));
    }

    public static File getImage(String messageRecue) {
        return repertoireAnimaux.get(messageRecue.substring(1).toLowerCase()).getFichier();
    }

    private GestionnaireImages() {
        throw new IllegalStateException("Utility class");
    }
}