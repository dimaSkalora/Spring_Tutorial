package spring_framework.wideskills_com.lesson_12.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_12.java_config.Room;
import spring_framework.wideskills_com.lesson_12.java_config.Student;

@Configuration
public class StudentBeans {
    @Bean
    public Room room(){
        Room room = new Room();
        room.setRoomNumber(101);
        Student student = new Student();
        student.setName("joe bloggs");
        room.setAllotedTo(student);

        return room;
    }
}
