package spring_jdbc.tutorialspoint_com.advanced_jdbc_examples.calling_stored_procedure;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public Student getStudent(Integer id);
}
