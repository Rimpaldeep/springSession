package co.pragra.springBasics.SpringSession.game;

import org.springframework.stereotype.Component;

public class Eagle implements CharacterConsole {
    public void move() {

        System.out.println ("Eagle flies forward");
    }

    public void attack() {

        System.out.println ("Eagle dives and grabs objects");
    }

    public void cry() {

        System.out.println ("Eagle peal calls");
    }
}
