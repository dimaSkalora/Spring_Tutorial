package spring_framework.wideskills_com.lesson_10.xml;

public class School {
    private String name ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student getStudent()
    {
        return new Student();
    }
}
