package spring_framework.tutorialspoint_com.lesson_18.xml;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler
        implements ApplicationListener<ContextStoppedEvent>{

    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent Received");
    }
}
