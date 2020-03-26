package fr.umontpellier.iut;

import java.util.Random;

public class UploadImage {
    static final String[] ICONS_ANIMAUX = { "🐵", "🐶", "🐺", "🐱", "🦁", "🐯", "🦒", "🦊", "🦝", "🐮", "🐷", "🐗",
            "🐭", "🐹", "🐰", "🐻", "🐨", "🐼", "🐸", "🦓", "🐴", "🦄", "🐔", "🦧", "🦮", "🐕‍🦺", "🐩", "🐕", "🐈",
            "🐅", "🐆", "🐎", "🦌", "🦏", "🦛", "🐂", "🐃", "🐄", "🐖", "🐏", "🐑", "🐐", "🐪", "🐫", "🦙", "🦘", "🦥",
            "🦨", "🦡", "🐘", "🐁", "🐀", "🦔", "🐇", "🐿", "🦎", "🐊", "🐢", "🐍", "🦕", "🦖", "🦦", "🦈", "🐬", "🐳",
            "🐋", "🐟", "🐠", "🐡", "🦐", "🦑", "🐙", "🦞", "🦀", "🦆", "🐓", "🦃", "🦅", "🕊", "🦢", "🦜", "🦩", "🦚",
            "🦉", "🐦", "🐧", "🐥", "🐤", "🦇", "🦋", "🐌", "🐛", "🦟", "🦗", "🐜", "🐝", "🐞", "🦂", "🕷" };

    public static String getLien(String messageRecue) {
        String animalChoisi = messageRecue.substring(5).toLowerCase();
        return String.format(
                "Clic sur le lien pour ajouter ton image de %s marrant favori %s  %s  %s  :\n 📎 https://github.com/MathieuSoysal/Animagus.umontp/upload/master/images/animaux/%s \n",
                animalChoisi, getRandomIcone(), getRandomIcone(), getRandomIcone(), animalChoisi);
    }

    private static String getRandomIcone() {
        return ICONS_ANIMAUX[new Random().nextInt(ICONS_ANIMAUX.length)];
    }
}