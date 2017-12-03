package spring_framework.proselyte_net.lesson_02.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_framework.proselyte_net.lesson_02.spring_ioc.SpringHelloWorld;

public class SpringHelloWorldRunner {
    public static void main(String[] args)  {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_02/spring-hello-bean.xml");
        SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        springHelloWorld.getHelloMessage();
    }
}
