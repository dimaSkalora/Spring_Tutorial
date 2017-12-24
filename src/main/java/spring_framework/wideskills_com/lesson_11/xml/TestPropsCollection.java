package spring_framework.wideskills_com.lesson_11.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPropsCollection {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_11/properties-beans.xml");
        DataSource dataSource =(DataSource)context.getBean("datasource");
        System.out.println(dataSource.getDbProperties());
    }
}
