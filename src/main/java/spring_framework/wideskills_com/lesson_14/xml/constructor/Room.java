package spring_framework.wideskills_com.lesson_14.xml.constructor;

public class Room {
    private String roomNumber;
    private Student allotedTo;

    public Room()
    {
        System.out.println("Default Constructor Called ");
    }

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
