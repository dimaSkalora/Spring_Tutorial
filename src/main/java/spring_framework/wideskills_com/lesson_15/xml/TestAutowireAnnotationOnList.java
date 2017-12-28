package spring_framework.wideskills_com.lesson_15.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_framework.wideskills_com.lesson_15.xml.autowired.listMethod.Hostel;

public class TestAutowireAnnotationOnList {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_15/autowiredListMethod-beans.xml");
        Hostel hostel = (Hostel) context.getBean("hostel");
        hostel.displayRooms();
    }
}
