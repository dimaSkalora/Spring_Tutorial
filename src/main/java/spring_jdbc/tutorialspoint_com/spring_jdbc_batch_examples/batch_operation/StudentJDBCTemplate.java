package spring_jdbc.tutorialspoint_com.spring_jdbc_batch_examples.batch_operation;

import java.sql.PreparedStatement;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
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
        List <Student> students = jdbcTemplateObject.query(SQL,
                new StudentMapper());
        return students;
    }
    public void batchUpdate(final List<Student> students){
        String SQL = "update student_tutorialspoint_com set age = ? where id = ?";
        int[] updateCounts = jdbcTemplateObject.batchUpdate(SQL,
                new BatchPreparedStatementSetter() {

                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setInt(1, students.get(i).getAge());
                        ps.setInt(2, students.get(i).getId());
                    }
                    public int getBatchSize() {
                        return students.size();
                    }
                });
        System.out.println("Records updated!");
    }
}