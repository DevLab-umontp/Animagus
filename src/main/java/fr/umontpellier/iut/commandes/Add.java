package fr.umontpellier.iut.commandes;

import java.security.SecureRandom;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Add
 */
class Add extends ListenerAdapter implements Commande {

    static final String[] ICONES_ANIMAUX = { "🐵", "🐶", "🐺", "🐱", "🦁", "🐯", "🦒", "🦊", "🦝", "🐮", "🐷", "🐗",
            "🐭", "🐹", "🐰", "🐻", "🐨", "🐼", "🐸", "🦓", "🐴", "🦄", "🐔", "🦧", "🦮", "🐕‍🦺", "🐩", "🐕", "🐈",
            "🐅", "🐆", "🐎", "🦌", "🦏", "🦛", "🐂", "🐃", "🐄", "🐖", "🐏", "🐑", "🐐", "🐪", "🐫", "🦙", "🦘", "🦥",
            "🦨", "🦡", "🐘", "🐁", "🐀", "🦔", "🐇", "🐿", "🦎", "🐊", "🐢", "🐍", "🦕", "🦖", "🦦", "🦈", "🐬", "🐳",
            "🐋", "🐟", "🐠", "🐡", "🦐", "🦑", "🐙", "🦞", "🦀", "🦆", "🐓", "🦃", "🦅", "🕊", "🦢", "🦜", "🦩", "🦚",
            "🦉", "🐦", "🐧", "🐥", "🐤", "🦇", "🦋", "🐌", "🐛", "🦟", "🦗", "🐜", "🐝", "🐞", "🦂", "🕷" };

    public static String getLien(String messageRecue) {
        String animalChoisi = messageRecue.substring(5).toLowerCase();
        return String.format(
                "Clic sur le lien pour ajouter ton image de %s %s  %s  %s  :\n 📎 https://github.com/MathieuSoysal/Animagus.umontp/upload/master/images/animaux/%s \n",
                animalChoisi, getRandomIcone(), getRandomIcone(), getRandomIcone(), animalChoisi);
    }

    private static String getRandomIcone() {
        return ICONES_ANIMAUX[new SecureRandom().nextInt(ICONES_ANIMAUX.length)];
    }

    @Override
    public void execute(Message messageRecue) {
        messageRecue.getChannel().sendMessage(getLien(messageRecue.getContentRaw())).queue();

    }

}