package spring_framework.wideskills_com.lesson_10.xml;

public class RoomSet {
    private int roomNumber;
    private Student allotedTo;
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
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
        return "RoomSet{" +
                "roomNumber=" + roomNumber +
                ", allotedTo=" + allotedTo +
                '}';
    }
}
