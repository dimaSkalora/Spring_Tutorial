package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.result_set_extractor;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List <Student> students = jdbcTemplateObject.query(SQL,
                new ResultSetExtractor<List<Student>>(){

                    public List<Student> extractData(
                            ResultSet rs) throws SQLException, DataAccessException {

                        List<Student> list = new ArrayList<Student>();
                        while(rs.next()){
                            Student student = new Student();
                            student.setId(rs.getInt("id"));
                            student.setName(rs.getString("name"));
                            student.setAge(rs.getInt("age"));
                            list.add(student);
                        }
                        return list;
                    }
                });
        return students;
    }
}