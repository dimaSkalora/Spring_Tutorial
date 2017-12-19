package spring_framework.tutorialspoint_com.lesson_22.xml.programmatic_transaction;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    private PlatformTransactionManager transactionManager;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
    public void create(String name, Integer age, Integer marks, Integer year){
        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);

        try {
            String SQL1 = "insert into student_tutorialspoint_com (name, age) values (?, ?)";
            jdbcTemplateObject.update( SQL1, name, age);

            // Get the latest student id to be used in Marks table
            String SQL2 = "select max(id) from student_tutorialspoint_com";
            int sid = jdbcTemplateObject.queryForObject( SQL2 ,Integer.class);

            String SQL3 = "insert into marks_tutorialspoint_com(sid, marks, year) " + "values (?, ?, ?)";
            jdbcTemplateObject.update( SQL3, sid, marks, year);

            System.out.println("Created Name = " + name + ", Age = " + age);
            transactionManager.commit(status);
        }
        catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            transactionManager.rollback(status);
            throw e;
        }
        return;
    }
    public List<StudentMarks> listStudents() {
        String SQL = "select * from student_tutorialspoint_com, marks_tutorialspoint_com " +
                "where student_tutorialspoint_com.id=marks_tutorialspoint_com.sid";
        List <StudentMarks> studentMarks = jdbcTemplateObject.query(SQL,
                new StudentMarksMapper());

        return studentMarks;
    }
}
