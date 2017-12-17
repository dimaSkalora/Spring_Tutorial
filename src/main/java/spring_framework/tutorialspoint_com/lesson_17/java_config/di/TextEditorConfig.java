package spring_framework.tutorialspoint_com.lesson_17.java_config.di;

import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
