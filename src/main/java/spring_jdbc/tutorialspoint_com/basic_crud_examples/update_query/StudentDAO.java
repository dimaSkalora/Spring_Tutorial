package spring_jdbc.tutorialspoint_com.basic_crud_examples.update_query;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    void setDataSource(DataSource dataSource);
    void update(Integer id, Integer age);
    Student getStudent(Integer id);
}
