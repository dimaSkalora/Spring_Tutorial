package spring_jdbc.tutorialspoint_com.basic_crud_examples.update_query;

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
    public void update(Integer id, Integer age) {
        String SQL="UPDATE student_tutorialspoint_com SET AGE = ? WHERE ID = ?";
        jdbcTemplate.update(SQL,age,id);
        System.out.println("Updated Record with ID= "+id);
        return;
    }

    @Override
    public Student getStudent(Integer id) {
        String SQL ="SELECT * FROM student_tutorialspoint_com WHERE ID = ?";
        Student student = jdbcTemplate.queryForObject(SQL,new Object[]{id},new StudentMapper());
        return student;
    }


}
