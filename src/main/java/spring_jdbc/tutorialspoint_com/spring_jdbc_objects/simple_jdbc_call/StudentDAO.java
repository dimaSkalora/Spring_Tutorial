package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.simple_jdbc_call;

import javax.sql.DataSource;

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
