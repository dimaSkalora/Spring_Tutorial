package spring_framework.wideskills_com.lesson_10.java_config;

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

    @Override
    public String toString() {
        return "School{" +
                "name='" + name +" getStudent= "+getStudent()+ '\'' +
                '}';
    }
}
