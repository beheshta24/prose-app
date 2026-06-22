package de.htw_berlin.fb4.ossd.beheshta;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

public class App {

    public static void main(String[] args) {
        ProseBuilder proseBuilder = new ProseBuilder();

        proseBuilder.register(new GreetingSentence());
        proseBuilder.register(new FarewellSentence());
        proseBuilder.register(new TongueTwister());

        System.out.println(proseBuilder.get());
    }
}
