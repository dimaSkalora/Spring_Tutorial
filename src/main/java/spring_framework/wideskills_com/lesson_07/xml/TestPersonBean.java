package spring_framework.wideskills_com.lesson_07.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestPersonBean {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_07/initializing_disposable-beans.xml");
        PersonBean bean = (PersonBean)context.getBean("personBean");
        System.out.println(bean.getName());
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}
