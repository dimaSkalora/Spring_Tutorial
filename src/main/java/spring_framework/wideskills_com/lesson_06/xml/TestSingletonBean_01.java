package spring_framework.wideskills_com.lesson_06.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingletonBean_01 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_06/beans.xml");
        SingletonBean singletonBeanA = (SingletonBean)context.getBean("singletonBean");

        System.out.println(singletonBeanA);

        SingletonBean singletonBeanB = (SingletonBean)context.getBean("singletonBean");

        System.out.println(singletonBeanB);

        System.out.println("Is Singleton Bean A and singleton B are same ? " +
                (singletonBeanA==singletonBeanB));
    }
}
