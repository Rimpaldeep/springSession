package co.pragra.springBasics.SpringSession.game;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CharacterConfiguration {

@Bean
    public CharacterRunner runner () {
   return new CharacterRunner (elephant());
}

@Bean
    public Elephant elephant () {
    return new Elephant ();
}

}
