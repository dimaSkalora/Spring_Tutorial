package spring_framework.wideskills_com.lesson_10.java_config;

public class Person {
    private static Person person = new Person();
    private Person()
    {
    }
    private String name ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static Person getInstance()
    {
        return person;
    }
}
