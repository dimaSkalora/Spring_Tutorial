package spring_framework.wideskills_com.lesson_15.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_framework.wideskills_com.lesson_15.xml.post_construct.Student;

public class TestPostConstructPreDestroy {
    public static void main(String args[])
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_15/postConstruct-beans.xml");
        Student student  = (Student) context.getBean("student");
        System.out.println(student);
        ((AbstractApplicationContext)context).destroy();
    }
}
