package fr.umontpellier.iut;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;

public class App {
    /**
     *
     */
    private static final JDABuilder ANIMAGUS_BUILDER = new JDABuilder(AccountType.BOT)
            .setToken("NjkyMzk3MTM4MjY4NjUxNTYy.XnwTSg.gBlqAYCwYSQJCjsSjSMj18d-xug")
            .addEventListeners(new GestionnaireMessages())
            .setActivity(Activity.streaming("Animagus.umontp",
                    "https://vignette.wikia.nocookie.net/harrypotter/images/3/30/McGonagall_Animagus.gif/revision/latest?cb=20150715164411&path-prefix=fr"))
            .setCompression(Compression.NONE);

    public static void main(String[] args) {
        JDABuilder builder = ANIMAGUS_BUILDER;
        for (int i = 0; i < 10; i++)
            login(builder.useSharding(i, 10));
    }

    private static void login(JDABuilder builder) {
        try {
            builder.build();
        } catch (javax.security.auth.login.LoginException e) {
            System.err.println("Un problème est survenue lors de la connexion");
            e.printStackTrace();
        }
    }
}
