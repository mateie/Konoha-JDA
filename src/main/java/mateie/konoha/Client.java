package mateie.konoha;

import net.dv8tion.jda.api.JDABuilder;

import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Client {

    private Client() throws LoginException {
        JDABuilder
                .createDefault(Config.get("token"))
                .setActivity(Activity.watching(Config.get("prefix")))
                .build();
    }

    public static void main(String[] args) throws LoginException {
        new Client();
    }
}
