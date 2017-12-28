package spring_framework.wideskills_com.lesson_15.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_framework.wideskills_com.lesson_15.xml.qualifier.Hostel;

public class TestQualifierAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_15/qualifier-beans.xml");
        Hostel hostel = (Hostel) context.getBean("hostel");
        hostel.displayAirCooledRooms();
        hostel.displayDeluxeRooms();
    }
}
