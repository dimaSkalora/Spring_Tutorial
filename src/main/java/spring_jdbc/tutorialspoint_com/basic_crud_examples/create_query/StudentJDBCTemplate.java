package spring_jdbc.tutorialspoint_com.basic_crud_examples.create_query;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplate= new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String insertQuery = "INSERT INTO student_tutorialspoint_com (NAME,AGE) VALUES(?,?) ";
        jdbcTemplate.update(insertQuery,name,age);
        System.out.println("Create Record Name = "+name+" Age = "+age);
        return;
    }

    @Override
    public List<Student> listStudents() {
        String SQL = "SELECT * FROM student_tutorialspoint_com";
        List<Student> students = jdbcTemplate.query(SQL,new StudentMapper());
        return students;
    }
}
