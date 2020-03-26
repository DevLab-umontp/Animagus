package fr.umontpellier.iut;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Hello world!
 *
 */
public class App extends ListenerAdapter {
    public static void main(String[] args) {
        JDABuilder builder = new JDABuilder(AccountType.BOT)
                .setToken("NjkyMzk3MTM4MjY4NjUxNTYy.XnuNNA.7Gk8C4xfaaaOamNnYzoi6CtXEs4");
        builder.addEventListeners(new GestionnaireMessages());
        login(builder);
    }

    private static void login(JDABuilder builder) {
        try {
            builder.build();
        } catch (LoginException e) {
            System.err.println("Un problème est survenu lors de la connexion");
            e.printStackTrace();
        }
    }
}
