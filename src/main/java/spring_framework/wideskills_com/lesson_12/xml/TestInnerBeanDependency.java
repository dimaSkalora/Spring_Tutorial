package spring_framework.wideskills_com.lesson_12.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestInnerBeanDependency {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_12/student-beans.xml");
        Room room = (Room)context.getBean("room");
        System.out.println(room);
    }
}
