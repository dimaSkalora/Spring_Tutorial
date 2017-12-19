package spring_framework.tutorialspoint_com.lesson_22.xml.declarative_transaction;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void create(String name, Integer age, Integer marks, Integer year){
        try {
            String SQL1 = "insert into student_tutorialspoint_com (name, age) values (?, ?)";
            jdbcTemplateObject.update( SQL1, name, age);

            // Get the latest student id to be used in Marks table
            String SQL2 = "select max(id) from student_tutorialspoint_com";
            int sid = jdbcTemplateObject.queryForObject( SQL2 ,Integer.class);

            String SQL3 = "insert into marks_tutorialspoint_com(sid, marks, year) " + "values (?, ?, ?)";
            jdbcTemplateObject.update( SQL3, sid, marks, year);

            System.out.println("Created Name = " + name + ", Age = " + age);
            // to simulate the exception.
            throw new RuntimeException("simulate Error condition") ;
        }
        catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            throw e;
        }
    }
    public List<StudentMarks> listStudents() {
        String SQL = "select * from student_tutorialspoint_com, marks_tutorialspoint_com " +
                "where student_tutorialspoint_com.id=marks_tutorialspoint_com.sid";
        List <StudentMarks> studentMarks = jdbcTemplateObject.query(SQL,
                new StudentMarksMapper());

        return studentMarks;
    }
}
