package spring_jdbc.tutorialspoint_com.basic_crud_examples.read_query;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    void setDataSource(DataSource dataSource);
    List<Student> listStudents();
}
