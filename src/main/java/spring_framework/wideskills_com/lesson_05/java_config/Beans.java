package spring_framework.wideskills_com.lesson_05.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean()
    public DisplayMessage displayMessage(){
        DisplayMessage displayMessage = new DisplayMessage();
        displayMessage.setMessage("Application Context Example");
        return displayMessage;
    }
}
