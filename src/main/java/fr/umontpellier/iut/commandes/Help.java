package fr.umontpellier.iut.commandes;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Help
 */
class Help extends ListenerAdapter implements Commande {

    @Override
    public void execute(Message messageRecue) {
        final String AIDE = "**   Voici les commandes *Animagus* disponibles :**\n";
        final String ANIMAL = "\n ► `&{votre animal}` : par exemple `&chien` pour afficher l'image d'un chien.";
        final String ADD = "\n ► `&add {votre animal}` : par exemple `&add souris` pour ajouter l'image d'une souris.";
        final String FEEDBACK = "\n ► `&feedback` : permet de faire un retour sur le bot.";
        final String INFO = "\n\n Pour plus d'info rendez-vous sur https://github.com/DevLab-umontp/Animagus.umontp";
        messageRecue.getChannel().sendMessage(AIDE + ANIMAL + ADD + FEEDBACK + INFO).queue();
    }
}
