package spring_framework.wideskills_com.lesson_13.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_13.java_config.beans.SingletonBeanBeans;

public class TestProgram {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(SingletonBeanBeans.class);
        SingletonBean singleton = (SingletonBean)context.getBean("singletonBean");
        PrototypeBean prototypeBeanA = singleton.getPrototypeBean();
        PrototypeBean prototypeBeanB = singleton.getPrototypeBean();
        System.out.println(prototypeBeanA);
        System.out.println(prototypeBeanB);
        System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA==prototypeBeanB));
    }
}