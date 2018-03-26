package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.named_parameter_jdbc_template;

import javax.sql.DataSource;

public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to update
     * a record into the Student table.
     */
    public void updateDescription(Integer id, String description);
}
