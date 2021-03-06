package spring_jdbc.tutorialspoint_com.spring_jdbc_batch_examples.multiple_batches_operation;

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
     * all the records from the Student table.
     */
    public List<Student> listStudents();

    public void batchUpdate(final List<Student> students);
}
