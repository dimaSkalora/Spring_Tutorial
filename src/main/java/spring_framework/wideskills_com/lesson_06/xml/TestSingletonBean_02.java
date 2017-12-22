package spring_framework.wideskills_com.lesson_06.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingletonBean_02{
    public static void main(String[] args) {
        ApplicationContext contextA =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_06/beans.xml");
        SingletonBean singletonBeanA = (SingletonBean)contextA.getBean("singletonBean");
        System.out.println(singletonBeanA);

        ApplicationContext contextB =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_06/another-beans.xml");
        SingletonBean singletonBeanB = (SingletonBean)contextB.getBean("singletonBean");

        System.out.println(singletonBeanB);

        System.out.println("Is Singleton Bean A and singleton B are same ? " +
                (singletonBeanA==singletonBeanB));
    }
}
