package co.pragra.springBasics.SpringSession;

import co.pragra.springBasics.SpringSession.game.CharacterRunner;
import co.pragra.springBasics.SpringSession.game.Eagle;
import co.pragra.springBasics.SpringSession.game.Elephant;
import co.pragra.springBasics.SpringSession.game.Lion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringSessionApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringSessionApplication.class, args);

//		Elephant elephant = new Elephant ();
//		Eagle eagle = new Eagle ();
//		Lion lion = new Lion();

//		CharacterRunner runner = new CharacterRunner(lion);
//		runner.run();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("config.xml");
		System.out.println (context.getBean ("elephant"));
		System.out.println (context.getBean ("characterRunner"));
	}

}
