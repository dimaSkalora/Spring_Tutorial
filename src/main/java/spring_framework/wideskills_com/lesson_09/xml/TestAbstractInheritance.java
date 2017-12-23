package spring_framework.wideskills_com.lesson_09.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestAbstractInheritance {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_09/abstractParentBean-beans.xml");
        AbstractParentBean childrenBean = (AbstractParentBean)context.getBean("childBean");
        System.out.println("=====Child Bean====");
        System.out.println("Message ::" + childrenBean.getMessage());
        System.out.println("Title ::" + childrenBean.getTitle());
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}
