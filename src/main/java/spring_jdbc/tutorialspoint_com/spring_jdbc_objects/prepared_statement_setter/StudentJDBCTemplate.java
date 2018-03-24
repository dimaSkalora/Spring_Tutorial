package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.prepared_statement_setter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public Student getStudent(final Integer id) {
        final String SQL = "select * from student_tutorialspoint_com where id = ? ";
        List <Student> students = jdbcTemplateObject.query(
                SQL, new PreparedStatementSetter() {

                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, id);
                    }
                },
                new StudentMapper());
        return students.get(0);
    }
}