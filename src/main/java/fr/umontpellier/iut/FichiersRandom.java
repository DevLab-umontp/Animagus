package fr.umontpellier.iut;

import java.io.File;
import java.util.Random;

public class FichiersRandom {
    private final File[] fichiers;

    public FichiersRandom(File repertoire) {
        this.fichiers = repertoire.listFiles();
    }

	public File getFichierRandom() {
        return fichiers[new Random().nextInt(fichiers.length)];
    }

}