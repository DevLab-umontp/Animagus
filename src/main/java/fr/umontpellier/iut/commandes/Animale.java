package fr.umontpellier.iut.commandes;

import java.io.File;
import java.security.SecureRandom;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Animale
 */
class Animale extends ListenerAdapter implements Commande {
    private final File[] fichiers;
    
    private File getFichierRandom() {
        return fichiers[new SecureRandom().nextInt(fichiers.length)];
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