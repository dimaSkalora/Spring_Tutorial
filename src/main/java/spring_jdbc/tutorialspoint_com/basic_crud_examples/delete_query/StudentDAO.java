package spring_jdbc.tutorialspoint_com.basic_crud_examples.delete_query;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    void setDataSource(DataSource dataSource);
    void delete(Integer id);
    List<Student> listStudents();
}
