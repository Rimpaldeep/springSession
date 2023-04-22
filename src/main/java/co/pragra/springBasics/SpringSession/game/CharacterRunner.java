package co.pragra.springBasics.SpringSession.game;

import org.springframework.stereotype.Component;

//@Component
public class CharacterRunner {

    private CharacterConsole character;
    public CharacterRunner(CharacterConsole character) {
        this.character = character;
    }
    public void run() {
        character.move ();
        character.attack ();
        character.cry ();
    }
}

