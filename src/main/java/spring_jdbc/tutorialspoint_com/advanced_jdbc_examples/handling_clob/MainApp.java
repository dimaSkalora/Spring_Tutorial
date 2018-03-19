package spring_jdbc.tutorialspoint_com.advanced_jdbc_examples.handling_clob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("SpringJDBC/tutorialspoint_com/Advanced_JDBC_Examples/Handling_CLOB/handlingCLOB-beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");


        studentJDBCTemplate.updateDescription(1,
                "This can be a very long text upto 4 GB of size.");
    }
}
