package spring_framework.tutorialspoint_com.lesson_19.xml;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{
    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "My Custom Event";
    }
}
