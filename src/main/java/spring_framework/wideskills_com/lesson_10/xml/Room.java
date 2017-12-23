package spring_framework.wideskills_com.lesson_10.xml;

public class Room {
    private int roomNumber;
    private Student allotedTo;
    public Room(int roomNumber, Student allotedTo) {
        super();
        this.roomNumber = roomNumber;
        this.allotedTo = allotedTo;
    }
    @Override
    public String toString() {
        return "Room [roomNumber=" + roomNumber + ", allotedTo=" + allotedTo.getName()
                + "]";
    }
}
