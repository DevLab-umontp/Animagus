package fr.umontpellier.iut;

import static java.lang.System.out;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GestionnaireMessages extends ListenerAdapter {

    private static String commandes = "Voici les commandes *Animagus* disponibles :\n **-** `&{votre animal}` : par exemple `&chien` pour afficher l'image d'un chien.\n **-** `&add {votre animal}` : par exemple `&add souris` pour ajouter l'image d'une souris.\n";

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        User auteur = event.getAuthor();
        String messageRecue = event.getMessage().getContentRaw();
        MessageChannel channel = event.getChannel();
        out.println(String.format("Message reçue de la part de %s : %s", auteur.getName(), messageRecue));

        if (!auteur.isBot() && messageRecue.charAt(0) == '&') {
            switch (recupereCommande(messageRecue)) {
                case "add":
                    channel.sendMessage(UploadImage.getLien(messageRecue)).queue();
                    break;
                case "animagus":
                case "animagus.umontp":
                    channel.sendMessage(commandes).queue();
                    break;
                default:
                    channel.sendFile(GestionnaireImages.getImage(messageRecue)).queue();
                    break;
            }
        }
    }

    private static String recupereCommande(String messageRecue) {
        return messageRecue.substring(1).split(" ")[0].toLowerCase();
    }

}
