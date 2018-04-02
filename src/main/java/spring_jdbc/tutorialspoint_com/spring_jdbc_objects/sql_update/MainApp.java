package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.sql_update;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("SpringJDBC/tutorialspoint_com/Spring_JDBC_Objects/Sql_Update/sqlUpdate-beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        System.out.println("----Updating Record with ID = 1 -----" );
        studentJDBCTemplate.update(1, 10);

        System.out.println("----Listing Record with ID = 1 -----" );
        Student student = studentJDBCTemplate.getStudent(1);

        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
    }
}
