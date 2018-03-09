package spring_jdbc.tutorialspoint_com.spring_jdbc_tutorial.lesson_01;

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
    public void create(String name, Integer age) {
        String SQL = "insert into student_tutorialspoint_com (name, age) values (?, ?)";

        jdbcTemplateObject.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    @Override
    public Student getStudent(Integer id) {
        return null;
    }

    public List<Student> listStudents() {
        String SQL = "select * from student_tutorialspoint_com";
        List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }
}
