package spring_framework.wideskills_com.lesson_15.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_15.java_config.beans.QualifierBeans;
import spring_framework.wideskills_com.lesson_15.java_config.qualifier.Hostel;

public class TestQualifierAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(QualifierBeans.class);
        Hostel hostel = (Hostel) context.getBean("hostel");
        hostel.displayAirCooledRooms();
        hostel.displayDeluxeRooms();
    }
}
