package spring_framework.wideskills_com.lesson_15.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_15.java_config.required.Student;

@Configuration
public class RequiredBeans {
    @Bean
    public Student studentBean(){
        Student student = new Student();
        student.setName("Student A");

        return student;
    }
}
