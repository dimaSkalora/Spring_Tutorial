package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.named_parameter_jdbc_template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("SpringJDBC/tutorialspoint_com/Spring_JDBC_Objects/Named_Parameter_Jdbc_Template/namedParameterJdbcTemplate-beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        studentJDBCTemplate.updateDescription(1,
                "This can be a very long text upto 4 GB of size.");
    }
}
