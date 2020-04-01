package fr.umontpellier.iut;

import static java.lang.System.out;

import fr.umontpellier.iut.commandes.Commande;
import fr.umontpellier.iut.commandes.RepertoireCommandes;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GestionnaireEvents extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        AfficheMessageDansConsole(event);

        if (animagusEstAppeleParUtilisateur(event)) {
            Commande cmd = RepertoireCommandes.getCommande(event);
            if (cmd != null)
                cmd.execute(event.getMessage());
        }
    }

    private void AfficheMessageDansConsole(MessageReceivedEvent event) {
        out.println(String.format("Message reçue de la part de %s : %s", event.getAuthor().getName(),
                event.getMessage().getContentRaw()));
    }

    private boolean animagusEstAppeleParUtilisateur(MessageReceivedEvent event) {
        return !event.getAuthor().isBot() && event.getMessage().getContentRaw().charAt(0) == '&';
    }

}
