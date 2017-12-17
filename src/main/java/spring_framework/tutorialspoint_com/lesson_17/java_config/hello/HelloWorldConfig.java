package spring_framework.tutorialspoint_com.lesson_17.java_config.hello;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
