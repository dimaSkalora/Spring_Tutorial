package spring_jdbc.tutorialspoint_com.spring_jdbc_batch_examples.multiple_batches_operation;

import java.sql.PreparedStatement;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;

import java.sql.SQLException;

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
    public void batchUpdate(final List<Student> students){
        String SQL = "update student_tutorialspoint_com set age = ? where id = ?";
        int[][] updateCounts = jdbcTemplateObject.batchUpdate(SQL,students,1,
                new ParameterizedPreparedStatementSetter<Student>() {

                    public void setValues(PreparedStatement ps, Student student)
                            throws SQLException {
                        ps.setInt(1, student.getAge());
                        ps.setInt(2, student.getId());
                    }
                });
        System.out.println("Records updated!");
    }
}