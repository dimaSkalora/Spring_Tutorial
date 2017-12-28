package spring_framework.wideskills_com.lesson_15.xml.post_construct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
    private String name ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void init()
    {
        System.out.println("init method annotated with @PostConstruct called !!!");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("destroy method annotated with @preDestroy called !!!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
