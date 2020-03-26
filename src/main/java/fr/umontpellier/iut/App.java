package fr.umontpellier.iut;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.*;
/**
 * Hello world!
 *
 */
public class App{
    public static void main(String[] args) {
        JDABuilder builder = new JDABuilder(AccountType.BOT)
                .setToken("NjkyMzk3MTM4MjY4NjUxNTYy.XnwTSg.gBlqAYCwYSQJCjsSjSMj18d-xug");
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
