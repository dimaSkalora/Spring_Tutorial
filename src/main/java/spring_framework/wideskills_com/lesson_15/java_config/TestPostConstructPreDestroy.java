package spring_framework.wideskills_com.lesson_15.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring_framework.wideskills_com.lesson_15.java_config.beans.PostConstructBeans;
import spring_framework.wideskills_com.lesson_15.java_config.post_construct.Student;

public class TestPostConstructPreDestroy {
    public static void main(String args[])
    {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(PostConstructBeans.class);
        Student student  = (Student) context.getBean("student");
        System.out.println(student);
        ((AbstractApplicationContext)context).destroy();
    }
}
