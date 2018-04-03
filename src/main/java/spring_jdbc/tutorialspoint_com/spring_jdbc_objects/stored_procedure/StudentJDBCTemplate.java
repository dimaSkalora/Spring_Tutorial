package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.stored_procedure;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.Map;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public Student getStudent(Integer id) {
        StudentProcedure studentProcedure = new StudentProcedure(dataSource, "getRecord");
        return studentProcedure.execute(id);
    }
}
class StudentProcedure extends StoredProcedure {
    public StudentProcedure(DataSource dataSource, String procedureName) {
        super(dataSource,procedureName);
        declareParameter(new SqlParameter("in_id", Types.INTEGER));
        declareParameter(new SqlOutParameter("out_name", Types.VARCHAR));
        declareParameter(new SqlOutParameter("out_age", Types.INTEGER));
        compile();
    }
    public Student execute(Integer id){
        Map<String, Object> out = super.execute(id);
        Student student = new Student();
        student.setId(id);
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_age"));
        return student;
    }
}