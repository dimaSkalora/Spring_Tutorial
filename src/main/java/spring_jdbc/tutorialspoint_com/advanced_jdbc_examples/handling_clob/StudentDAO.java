package spring_jdbc.tutorialspoint_com.advanced_jdbc_examples.handling_clob;

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
