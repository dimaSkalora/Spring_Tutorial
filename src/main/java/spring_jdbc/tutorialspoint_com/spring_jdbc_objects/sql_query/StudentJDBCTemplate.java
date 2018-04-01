package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.sql_query;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.object.SqlQuery;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public List<Student> listStudents() {
        String sql = "select * from student_tutorialspoint_com";
        SqlQuery<Student> sqlQuery = new SqlQuery<Student>() {
            @Override
            protected RowMapper<Student> newRowMapper(Object[] parameters, Map<?, ?> context){

                return new StudentMapper();
            }
        };
        sqlQuery.setDataSource(dataSource);
        sqlQuery.setSql(sql);
        List <Student> students = sqlQuery.execute();
        return students;
    }
}