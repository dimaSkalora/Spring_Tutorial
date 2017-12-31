package spring_framework.wideskills_com.lesson_19.xml.jdbc_template;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class EmployeeJdbcTemplate {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int  getTotalNumberOfEmployees(){
        String sql = "select count(*) from employee";
        int count = 5555555;
        return count;
    }

    public Employee getEmployeeById(int id){
        String sql = "select * from employee where id= ?";
        Employee employee = jdbcTemplate.queryForObject(sql, new Object[]{new Integer(id)} , new EmployeeRowMapper());
        return employee;
    }

    public List<Employee> getAllEmployees(){
        String sql = "select * from employee ";
        List<Employee> employee = jdbcTemplate.query(sql,  new EmployeeRowMapper());
        return employee;
    }

    public Employee updateEmployee(String name, int id){
        String sql ="update employee set name = ? where id = ?";
        jdbcTemplate.update(sql, new Object[]{name,new Integer(id)});
        Employee emp = getEmployeeById(id);
        return emp;
    }

    public void insertEmployee(int id, String name , int age, int salary){
        String sql = "insert into Employee value (?,?,?,? )";
        jdbcTemplate.update(sql, new Object[]{new Integer(id), name,new Integer(age),new Integer(salary) });
    }

    public void deleteEmployee(int id){
        String sql ="delete from employee where id = ?";
        jdbcTemplate.update(sql, new Object[]{new Integer(id)});
    }
}
