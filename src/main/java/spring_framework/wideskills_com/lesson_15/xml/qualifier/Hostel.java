package spring_framework.wideskills_com.lesson_15.xml.qualifier;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Hostel {
    private List<Room> deluxeRooms;
    private List<Room> airCooledRooms;
    @Autowired
    @Qualifier("deluxeRooms")
    public void addDeluxeRoom(List<Room> deluxeRooms)
    {
        this.deluxeRooms= deluxeRooms;
    }
    @Autowired
    @Qualifier("aircooled")
    public void addAirCooledRoom(List<Room> airCooledRooms)
    {
        this.airCooledRooms= airCooledRooms;
    }
    public void displayDeluxeRooms()
    {
        System.out.println(deluxeRooms);
    }
    public void displayAirCooledRooms()
    {
        System.out.println(airCooledRooms);
    }
}
