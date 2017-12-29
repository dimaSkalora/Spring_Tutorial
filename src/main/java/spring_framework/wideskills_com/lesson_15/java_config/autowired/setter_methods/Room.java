package spring_framework.wideskills_com.lesson_15.java_config.autowired.setter_methods;

import org.springframework.beans.factory.annotation.Autowired;

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
        return "Room [roomNumber=" + roomNumber + ", allotedTo=" + name            + "]";
    }
}
