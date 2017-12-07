package spring_framework.proselyte_net.lesson_14.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class MyStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("We've received ContextStoppedEvent...");
    }
}
