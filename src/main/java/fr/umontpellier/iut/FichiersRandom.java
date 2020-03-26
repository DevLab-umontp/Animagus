package fr.umontpellier.iut;

import java.io.File;
import java.util.Random;

public class FichiersRandom {
    private final File[] files;

    public FichiersRandom(File repertoire) {
        this.files = repertoire.listFiles();
    }

	public File getFichier() {
        return files[new Random().nextInt(files.length)];
    }

}