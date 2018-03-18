package spring_jdbc.tutorialspoint_com.advanced_jdbc_examples.calling_stored_function;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.Map;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplate= new JdbcTemplate(dataSource);
    }

    @Override
    public Student getStudent(Integer id) {
        SimpleJdbcCall jdbcCall = new
                SimpleJdbcCall(dataSource).withFunctionName("get_student_name");

        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
        String name = jdbcCall.executeFunction(String.class, in);
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }


}
