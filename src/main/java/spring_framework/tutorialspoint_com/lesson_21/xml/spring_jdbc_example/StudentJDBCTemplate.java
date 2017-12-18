package spring_framework.tutorialspoint_com.lesson_21.xml.spring_jdbc_example;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate= new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String SQL = "INSERT INTO student_tutorialspoint_com(name,age) values(?,?)";
        jdbcTemplate.update(SQL,name,age);
        System.out.println("Created Record Name = "+name+" Age = "+age);
        return;
    }

    @Override
    public Student getStudent(Integer id) {
        String SQL ="SELECT * FROM student_tutorialspoint_com WHERE id=?";
        Student student = jdbcTemplate.queryForObject(SQL,
                new Object[]{id}, new StudentMapper());

        return student;
    }

    @Override
    public List<Student> listStudents() {
        String SQL = "SELECT * FROM student_tutorialspoint_com";
        List<Student> students = jdbcTemplate.query(SQL,new StudentMapper());
        return students;
    }

    @Override
    public void delete(Integer id) {
        String SQL = "DELETE FROM student_tutorialspoint_com WHERE id=?";
        jdbcTemplate.update(SQL,id);
        System.out.println("Deleted Record with ID= "+id);
        return;
    }

    @Override
    public void update(Integer id, Integer age) {
        String SQL = "UPDATE student_tutorialspoint_com SET age=? WHERE id=?";
        jdbcTemplate.update(SQL,age,id);
        System.out.println("Update Record with ID = "+id);
    }
}
