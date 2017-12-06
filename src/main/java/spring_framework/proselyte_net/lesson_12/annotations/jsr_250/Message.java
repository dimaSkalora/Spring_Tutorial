package spring_framework.proselyte_net.lesson_12.annotations.jsr_250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
    private String message;

    public String getMessage() {
        return "Message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void beanInit() {
        System.out.println("Bean is passing init stage.");
    }

    @PreDestroy
    public void beanDestroy() {
        System.out.println("Bean is passing destroy stage.");
    }
}
