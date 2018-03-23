package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.jdbc_template_class;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("SpringJDBC/tutorialspoint_com/Spring_JDBC_Objects/Jdbc_Template_Class/jdbcTemplateClass-beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();

        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }
    }
}
