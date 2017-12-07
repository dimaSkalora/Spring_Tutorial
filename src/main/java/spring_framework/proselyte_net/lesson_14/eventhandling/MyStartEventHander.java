package spring_framework.proselyte_net.lesson_14.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class MyStartEventHander implements ApplicationListener<ContextStartedEvent> {
    public void onApplicationEvent(ContextStartedEvent event){
        System.out.println("We've received ContextStartedEvent...");
    }
}
