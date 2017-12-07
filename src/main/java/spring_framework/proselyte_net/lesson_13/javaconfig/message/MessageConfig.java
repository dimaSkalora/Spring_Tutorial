package spring_framework.proselyte_net.lesson_13.javaconfig.message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {
    @Bean
    public Message printMessage(){
        return new Message();
    }
}
