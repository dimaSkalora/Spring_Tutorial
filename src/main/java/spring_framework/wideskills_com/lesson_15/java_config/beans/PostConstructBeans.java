package spring_framework.wideskills_com.lesson_15.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_15.java_config.post_construct.Student;

@Configuration
public class PostConstructBeans {
    @Bean
    public Student student(){
        Student student = new Student();
        student.setName("Student A");

        return student;
    }
}
