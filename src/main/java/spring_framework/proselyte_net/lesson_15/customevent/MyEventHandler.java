package spring_framework.proselyte_net.lesson_15.customevent;

import org.springframework.context.ApplicationListener;

public class MyEventHandler implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println(myEvent.toString());
    }
}
