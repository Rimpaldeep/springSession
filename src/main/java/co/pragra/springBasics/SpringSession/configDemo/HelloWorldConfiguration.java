package co.pragra.springBasics.SpringSession.configDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record Person (String name, int age){}
@Configuration
public class HelloWorldConfiguration {

@Bean
    public String name () {
        return "Emily";
    }
@Bean
    public int age () {
    return 23;
    }
//@Bean
//    public Person person () {
//    return new Person ("Jack", 45);
//    }
//@Bean
 //   public Person newPerson() {
//    return new Person (name(), age());
//    }
}
