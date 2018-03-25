package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.result_set_extractor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("SpringJDBC/tutorialspoint_com/Spring_JDBC_Objects/Result_Set_Extractor/resultSetExtractor-beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        List<Student> students = studentJDBCTemplate.listStudents();

        for(Student student: students){
            System.out.print("ID : " + student.getId() );
            System.out.println(", Age : " + student.getAge());
        }
    }
}
