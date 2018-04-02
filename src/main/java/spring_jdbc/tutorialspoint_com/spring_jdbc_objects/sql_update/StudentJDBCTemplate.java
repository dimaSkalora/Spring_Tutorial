package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.sql_update;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.sql.Types;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void update(Integer id, Integer age){
        String SQL = "update student_tutorialspoint_com set age = ? where id = ?";

        SqlUpdate sqlUpdate = new SqlUpdate(dataSource,SQL);
        sqlUpdate.declareParameter(new SqlParameter("age", Types.INTEGER));
        sqlUpdate.declareParameter(new SqlParameter("id", Types.INTEGER));
        sqlUpdate.compile();

        sqlUpdate.update(age.intValue(),id.intValue());
        System.out.println("Updated Record with ID = " + id );
        return;
    }
    public Student getStudent(Integer id) {
        String SQL = "select * from student_tutorialspoint_com where id = ?";
        Student student = jdbcTemplateObject.queryForObject(
                SQL, new Object[]{id}, new StudentMapper());

        return student;
    }
}