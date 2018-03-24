package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.prepared_statement_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("SpringJDBC/tutorialspoint_com/Spring_JDBC_Objects/Prepared_Statement_Setter/preparedStatementSetter-beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        Student student = studentJDBCTemplate.getStudent(1);
        System.out.print("ID : " + student.getId() );
        System.out.println(", Age : " + student.getAge());
    }
}
