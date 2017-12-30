package spring_framework.wideskills_com.lesson_16.java_config;

public class Hostel {
    private Student student;

    public Hostel(Student student) {
        this.student = student;
    }

    public void init()
    {
        System.out.println("init method  called !!!");
    }
    public void destroy()
    {
        System.out.println("destroy method  called !!!");
    }
    @Override
    public String toString() {
        return "Hostel [student=" + student.getName() + "]";
    }
}
