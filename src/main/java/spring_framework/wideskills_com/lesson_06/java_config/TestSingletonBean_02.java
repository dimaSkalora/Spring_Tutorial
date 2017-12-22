package spring_framework.wideskills_com.lesson_06.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingletonBean_02{
    public static void main(String[] args) {
        ApplicationContext contextA =
                new AnnotationConfigApplicationContext(JavaConfigBeans.class);
        SingletonBean singletonBeanA = (SingletonBean)contextA.getBean("singletonBean");
        System.out.println(singletonBeanA);

        ApplicationContext contextB =
                 new AnnotationConfigApplicationContext(JavaConfigAnotherBeans.class);
        SingletonBean singletonBeanB = (SingletonBean)contextB.getBean("singletonBean");

        System.out.println(singletonBeanB);

        System.out.println("Is Singleton Bean A and singleton B are same ? " +
                (singletonBeanA==singletonBeanB));
    }
}
