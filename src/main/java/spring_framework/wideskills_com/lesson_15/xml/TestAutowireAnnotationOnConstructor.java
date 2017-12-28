package spring_framework.wideskills_com.lesson_15.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_framework.wideskills_com.lesson_15.xml.autowired.constructor.Room;

public class TestAutowireAnnotationOnConstructor {
          public static void main(String[] args) {
            ApplicationContext context =
                    new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_15/autowiredConstructor-beans.xml");
            Room room = (Room)context.getBean("room");
            System.out.println(room);
        }
}
