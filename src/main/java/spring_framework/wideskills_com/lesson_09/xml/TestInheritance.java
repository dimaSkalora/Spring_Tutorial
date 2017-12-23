package spring_framework.wideskills_com.lesson_09.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestInheritance {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_09/parentBean-beans.xml");
        ParentBean parentBean = (ParentBean)context.getBean("parentBean");
        System.out.println("=====Parent Bean====");
        System.out.println("Message ::" + parentBean.getMessage());
        System.out.println("Title ::" + parentBean.getTitle());

        ParentBean childrenBean = (ParentBean)context.getBean("childBean");
        System.out.println("=====Child Bean====");
        System.out.println("Message ::" + childrenBean.getMessage());
        System.out.println("Title ::" + childrenBean.getTitle());
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}
