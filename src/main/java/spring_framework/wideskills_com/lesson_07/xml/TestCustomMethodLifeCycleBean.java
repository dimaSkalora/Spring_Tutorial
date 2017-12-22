package spring_framework.wideskills_com.lesson_07.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomMethodLifeCycleBean {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_07/initMethod_destroyMethod-beans.xml");

        CustomLifeCycleMehodBean bean = (CustomLifeCycleMehodBean) context.getBean("customLifeCycleMethodBean");
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}