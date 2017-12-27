package spring_framework.wideskills_com.lesson_14.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_14.java_config.byName.Room;
import spring_framework.wideskills_com.lesson_14.java_config.byName.Student;

@Configuration
//@ComponentScan(basePackages = "spring_framework.wideskills_com.lesson_14.java_config.byName")
public class ByNameBeans {
    @Bean
    public Student allotedTo(){
        Student student = new Student();
        student.setName("Student A");

        return student;
    }

    @Bean
    public Student allotedTo2(){
        Student student = new Student();
        student.setName("Student B");

        return student;
    }

    @Bean
    public Room room(){
        Room room = new Room();
        room.setRoomNumber("R-101");

        return room;
    }
}
