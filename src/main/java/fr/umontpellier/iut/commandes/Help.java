package fr.umontpellier.iut.commandes;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Help
 */
class Help extends ListenerAdapter implements Commande {
    private static final String AIDE = "**Voici les commandes *Animagus* disponibles :**\n ► `&{votre animal}` : par exemple `&chien` pour afficher l'image d'un chien.\n ► `&add {votre animal}` : par exemple `&add souris` pour ajouter l'image d'une souris.\n";


    @Override
    public void execute(Message messageRecue) {
        messageRecue.getChannel().sendMessage(AIDE).queue();
    }
}