package spring_framework.wideskills_com.lesson_14.java_config.byType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Room {
    private String roomNumber;
    private Student allotedTo;
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Student getAllotedTo() {
        return allotedTo;
    }
    @Autowired
    @Qualifier(value = "studentB")
    public void setAllotedTo(Student allotedTo) {
        this.allotedTo = allotedTo;
    }
    @Override
    public String toString() {
        String name= "";
        if(allotedTo!=null)
        {
            name= allotedTo.getName();
        }
        return "Room [roomNumber=" + roomNumber + ", allotedTo=" + name      + "]";
    }
}
