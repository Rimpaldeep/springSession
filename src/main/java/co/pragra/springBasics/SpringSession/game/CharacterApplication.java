package co.pragra.springBasics.SpringSession.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


//@ComponentScan ("co.pragra.springBasics.SpringSession.game")
public class CharacterApplication {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (CharacterConfiguration.class);

        context.getBean (CharacterRunner.class).run ();
        // to see all the beans that spring has created for us, do as below:
        Arrays.stream (context.getBeanDefinitionNames ()).forEach (System.out::println);
    }
}

