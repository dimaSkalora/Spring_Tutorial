package spring_framework.wideskills_com.lesson_15.java_config.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_15.java_config.qualifier.Hostel;
import spring_framework.wideskills_com.lesson_15.java_config.qualifier.Room;

@Configuration
public class QualifierBeans {
    @Bean
    public Room deluxeRooms(){
        Room room = new Room();
        room.setRoomNumber("R-104");

        return room;
    }

    @Bean
    @Qualifier("aircooled")
    public Room room1(){
        Room room = new Room();
        room.setRoomNumber("R-101");

        return room;
    }
    @Bean
    @Qualifier("aircooled")
    public Room room2(){
        Room room = new Room();
        room.setRoomNumber("R-102");

        return room;
    }
    @Bean
    @Qualifier("aircooled")
    public Room room3(){
        Room room = new Room();
        room.setRoomNumber("R-103");

        return room;
    }

    @Bean
    public Hostel hostel(){
        return new Hostel();
    }
}
