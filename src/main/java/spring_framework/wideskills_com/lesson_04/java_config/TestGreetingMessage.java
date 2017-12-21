package spring_framework.wideskills_com.lesson_04.java_config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestGreetingMessage {
    public static void main(String[] args) {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(SpringBeans.class);

        GreetingMessage objBean = beanFactory.getBean(GreetingMessage.class,"greetingMessage");
        objBean.setMessage("Welcome  Message from Spring!!");
        String messageBean = objBean.getMessage();
        System.out.println(messageBean);


       ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeans.class);

        GreetingMessage objContext = context.getBean(GreetingMessage.class,"greetingMessage");
        objContext.setMessage("Welcome  Message from Spring!!");
        String messageContext = objContext.getMessage();
        System.out.println(messageContext);
    }
}
