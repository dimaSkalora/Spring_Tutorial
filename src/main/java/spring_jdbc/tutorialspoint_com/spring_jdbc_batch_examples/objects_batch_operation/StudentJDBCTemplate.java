package spring_jdbc.tutorialspoint_com.spring_jdbc_batch_examples.objects_batch_operation;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

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
        String SQL = "update student_tutorialspoint_com set age = :age where id = :id";
        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(students.toArray());
        NamedParameterJdbcTemplate jdbcTemplateObject = new
                NamedParameterJdbcTemplate(dataSource);

        int[] updateCounts = jdbcTemplateObject.batchUpdate(SQL,batch);
        System.out.println("Records updated!");
    }
}