package spring_framework.wideskills_com.lesson_15.xml.autowired.constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Room {
    private String roomNumber;
    private Student allotedTo;

    @Autowired
    public Room(Student allotedTo) {
        this.allotedTo = allotedTo;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Student getAllotedTo() {
        return allotedTo;
    }
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
