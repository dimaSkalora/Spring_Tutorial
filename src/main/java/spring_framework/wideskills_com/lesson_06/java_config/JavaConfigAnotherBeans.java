package spring_framework.wideskills_com.lesson_06.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigAnotherBeans {
    @Bean
    public SingletonBean singletonBean(){
        return new SingletonBean();
    }
}
