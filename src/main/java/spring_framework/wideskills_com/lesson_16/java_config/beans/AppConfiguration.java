package spring_framework.wideskills_com.lesson_16.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring_framework.wideskills_com.lesson_16.java_config.Hostel;
import spring_framework.wideskills_com.lesson_16.java_config.Student;

@Configuration
public class AppConfiguration {
    public AppConfiguration()
    {
    }

    @Bean(name="student")
    @Scope("prototype")
    public Student getStudent()
    {
       Student student = new Student();
       student.setName("Student A");
       return student;
    }

    @Bean( initMethod="init",destroyMethod = "destroy")
    public Hostel hostel()
    {
        return new Hostel(getStudent());
    }
}
