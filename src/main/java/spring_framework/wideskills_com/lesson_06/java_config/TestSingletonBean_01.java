package spring_framework.wideskills_com.lesson_06.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSingletonBean_01 {
    public static void main(String[] args) {
        ApplicationContext context =
               new AnnotationConfigApplicationContext(JavaConfigBeans.class);
        SingletonBean singletonBeanA = context.getBean(SingletonBean.class,"singletonBean");

        System.out.println(singletonBeanA);

        SingletonBean singletonBeanB = context.getBean(SingletonBean.class,"singletonBean");

        System.out.println(singletonBeanB);

        System.out.println("Is Singleton Bean A and singleton B are same ? " +
                (singletonBeanA==singletonBeanB));
    }
}
