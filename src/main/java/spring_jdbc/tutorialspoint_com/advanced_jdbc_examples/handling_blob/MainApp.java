package spring_jdbc.tutorialspoint_com.advanced_jdbc_examples.handling_blob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("SpringJDBC/tutorialspoint_com/Advanced_JDBC_Examples/Handling_BLOB/handlingBLOB-beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");


        byte[] imageData = {0,1,0,8,20,40,95};
        studentJDBCTemplate.updateImage(1, imageData);
    }
}
