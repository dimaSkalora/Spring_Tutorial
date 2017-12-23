package spring_framework.wideskills_com.lesson_10.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_10.java_config.Room;
import spring_framework.wideskills_com.lesson_10.java_config.RoomSet;
import spring_framework.wideskills_com.lesson_10.java_config.Student;


@Configuration
public class DiBeans {
    @Bean
    public Student allotedTo(){
        Student student = new Student();
        student.setName("joe bloggs");

        return student;
    }

    @Bean
    public Room room(){
        Room room = new Room(101, allotedTo());

        return room;
    }

    @Bean
    public RoomSet roomSet(){
        RoomSet roomSet = new RoomSet();
        roomSet.setRoomNumber(103);
        roomSet.setAllotedTo(allotedTo());

        return roomSet;
    }
}
