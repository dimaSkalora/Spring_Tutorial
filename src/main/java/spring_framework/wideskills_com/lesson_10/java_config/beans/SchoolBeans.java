package spring_framework.wideskills_com.lesson_10.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_10.java_config.School;
import spring_framework.wideskills_com.lesson_10.java_config.Student;

@Configuration
public class SchoolBeans {
    @Bean
    public Student student(){
        Student student = new Student();
        student.setName("opiouiu");

        return student;
    }

    @Bean
    public School school(){
        student();
        School school =new School();
        school.setName("School name");
        school.getStudent();
        return school;
    }

}
