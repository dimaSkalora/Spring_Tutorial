package spring_framework.wideskills_com.lesson_13.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProgramAbstract {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_13/abstractSingletonBean-beans.xml");
        AbstractSingletonBean abstractSingletonBean = (AbstractSingletonBean) context.getBean("singletonBean");
        PrototypeBean prototypeBeanA = abstractSingletonBean.getPrototypeBean();
        PrototypeBean prototypeBeanB = abstractSingletonBean.getPrototypeBean();
        System.out.println(prototypeBeanA);
        System.out.println(prototypeBeanB);
        System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA==prototypeBeanB));
    }
}
