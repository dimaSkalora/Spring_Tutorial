package spring_framework.wideskills_com.lesson_15.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_15.java_config.autowired.setter_methods.Room;
import spring_framework.wideskills_com.lesson_15.java_config.autowired.setter_methods.Student;

@Configuration
//@ComponentScan("spring_framework.wideskills_com.lesson_15.java_config.autowired.setter_methods")
public class AutowiredSetterBeans {
    @Bean
    public Student allotedTo(){
        Student student = new Student();
        student.setName("Student A");

        return student;
    }

    @Bean
    public Room room(){
        Room room = new Room();
        room.setRoomNumber("R-101");

        return room;
    }
}
