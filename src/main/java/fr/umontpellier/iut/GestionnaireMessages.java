package fr.umontpellier.iut;

import static java.lang.System.out;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GestionnaireMessages extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        User auteur = event.getAuthor();
        String messageRecue = event.getMessage().getContentRaw();
        MessageChannel channel = event.getChannel();
        out.println(String.format("Message reçue de la part de %s : %s", auteur.getName(), messageRecue));

        if (!auteur.isBot() && messageRecue.charAt(0) == '&')
            channel.sendFile(GestionnaireImages.getImage(messageRecue)).queue();

    }
}