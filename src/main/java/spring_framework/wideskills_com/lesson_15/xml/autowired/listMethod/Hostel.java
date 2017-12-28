package spring_framework.wideskills_com.lesson_15.xml.autowired.listMethod;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Hostel {
    private List<Room> roomsList;
    @Autowired
    public void addRooms(List<Room> rooms)
    {
        roomsList= rooms;
    }
    public void displayRooms()
    {
        System.out.println(roomsList);
    }
}
