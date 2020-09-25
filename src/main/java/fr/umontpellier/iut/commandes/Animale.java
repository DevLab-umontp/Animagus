package fr.umontpellier.iut.commandes;

import java.io.File;
import java.security.SecureRandom;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Animale
 */
class Animale extends ListenerAdapter implements Commande {
    private final File[] IMAGES;
    
    private File getImagesRandom() {
        return IMAGES[new SecureRandom().nextInt(IMAGES.length)];
    }

    /**
     * 
     */
    public Animale(File especeAnimal) {
        IMAGES = especeAnimal.listFiles();
    }

    @Override
    public void execute(Message messageRecue) {
        messageRecue.getChannel().sendFile(getImagesRandom()).queue();

    }
}