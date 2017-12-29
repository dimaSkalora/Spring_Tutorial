package spring_framework.wideskills_com.lesson_15.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_15.java_config.autowired.listMethod.Hostel;
import spring_framework.wideskills_com.lesson_15.java_config.beans.AutowiredListMethodBeans;

public class TestAutowireAnnotationOnList {
    public static void main(String[] args) {
        ApplicationContext context =
               new AnnotationConfigApplicationContext(AutowiredListMethodBeans.class);
        Hostel hostel = (Hostel) context.getBean("hostel");
        hostel.displayRooms();
    }
}
