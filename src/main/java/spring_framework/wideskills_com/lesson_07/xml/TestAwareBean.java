package spring_framework.wideskills_com.lesson_07.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAwareBean {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_07/applicationContextAware_BeanNameAware_BeanFactoryAware-beans.xml");
        AwareBean bean = (AwareBean)context.getBean("awareBean");
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}
