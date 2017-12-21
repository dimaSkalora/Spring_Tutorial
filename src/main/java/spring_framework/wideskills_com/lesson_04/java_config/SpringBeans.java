package spring_framework.wideskills_com.lesson_04.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeans {
    @Bean()
    public GreetingMessage greetingMessage(){
        return new GreetingMessage();
    }
}
