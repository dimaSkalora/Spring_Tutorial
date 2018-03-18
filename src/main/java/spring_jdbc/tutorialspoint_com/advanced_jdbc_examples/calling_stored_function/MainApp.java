package spring_jdbc.tutorialspoint_com.advanced_jdbc_examples.calling_stored_function;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("SpringJDBC/tutorialspoint_com/Advanced_JDBC_Examples/Calling_Stored_Function/callingStoredFunction-beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");


        Student student = studentJDBCTemplate.getStudent(1);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
    }
}
