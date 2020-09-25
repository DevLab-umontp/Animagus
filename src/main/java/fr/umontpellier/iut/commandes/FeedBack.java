package fr.umontpellier.iut.commandes;

import net.dv8tion.jda.api.entities.Message;

public class FeedBack implements Commande {

    @Override
    public void execute(Message messageRecue) {
        final String MESSAGE = "T'as trouvé un bug ? une idée ? Clic sur le lien pour en faire le retour : https://github.com/DevLab-umontp/Animagus.umontp/issues/new";
        messageRecue.getChannel().sendMessage(MESSAGE).queue();
    }
}
