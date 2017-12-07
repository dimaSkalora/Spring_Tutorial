package spring_framework.proselyte_net.lesson_16.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_16/aop-developer-annotations-config.xml");
        Developer developer = (Developer) context.getBean("developer");

        System.out.println(developer);
        developer.throwSomeMysticException();
    }
}
