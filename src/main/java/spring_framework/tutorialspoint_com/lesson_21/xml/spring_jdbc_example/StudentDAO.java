package spring_framework.tutorialspoint_com.lesson_21.xml.spring_jdbc_example;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    void setDataSource(DataSource dataSource);
    void create(String name, Integer age);
    Student getStudent(Integer id);
    List<Student> listStudents();
    void delete(Integer id);
    void update(Integer id, Integer age);
}
