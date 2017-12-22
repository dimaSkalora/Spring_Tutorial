package spring_framework.wideskills_com.lesson_06.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrototypeBean {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_06/beans.xml");

        PrototypeBean prototypeBeanA = (PrototypeBean)context.getBean("prototypeBean");

        System.out.println(prototypeBeanA);

        PrototypeBean prototypeBeanB = (PrototypeBean)context.getBean("prototypeBean");

        System.out.println(prototypeBeanB);

        System.out.println("Is Prototype Bean A and Prototype B are same ? " +
                (prototypeBeanA==prototypeBeanB));

    }
}
