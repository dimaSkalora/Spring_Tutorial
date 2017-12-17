package spring_framework.tutorialspoint_com.lesson_17.java_config.annotation_import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {
    @Bean
    public A a() {
        return new A();
    }
}
