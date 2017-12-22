package spring_framework.wideskills_com.lesson_06.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPrototypeBean {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigBeans.class);

        PrototypeBean prototypeBeanA = context.getBean(PrototypeBean.class);

        System.out.println(prototypeBeanA);

        PrototypeBean prototypeBeanB = context.getBean(PrototypeBean.class);

        System.out.println(prototypeBeanB);

        System.out.println("Is Prototype Bean A and Prototype B are same ? " +
                (prototypeBeanA==prototypeBeanB));

    }
}
