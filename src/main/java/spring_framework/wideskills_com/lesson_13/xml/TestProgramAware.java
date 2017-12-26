package spring_framework.wideskills_com.lesson_13.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProgramAware {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_13/awareSingletonBean-beans.xml");
        AwareSingletonBean singletonBean = (AwareSingletonBean) context.getBean("singletonBean");
        PrototypeBean prototypeBeanA = singletonBean.getPrototypeBean();
        PrototypeBean prototypeBeanB = singletonBean.getPrototypeBean();
        System.out.println(prototypeBeanA);
        System.out.println(prototypeBeanB);
        System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA==prototypeBeanB));
    }
}
