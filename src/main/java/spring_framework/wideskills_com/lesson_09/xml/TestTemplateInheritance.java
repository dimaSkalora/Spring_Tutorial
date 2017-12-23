package spring_framework.wideskills_com.lesson_09.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestTemplateInheritance {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_09/childBean-beans.xml");
        ChildBean parentBean = (ChildBean)context.getBean("childBean");
        System.out.println("=====Child Bean====");
        System.out.println("Message ::" + parentBean.getMessage());
        System.out.println("Title ::" + parentBean.getTitle());
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}