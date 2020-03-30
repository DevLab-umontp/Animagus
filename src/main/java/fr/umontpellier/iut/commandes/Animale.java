package fr.umontpellier.iut.commandes;

import java.io.File;
import java.util.Random;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Animale
 */
class Animale extends ListenerAdapter implements Commande {
    private final File[] fichiers;
    
    private File getFichierRandom() {
        return fichiers[new Random().nextInt(fichiers.length)];
    }

    /**
     * 
     */
    public Animale(File especeAnimal) {
        fichiers = especeAnimal.listFiles();
    }

    @Override
    public void execute(Message messageRecue) {
        messageRecue.getChannel().sendFile(getFichierRandom()).queue();

    }
}