package spring_jdbc.tutorialspoint_com.basic_crud_examples.delete_query;

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
    public void delete(Integer id) {
        String SQL = "DELETE FROM student_tutorialspoint_com WHERE ID = ?";
        jdbcTemplate.update(SQL,id);
        System.out.println("Deleted Record with ID = "+id);
    }

    @Override
    public List<Student> listStudents() {
        String SQL = "SELECT * FROM student_tutorialspoint_com";
        List<Student> students = jdbcTemplate.query(SQL,new StudentMapper());
        return students;
    }
}
