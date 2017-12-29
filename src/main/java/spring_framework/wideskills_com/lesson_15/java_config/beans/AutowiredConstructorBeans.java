package spring_framework.wideskills_com.lesson_15.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_15.java_config.autowired.constructor.Room;
import spring_framework.wideskills_com.lesson_15.java_config.autowired.constructor.Student;

@Configuration
@ComponentScan("spring_framework.wideskills_com.lesson_15.java_config.autowired.constructor")
public class AutowiredConstructorBeans{
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
