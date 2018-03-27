package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.simple_jdbc_insert;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    SimpleJdbcInsert jdbcInsert;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
        this.jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("student_tutorialspoint_com");
    }
    public void create(String name, Integer age) {
        Map<String,Object> parameters = new HashMap<String,Object>();
        parameters.put("name", name);
        parameters.put("age", age);

        jdbcInsert.execute(parameters);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }
    public List<Student> listStudents() {
        String SQL = "select * from student_tutorialspoint_com";
        List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }
}