package spring_framework.wideskills_com.lesson_10.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_10.java_config.Person;

@Configuration
public class StaticMethodBeans {
    @Bean()
    public Person person(){
        Person person = Person.getInstance();
        person.setName("joe bloggs");

        return person;
    }
}
