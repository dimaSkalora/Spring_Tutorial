package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.jdbc_template_class;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public List<Student> listStudents() {
        String SQL = "select * from student_tutorialspoint_com";
        List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }
}