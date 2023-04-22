package co.pragra.springBasics.SpringSession.didemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Dependency1{}

@Component
class Dependency2{}

@Component
class MyMainClass {
    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    @Autowired
    public MyMainClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println ("Printing from constructor");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println ("Printing from Dependency 1 setter");
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println ("Printing from Dependency 2 setter");
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "MyMainClass{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}
@Configuration
@ComponentScan
public class DIDemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (DIDemoApplication.class);
        System.out.println (context.getBean (MyMainClass.class));

    }
}
