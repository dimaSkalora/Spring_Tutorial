package spring_jdbc.tutorialspoint_com.basic_crud_examples.create_query;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    void setDataSource(DataSource dataSource);
    void create(String name, Integer age);
    List<Student> listStudents();
}
