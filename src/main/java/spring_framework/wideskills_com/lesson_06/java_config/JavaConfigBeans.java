package spring_framework.wideskills_com.lesson_06.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfigBeans {
    @Bean
    public SingletonBean singletonBean(){
        return new SingletonBean();
    }

    @Bean
    @Scope(scopeName = "prototype")
    public PrototypeBean prototypeBean(){
        return new PrototypeBean();
    }
}
