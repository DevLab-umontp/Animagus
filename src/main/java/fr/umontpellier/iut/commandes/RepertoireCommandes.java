package fr.umontpellier.iut.commandes;

import java.io.File;
import java.util.HashMap;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class RepertoireCommandes {
    private static final HashMap<String, Commande> REPERTOIRE_COMMANDES = new HashMap<>();

    static {
        REPERTOIRE_COMMANDES.put("help", new Help());
        REPERTOIRE_COMMANDES.put("add", new Add());
        REPERTOIRE_COMMANDES.put("feedback", new FeedBack());
        // animale commandes
        for (File especeAnimal : new File("./images/animaux/").listFiles())
            if (especeAnimal.isDirectory())
                REPERTOIRE_COMMANDES.put(especeAnimal.getName(), new Animale(especeAnimal));
    }

    /**
     * @param key
     * @return
     * @see java.util.HashMap#get(java.lang.Object)
     */

    public static Commande getCommande(MessageReceivedEvent msg) {
        String key = getCommandeDansMessage(msg);
        return REPERTOIRE_COMMANDES.get(key);
    }

    private static String getCommandeDansMessage(MessageReceivedEvent msg) {
        return msg.getMessage().getContentRaw().substring(1).split(" ")[0].toLowerCase();
    }

    public RepertoireCommandes() {
        throw new IllegalStateException("Utility class");
    }

}